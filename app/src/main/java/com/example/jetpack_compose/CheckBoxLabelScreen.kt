package com.example.jetpack_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CheckBoxLabelScreen(
    onLogout: () -> Unit = {}
) {
    var isMadChecked by remember { mutableStateOf(false) }
    var isWebChecked by remember { mutableStateOf(false) }
    var isDsaChecked by remember { mutableStateOf(false) }

    var isBeginnerChecked by remember { mutableStateOf(true) }
    var isIntermediateChecked by remember { mutableStateOf(false) }
    var isAdvancedChecked by remember { mutableStateOf(false) }

    var isTermsAgreed by remember { mutableStateOf(false) }
    val isAllChecked = isMadChecked && isWebChecked && isDsaChecked

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF13141D))
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(35.dp))

        // GUNI Logo
        Image(
            painter = painterResource(id = R.drawable.guni_pink_logo),
            contentDescription = "GUNI Logo",
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "CheckBox Label Selection",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Card 1: Multi-level Subject Checkboxes
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF353847))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Select Subjects",
                    color = Color(0xFFEC407A),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(8.dp))

                // Select All Checkbox
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = isAllChecked,
                        onCheckedChange = { checked ->
                            isMadChecked = checked
                            isWebChecked = checked
                            isDsaChecked = checked
                        },
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color(0xFFEC407A),
                            uncheckedColor = Color(0xFFC5C8D8)
                        )
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Select All Subjects",
                        color = Color.White,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                // Sub Checkboxes
                Column(modifier = Modifier.padding(start = 24.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = isMadChecked,
                            onCheckedChange = { isMadChecked = it },
                            colors = CheckboxDefaults.colors(
                                checkedColor = Color(0xFFA6C0FF),
                                uncheckedColor = Color(0xFF8E92A4)
                            )
                        )
                        Text(
                            text = "Mobile Application Development",
                            color = Color(0xFFC5C8D8),
                            fontSize = 14.sp
                        )
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = isWebChecked,
                            onCheckedChange = { isWebChecked = it },
                            colors = CheckboxDefaults.colors(
                                checkedColor = Color(0xFFA6C0FF),
                                uncheckedColor = Color(0xFF8E92A4)
                            )
                        )
                        Text(
                            text = "Web Development",
                            color = Color(0xFFC5C8D8),
                            fontSize = 14.sp
                        )
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = isDsaChecked,
                            onCheckedChange = { isDsaChecked = it },
                            colors = CheckboxDefaults.colors(
                                checkedColor = Color(0xFFA6C0FF),
                                uncheckedColor = Color(0xFF8E92A4)
                            )
                        )
                        Text(
                            text = "Data Structures & Algorithms",
                            color = Color(0xFFC5C8D8),
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Card 2: Skill Levels
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF353847))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Select Level",
                    color = Color(0xFFEC407A),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = isBeginnerChecked,
                        onCheckedChange = { isBeginnerChecked = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color(0xFFA6C0FF),
                            uncheckedColor = Color(0xFF8E92A4)
                        )
                    )
                    Text(text = "Beginner", color = Color(0xFFC5C8D8), fontSize = 14.sp)
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = isIntermediateChecked,
                        onCheckedChange = { isIntermediateChecked = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color(0xFFA6C0FF),
                            uncheckedColor = Color(0xFF8E92A4)
                        )
                    )
                    Text(text = "Intermediate", color = Color(0xFFC5C8D8), fontSize = 14.sp)
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = isAdvancedChecked,
                        onCheckedChange = { isAdvancedChecked = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color(0xFFA6C0FF),
                            uncheckedColor = Color(0xFF8E92A4)
                        )
                    )
                    Text(text = "Advanced", color = Color(0xFFC5C8D8), fontSize = 14.sp)
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Terms Checkbox
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = isTermsAgreed,
                onCheckedChange = { isTermsAgreed = it },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color(0xFFEC407A),
                    uncheckedColor = Color(0xFF8E92A4)
                )
            )
            Text(
                text = "I agree to the Terms & Conditions",
                color = Color(0xFFC5C8D8),
                fontSize = 14.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { /* Submit Action */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            enabled = isTermsAgreed,
            shape = RoundedCornerShape(24.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFA6C0FF),
                disabledContainerColor = Color(0xFF4A4D5E)
            )
        ) {
            Text(
                text = "Submit Selection",
                color = if (isTermsAgreed) Color(0xFF1B1C28) else Color(0xFF8E92A4),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "LOGOUT",
            color = Color(0xFFEC407A),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.clickable { onLogout() }
        )

        Spacer(modifier = Modifier.height(30.dp))
    }
}
