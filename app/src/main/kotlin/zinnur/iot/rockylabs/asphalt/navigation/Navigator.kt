package zinnur.iot.rockylabs.asphalt.navigation

import android.view.View
import com.bluelinelabs.conductor.ControllerChangeHandler
import com.bluelinelabs.conductor.Router
import com.bluelinelabs.conductor.RouterTransaction
import com.bluelinelabs.conductor.changehandler.*
import zinnur.iot.rockylabs.asphalt.UI.controllers.SignInController
import zinnur.iot.rockylabs.asphalt.UI.controllers.SignUpController
import zinnur.iot.rockylabs.asphalt.UI.controllers.TrackingController
import zinnur.iot.rockylabs.asphalt.UI.controllers.WelcomeController

/**
 * Created by Zinnur on 10.02.17.
 */

interface Navigator {

    val router: Router

    fun showSignIn(){
        val handler = AutoTransitionChangeHandler()
        router.pushController(RouterTransaction.with(SignInController())
                .pushChangeHandler(handler)
                .popChangeHandler(handler)
        )
    }

    fun showSignUp(){
        val handler = AutoTransitionChangeHandler()
        router.pushController(RouterTransaction.with(SignUpController())
                .pushChangeHandler(handler)
                .popChangeHandler(handler)
        )
    }

    fun showTracking(root: Boolean){
        val handler = AutoTransitionChangeHandler()
        if (root){
            router.setRoot(RouterTransaction.with(TrackingController())
                    .popChangeHandler(handler)
                    .pushChangeHandler(handler))
        } else {
            router.pushController(RouterTransaction.with(TrackingController())
                    .popChangeHandler(handler)
                    .pushChangeHandler(handler))
        }
    }

    fun showWelcome(root: Boolean){
        val handler = AutoTransitionChangeHandler()
        if (root) {
            router.setRoot(RouterTransaction.with(WelcomeController())
                    .popChangeHandler(handler)
                    .pushChangeHandler(handler)
            )
        } else {
            router.pushController(RouterTransaction.with(WelcomeController())
                    .popChangeHandler(handler)
                    .pushChangeHandler(handler)
            )
        }
    }
}