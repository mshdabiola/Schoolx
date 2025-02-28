/*
 *abiola 2024
 */

package com.mshdabiola.designsystem.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.component.SchoolxBackground
import com.mshdabiola.designsystem.component.SchoolxButton
import com.mshdabiola.designsystem.icon.SchoolxIcons
import com.mshdabiola.designsystem.theme.SchoolxTheme

@ThemePreviews
@Composable
fun ButtonPreview() {
    SchoolxTheme {
        SchoolxBackground(modifier = Modifier.size(150.dp, 50.dp)) {
            SchoolxButton(onClick = {}, text = { Text("Test button") })
        }
    }
}

@ThemePreviews
@Composable
fun ButtonPreview2() {
    SchoolxTheme {
        SchoolxBackground(modifier = Modifier.size(150.dp, 50.dp)) {
            SchoolxButton(onClick = {}, text = { Text("Test button") })
        }
    }
}

@ThemePreviews
@Composable
fun ButtonLeadingIconPreview() {
    SchoolxTheme {
        SchoolxBackground(modifier = Modifier.size(150.dp, 50.dp)) {
            SchoolxButton(
                onClick = {},
                text = { Text("Test button") },
                leadingIcon = { Icon(imageVector = SchoolxIcons.Add, contentDescription = null) },
            )
        }
    }
}
