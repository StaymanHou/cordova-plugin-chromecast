package acidhax.cordova.chromecast;

import android.support.v7.media.MediaRouter;
// import androidx.mediarouter.media.MediaRouter;

import java.util.Comparator;

public class RouteListComparer implements Comparator<MediaRouter.RouteInfo> {
    public int compare(MediaRouter.RouteInfo left, MediaRouter.RouteInfo right) {
        return left.getName().compareTo(right.getName());
    }
}
