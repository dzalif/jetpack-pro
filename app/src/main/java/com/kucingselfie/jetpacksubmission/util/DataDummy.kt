package com.kucingselfie.jetpacksubmission.util

import com.kucingselfie.jetpacksubmission.R
import com.kucingselfie.jetpacksubmission.model.TVShow

object DataDummy {
    fun generateTvShows(): List<TVShow> {
        val tvShows = mutableListOf<TVShow>()
        tvShows.add(
            TVShow(
                0,
                "Arrow",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                R.drawable.poster_arrow
            )
        )
        tvShows.add(
            TVShow(
                1,
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                R.drawable.poster_flash
            )
        )
        tvShows.add(
            TVShow(
                2,
                "Dragon Ball",
                "A retelling of Dragon Ball's origin with a different take on the meeting of Goku, Bulma, and Kame-Sen'nin. It also retells the Red Ribbon Army story; but this time they find Goku rather than Goku finding them.",
                R.drawable.poster_dragon_ball
            )
        )
        tvShows.add(
            TVShow(
                3,
                "Naruto Shippuden",
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                R.drawable.poster_naruto_shipudden
            )
        )
        tvShows.add(
            TVShow(
                4,
                "Iron Fist",
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                R.drawable.poster_iron_fist
            )
        )
        tvShows.add(
            TVShow(
                5,
                "Supergirl",
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                R.drawable.poster_supergirl
            )
        )
        tvShows.add(
            TVShow(
                6,
                "Riverdale",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                R.drawable.poster_riverdale
            )
        )
        tvShows.add(
            TVShow(
                7,
                "The Simpson",
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                R.drawable.poster_the_simpson
            )
        )
        tvShows.add(
            TVShow(
                8,
                "The Umbrella Academy",
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                R.drawable.poster_the_umbrella
            )
        )
        tvShows.add(
            TVShow(
                9,
                "The Walking Dead",
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                R.drawable.poster_the_walking_dead
            )
        )
        return tvShows
    }
}