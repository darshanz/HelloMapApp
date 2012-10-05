package xyz.devfest.hellomap;

import java.util.List;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class HelloMapActivity extends MapActivity {
	private MapView myMap = null;
	private GeoPoint point = null;

	@Override
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(R.layout.mapview_layout);

		myMap = (MapView) findViewById(R.id.mymapview);
		myMap.setSatellite(true);
		myMap.setBuiltInZoomControls(true);

		point = new GeoPoint((int) (27.669518 * 1E6), (int) (85.313139 * 1E6));
		myMap.getController().setCenter(point);
		myMap.getController().setZoom(18);

		Drawable drawable = this.getResources().getDrawable(
				R.drawable.ic_launcher);
		HelloItemizedOverlay itemizedOverlay = new HelloItemizedOverlay(
				drawable);
		OverlayItem overlayItem = new OverlayItem(point, "Hello", "what");
		itemizedOverlay.addoverlay(overlayItem);

		List<Overlay> mapOverLays = myMap.getOverlays();
		mapOverLays.add(itemizedOverlay);

		// Get location from GPS
		/*
		 * LocationManager lm =
		 * (LocationManager)this.getSystemService(Context.LOCATION_SERVICE);
		 * LocationListener ll = new LocationListener() {
		 * 
		 * public void onStatusChanged(String provider, int status, Bundle
		 * extras) { // TODO Auto-generated method stub
		 * 
		 * }
		 * 
		 * public void onProviderEnabled(String provider) { // TODO
		 * Auto-generated method stub
		 * 
		 * }
		 * 
		 * public void onProviderDisabled(String provider) { // TODO
		 * Auto-generated method stub
		 * 
		 * }
		 * 
		 * public void onLocationChanged(Location location) {
		 * Toast.makeText(HelloMapActivity.this, "Location Changed"+
		 * location.getLatitude() +", "+location.getLatitude(),
		 * Toast.LENGTH_LONG).show(); }
		 * 
		 * };
		 * 
		 * lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, ll);
		 */

	}

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

}
