package io.github.mg138.dropdisable

import eu.pb4.polymer.api.resourcepack.PolymerRPUtils
import net.fabricmc.api.DedicatedServerModInitializer
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

@Suppress("UNUSED")
object Main : DedicatedServerModInitializer {
    const val modId = "drop_disable"
    val logger: Logger = LogManager.getLogger(modId)

    override fun onInitializeServer() {
        PolymerRPUtils.addAssetSource(modId)

        //DropDisable.register()

        logger.info("Registered Grappling hook.")
    }
}