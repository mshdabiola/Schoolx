/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import com.mshdabiola.designsystem.component.SchoolxIconToggleButton
import com.mshdabiola.designsystem.icon.SchoolxIcons
import com.mshdabiola.designsystem.theme.SchoolxTheme

@ThemePreviews
@Composable
fun IconButtonPreview() {
    SchoolxTheme {
        SchoolxIconToggleButton(
            checked = true,
            onCheckedChange = { },
            icon = {
                Icon(
                    imageVector = SchoolxIcons.BookmarkBorder,
                    contentDescription = null,
                )
            },
            checkedIcon = {
                Icon(
                    imageVector = SchoolxIcons.Bookmark,
                    contentDescription = null,
                )
            },
        )
    }
}

@ThemePreviews
@Composable
fun IconButtonPreviewUnchecked() {
    SchoolxTheme {
        SchoolxIconToggleButton(
            checked = false,
            onCheckedChange = { },
            icon = {
                Icon(
                    imageVector = SchoolxIcons.BookmarkBorder,
                    contentDescription = null,
                )
            },
            checkedIcon = {
                Icon(
                    imageVector = SchoolxIcons.Bookmark,
                    contentDescription = null,
                )
            },
        )
    }
}
