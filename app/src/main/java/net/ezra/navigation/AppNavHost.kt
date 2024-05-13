package net.ezra.navigation
import android.telecom.Call.Details
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.auth.LoginScreen
import net.ezra.ui.auth.SignUpScreen
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.Jobs.JobScreen
import net.ezra.ui.details.DetailsScreen
import net.ezra.ui.portfolio.PortfolioScreen
import net.ezra.ui.splash.SplashScreen
import net.ezra.ui.viewjob.ViewjobScreen
import net.ezra.ui.welcome.WelcomeScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH,



) {
    BackHandler {
        navController.popBackStack()

        }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {


        composable(ROUTE_LOGIN) {
            LoginScreen(navController){}
        }


        composable(ROUTE_SIGNUP) {
            SignUpScreen(navController){}
        }


        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }




        composable(ROUTE_DETAILS) {
            DetailsScreen(navController)
        }

        composable(ROUTE_JOBS) {
            JobScreen(navController)
        }



        composable(ROUTE_PORTFOLIO) {
            PortfolioScreen(navController)
        }

        composable(ROUTE_WELCOME) {
            WelcomeScreen(navController)
        }


        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUTE_VIEWJOBS) {
            ViewjobScreen(navController)
        }

































    }
}