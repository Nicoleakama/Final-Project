@file:Suppress("PreviewMustBeTopLevelFunction")

package net.ezra.ui.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.navigation.ROUTE_WELCOME

@Composable
fun WelcomeScreen(navController: NavHostController) {
LazyColumn(
    modifier = Modifier
        .background(color = Color.White)
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(start = 10.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
) {
    item {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(painter = painterResource(id = R.drawable.job),
                contentDescription ="" ,
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.Crop)
        }


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .fillMaxSize()
                .padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center


        ) {
            Text(text = "Welcome to Hire Hub",

                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black,
                fontSize = 25.sp
            )


            Spacer(modifier = Modifier.height(15.dp))


            Text(text = "We strive to help you elevate your career",

                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                fontSize = 15.sp
            )


            Spacer(modifier = Modifier.height(20.dp))



            Text(text = "Create an account to get started",

                textAlign = TextAlign.Center,
                color = Color.Black,
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(15.dp))


            Button(onClick =
            { navController.navigate(ROUTE_SIGNUP) {
                popUpTo(ROUTE_WELCOME) { inclusive = true }
            } },
                colors = ButtonDefaults.buttonColors(Color(0xFF6200EE)),

                shape = RoundedCornerShape(15.dp)

            ) {

                Text(text = "Sign Up",
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    modifier = Modifier.width(100.dp)
                    )

            }

            Spacer(modifier = Modifier.height(15.dp))



            Text(text = "Already have an account ?",

                textAlign = TextAlign.Center,
                color = Color.Black,
                fontSize = 15.sp
            )


            Spacer(modifier = Modifier.height(15.dp))


            Button(onClick =
            { navController.navigate(ROUTE_LOGIN) {
                popUpTo(ROUTE_WELCOME) { inclusive = true }
            } },

                colors = ButtonDefaults.buttonColors(Color(0xFF6200EE)),

                shape = RoundedCornerShape(15.dp)

            ) {

                Text(text = "Login",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.width(100.dp))

            }



        }




















    }
}








}
   @Preview(showBackground = true)
@Composable
fun PreviewLight() {
    WelcomeScreen(rememberNavController())
}

