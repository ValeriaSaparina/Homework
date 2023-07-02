package com.example.homework3

object PlanetRepository {
    private const val DWARF = "Dwarf"
    private const val TERRESTRIAL = "Terrestrial"
    private const val GIANT_PLANET = "Giant Planet"
    private const val SOLAR_SYSTEM = "Planet in the Solar system"

    val list: List<Planet> = listOf(
        Planet(
            id = 0,
            name = "Mercury",
            desc = SOLAR_SYSTEM,
            type = TERRESTRIAL,
            radius = "2439.7 km",
            distFromTheSun = "45.9–88.0 million km",
            url = "https://t3.gstatic.com/licensed-image?q=tbn:ANd9GcTFFRKg1XEC7kNu58XVZi9vPh6F9ii0FhevCdEAUKyMEtSdx4HLLLNBMacXXX0Y0gLv"
        ),
        Planet(
            id = 1,
            name = "Venus",
            desc = SOLAR_SYSTEM,
            type = TERRESTRIAL,
            radius = "6051.8 km",
            distFromTheSun = "107.4–108.9 million km",
            url = "https://t0.gstatic.com/licensed-image?q=tbn:ANd9GcRtqGYOVmn7rlUHM47dO2MUGjjqp-NkClqUJ7QIxAwGAulcM5kvScQrZSkfglqd92ua"
        ),
        Planet(
            id = 2,
            name = "Earth",
            desc = SOLAR_SYSTEM,
            type = TERRESTRIAL,
            radius = "6371.0 km",
            distFromTheSun = "147.1–152.1 million km",
            url = "https://upload.wikimedia.org/wikipedia/commons/0/0d/Africa_and_Europe_from_a_Million_Miles_Away.png"
        ),
        Planet(
            id = 3,
            name = "Mars",
            desc = SOLAR_SYSTEM,
            type = TERRESTRIAL,
            radius = "3389.5",
            distFromTheSun = "206.7–249.2 million km",
            url = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/02/OSIRIS_Mars_true_color.jpg/300px-OSIRIS_Mars_true_color.jpg"
        ),

        Planet(
            id = 4,
            name = "Jupiter",
            desc = SOLAR_SYSTEM,
            type = GIANT_PLANET,
            radius = "69911.0 km",
            distFromTheSun = "206.7–249.2 million km",
            url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Jupiter%2C_image_taken_by_NASA%27s_Hubble_Space_Telescope%2C_June_2019_-_Edited.jpg/300px-Jupiter%2C_image_taken_by_NASA%27s_Hubble_Space_Telescope%2C_June_2019_-_Edited.jpg"
        ),
        Planet(
            id = 5,
            name = "Saturn",
            desc = SOLAR_SYSTEM,
            type = GIANT_PLANET,
            radius = "58232.0 km",
            distFromTheSun = "1.3576–1.5065 billion km",
            url = "https://t3.gstatic.com/licensed-image?q=tbn:ANd9GcQUNGwc8h9VqUTHCmp-42Ph6G4YbjA6N2sCxtCTjNgkCFuw0Ms5eZMzZDZI9y97Rh2I"
        ),
        Planet(
            id = 6,
            name = "Uranus",
            desc = SOLAR_SYSTEM,
            type = GIANT_PLANET,
            radius = "25262.0 km",
            distFromTheSun = "2.733–3.001 billion km",
            url = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/Uranus_as_seen_by_NASA%27s_Voyager_2_%28remastered%29_-_JPEG_converted.jpg/274px-Uranus_as_seen_by_NASA%27s_Voyager_2_%28remastered%29_-_JPEG_converted.jpg"
        ),
        Planet(
            id = 7,
            name = "Neptune",
            desc = SOLAR_SYSTEM,
            type = GIANT_PLANET,
            radius = "24622.0 km",
            distFromTheSun = "4.471–4.558 billion km",
            url = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/63/Neptune_-_Voyager_2_%2829347980845%29_flatten_crop.jpg/240px-Neptune_-_Voyager_2_%2829347980845%29_flatten_crop.jpg"
        ),

        Planet(
            id = 8,
            name = "Pluto",
            desc = SOLAR_SYSTEM,
            type = DWARF,
            radius = "1188.3 km",
            distFromTheSun = "5.8 billion km",
            url = "https://t2.gstatic.com/licensed-image?q=tbn:ANd9GcRwPMSqM0ilt8s2a2y1-NZH77zhtAj0er-mWkf6GbQtnfeS_MVioS7y-M_8xCN1_xLh"
        ),
    )
}