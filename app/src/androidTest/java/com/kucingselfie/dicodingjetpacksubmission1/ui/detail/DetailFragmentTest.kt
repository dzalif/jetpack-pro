package com.kucingselfie.dicodingjetpacksubmission1.ui.detail

import android.os.Bundle
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.kucingselfie.dicodingjetpacksubmission1.R
import com.kucingselfie.dicodingjetpacksubmission1.model.DetailModel
import com.kucingselfie.dicodingjetpacksubmission1.ui.movie.DetailFragment
import com.kucingselfie.dicodingjetpacksubmission1.util.DataDummy.generateMovies
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class DetailFragmentTest {
    private val dummyMovies = generateMovies()[0]

    @Test
    fun openDetailFragment() {
        val model = DetailModel(
                0,
                "Alita: Battle Angle",
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                R.drawable.poster_alita
            )
        val args = Bundle().apply {
            putParcelable("model", model)
        }
        launchFragmentInContainer<DetailFragment>(args)
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTitle)).check(matches(withText(dummyMovies.title)))
    }

}