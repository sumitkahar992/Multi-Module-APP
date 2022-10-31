package com.example.multi_module_app.navigaion

import com.example.common_utils.common_utils.Activities
import com.example.common_utils.common_utils.Navigator
import com.example.news_presentation.GoToNewsActivity
import com.example.search_presentation.GoToSearchActivity

class DefaultNavigator : Navigator.Provider {
    override fun getActivities(activities: Activities): Navigator {
        return when (activities) {
            Activities.NewsActivity -> {
                GoToNewsActivity
            }
            Activities.SearchActivity -> {
                GoToSearchActivity
            }
        }
    }
}