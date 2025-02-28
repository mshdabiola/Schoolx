/*
 *abiola 2024
 */

package com.mshdabiola.designsystem.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.component.SchoolxBackground
import com.mshdabiola.designsystem.component.SchoolxGradientBackground
import com.mshdabiola.designsystem.theme.SchoolxTheme

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, name = "Light theme")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, name = "Dark theme")
annotation class ThemePreviews

@ThemePreviews
@Composable
fun BackgroundDefault() {
    SchoolxTheme(disableDynamicTheming = true) {
        SchoolxBackground(Modifier.size(100.dp), content = {})
    }
}

@ThemePreviews
@Composable
fun BackgroundDynamic() {
    SchoolxTheme(disableDynamicTheming = false) {
        SchoolxBackground(Modifier.size(100.dp), content = {})
    }
}

@ThemePreviews
@Composable
fun BackgroundAndroid() {
    SchoolxTheme {
        SchoolxBackground(Modifier.size(100.dp), content = {})
    }
}

@ThemePreviews
@Composable
fun GradientBackgroundDefault() {
    SchoolxTheme(disableDynamicTheming = true) {
        SchoolxGradientBackground(Modifier.size(100.dp), content = {})
    }
}

@ThemePreviews
@Composable
fun GradientBackgroundDynamic() {
    SchoolxTheme(disableDynamicTheming = false) {
        SchoolxGradientBackground(Modifier.size(100.dp), content = {})
    }
}

@ThemePreviews
@Composable
fun GradientBackgroundAndroid() {
    SchoolxTheme {
        SchoolxGradientBackground(Modifier.size(100.dp), content = {})
    }
}
