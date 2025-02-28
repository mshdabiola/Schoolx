/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.mshdabiola.designsystem.component.SchoolxLoadingWheel
import com.mshdabiola.designsystem.component.SchoolxOverlayLoadingWheel
import com.mshdabiola.designsystem.theme.SchoolxTheme

@ThemePreviews
@Composable
fun NiaLoadingWheelPreview() {
    SchoolxTheme {
        Surface {
            SchoolxLoadingWheel(contentDesc = "LoadingWheel")
        }
    }
}

@ThemePreviews
@Composable
fun NiaOverlayLoadingWheelPreview() {
    SchoolxTheme {
        Surface {
            SchoolxOverlayLoadingWheel(contentDesc = "LoadingWheel")
        }
    }
}

private const val ROTATION_TIME = 12000
private const val NUM_OF_LINES = 12
