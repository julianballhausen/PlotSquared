rootProject.name = "plotsquared"

include("Core", "Bukkit")

project(":Core").name = "plotsquared-core"
project(":Bukkit").name = "plotsquared-bukkit"

enableFeaturePreview("VERSION_CATALOGS")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
