package xyz.devfest.hellomap;

import java.util.ArrayList;
import android.graphics.drawable.Drawable;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

public class HelloItemizedOverlay extends ItemizedOverlay {

	ArrayList<OverlayItem> overLayItems = new ArrayList<OverlayItem>();

	public HelloItemizedOverlay(Drawable arg0) {
		super(boundCenterBottom(arg0));

	}

	@Override
	protected OverlayItem createItem(int arg0) {
		return overLayItems.get(arg0);
	}

	@Override
	public int size() {
		return overLayItems.size();
	}

	public void addoverlay(OverlayItem item) {
		overLayItems.add(item);
		populate();
	}

}
