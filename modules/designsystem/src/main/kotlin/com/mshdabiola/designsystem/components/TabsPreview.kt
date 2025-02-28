/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.component.SchoolxTab
import com.mshdabiola.designsystem.component.SchoolxTabRow
import com.mshdabiola.designsystem.theme.SchoolxTheme

@ThemePreviews
@Composable
fun TabsPreview() {
    SchoolxTheme {
        val titles = listOf("Topics", "People")
        SchoolxTabRow(selectedTabIndex = 0) {
            titles.forEachIndexed { index, title ->
                SchoolxTab(
                    selected = index == 0,
                    onClick = { },
                    text = { Text(text = title) },
                )
            }
        }
    }
}

object SkTabDefaults {
    val TabTopPadding = 7.dp
}
