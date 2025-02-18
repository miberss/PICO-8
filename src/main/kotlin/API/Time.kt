package API

import org.luaj.vm2.Globals
import org.luaj.vm2.LuaValue
import org.luaj.vm2.lib.ZeroArgFunction

/*
 * PICO8
 * 
 * Created by mibers on 2/18/2025.
 */

fun TimeAPI(lua: Globals, time: Double) {
    lua.set("t", object : ZeroArgFunction() {
        override fun call(): LuaValue {
            val current = (System.currentTimeMillis().toDouble() / 1000)
            val since = current - time
            return LuaValue.valueOf(since)
        }
    })
    lua.set("time", object : ZeroArgFunction() {
        override fun call(): LuaValue {
            val current = (System.currentTimeMillis().toDouble() / 1000)
            val since = current - time
            return LuaValue.valueOf(since)
        }
    })
}