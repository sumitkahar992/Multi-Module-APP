package com.example.multi_module_app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.common_utils.common_utils.Activities
import com.example.common_utils.common_utils.Navigator
import com.example.news_domain.NewsDomainActivity
import com.example.search_domain.SearchDomainActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var provider: Navigator.Provider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                val context = LocalContext.current as Activity

                Button(onClick = {
                    provider.getActivities(Activities.NewsActivity).navigate(context)
                }) {

                    Text(text = "NEWS - ACTIVITY")
                }

                Button(onClick = {
                    provider.getActivities(Activities.SearchActivity).navigate(context)
                }) {
                    Text(text = "SEARCH - ACTIVITY")
                }


                // Without using Common Utils and Navigator

                Button(onClick = {
                    context.startActivity(Intent(context, NewsDomainActivity::class.java))
                }) {
                    Text(text = "News Domain Activity")
                }

                Button(onClick = {
                    context.startActivity(Intent(context, SearchDomainActivity::class.java))
                }) {
                    Text(text = "Search Domain Activity")
                }
            }












        }
    }
}

