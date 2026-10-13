package com.example.jetpack_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FormField
            ( label: String,
              value: String,
              onValueChange: (String) -> Unit, placeholder: String,
              modifier: Modifier = Modifier,
              visualTransformation: VisualTransformation = VisualTransformation.None, keyboardOptions: KeyboardOptions = KeyboardOptions.Default
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            color = Color(0xFFC5C8D8), fontSize = 14.sp,
            modifier = Modifier.weight(0.35f)
        )
        Box(
            modifier = Modifier
                .weight(0.65f)
                .height(44.dp)
                .background(Color(0xFF282A36), shape = RoundedCornerShape(8.dp))
                .border(1.dp, Color(0xFF454859), shape = RoundedCornerShape(8.dp))
                .padding(horizontal = 12.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            if (value.isEmpty()) { Text(
                text = placeholder,
                color = Color(0xFF7A7E93), fontSize = 13.sp
            )
            }
            BasicTextField( value = value,
                onValueChange = onValueChange,

                singleLine = true,
                visualTransformation = visualTransformation, keyboardOptions = keyboardOptions,
                textStyle = TextStyle(fontSize = 14.sp, color = Color.White), cursorBrush = SolidColor(Color.White),
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
