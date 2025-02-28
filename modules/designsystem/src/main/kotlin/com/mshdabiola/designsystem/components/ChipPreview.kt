/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.component.SchoolxBackground
import com.mshdabiola.designsystem.component.SchoolxFilterChip
import com.mshdabiola.designsystem.theme.SchoolxTheme

@ThemePreviews
@Composable
fun ChipPreview() {
    SchoolxTheme {
        SchoolxBackground(modifier = Modifier.size(80.dp, 20.dp)) {
            SchoolxFilterChip(selected = true, onSelectedChange = {}) {
                Text("Chip")
            }
        }
    }
}
