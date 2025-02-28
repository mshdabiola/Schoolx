/*
 *abiola 2023
 */

package com.mshdabiola.designsystem

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mshdabiola.designsystem.component.SchoolxLoadingWheel
import com.mshdabiola.designsystem.component.SchoolxOverlayLoadingWheel
import com.mshdabiola.testing.util.CaptureMultiTheme

class LoadingWheelScreenshotTests {

    @Preview
    @Composable
    fun LoadingWheel() {
        CaptureMultiTheme {
            SchoolxLoadingWheel(contentDesc = "test")
        }
    }

    @Preview
    @Composable
    fun OverlayLoadingWheel() {
        CaptureMultiTheme {
            SchoolxOverlayLoadingWheel(contentDesc = "test")
        }
    }
}
