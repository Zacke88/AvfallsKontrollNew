package kaa.avfallskontroll;

/**
 * Class that represents the camera and is able to start the camera to take
 * pictures which is saved on external storage. Thereafter pictures are
 * base64 encoded and sent back to the server socket and removed from
 * external storage.
 *
 * Ville inte snabbt göra något halvdant så fortsätter med cameran efter
 * ledigheten!
 *
 * @author Joakim Zakrisson
 * @version 2017-07-28
 */

import android.content.Context;
import android.graphics.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/*public class CameraPreview extends SurfaceView implements SurfaceHolder
        .Callback {

    // https://developer.android.com/training/camera/photobasics.html
    // https://developer.android.com/guide/topics/media/camera.html



}*/
