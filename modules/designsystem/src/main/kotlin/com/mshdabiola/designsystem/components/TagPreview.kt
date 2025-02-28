/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.mshdabiola.designsystem.component.SchoolxTopicTag
import com.mshdabiola.designsystem.theme.SchoolxTheme

@ThemePreviews
@Composable
fun TagPreview() {
    SchoolxTheme {
        SchoolxTopicTag(followed = true, onClick = {}) {
            Text("Topic".uppercase())
        }
    }
}
