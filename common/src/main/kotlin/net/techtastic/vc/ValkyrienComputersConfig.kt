package net.techtastic.vc

import com.github.imifou.jsonschema.module.addon.annotation.JsonSchema

object ValkyrienComputersConfig {
    @JvmField
    val CLIENT = Client()

    @JvmField
    val SERVER = Server()

    class Client

    class Server {

        val ComputerCraft = COMPUTERCRAFT()

        class COMPUTERCRAFT {
            @JsonSchema(description = "Disable ComputerCraft Integration")
            val disableComputerCraft = false;

            @JsonSchema(description = "Disable Radars")
            val disableRadars = false

            @JsonSchema(description = "Disable Ship Readers")
            val disableShipReaders = false

            @JsonSchema(description = "Maximum Range of Radars")
            val maxRadarRadius = 256
        }

        val OpenComputers = OPENCOMPUTERS()

        class OPENCOMPUTERS {
            @JsonSchema(description = "Disabled OpenComputers Integration")
            val disableOpenComputers = false;
        }
    }
}
