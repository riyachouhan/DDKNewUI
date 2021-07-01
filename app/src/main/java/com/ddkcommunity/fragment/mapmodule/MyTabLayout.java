package com.ddkcommunity.fragment.mapmodule;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.TextView;

import com.ddkcommunity.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MyTabLayout extends TabLayout {
    private List<String> titles;

    public MyTabLayout(Context context) {
        super(context);
        init();
    }

    public MyTabLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        titles = new ArrayList<>();

        this.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(Tab tab) {
                /**
                 * Set the currently selected Tab to a special highlight style.
                 */
                if (tab != null && tab.getCustomView() != null) {
                    TextView tab_layout_text = tab.getCustomView().findViewById(R.id.tab_layout_text);

                    tab_layout_text.setTextColor(getContext().getResources().getColor(R.color.colorPrimary));
                    tab_layout_text.setBackgroundResource(R.drawable.tablayout_item_pressed);
                }
            }

            @Override
            public void onTabUnselected(Tab tab) {
                /**
                 * Reset all unselected Tab colors, fonts, background to normal (unselected state).
                 */
                if (tab != null && tab.getCustomView() != null) {
                    TextView tab_layout_text = tab.getCustomView().findViewById(R.id.tab_layout_text);

                    tab_layout_text.setTextColor(getResources().getColor(android.R.color.darker_gray));
                    tab_layout_text.setBackgroundResource(R.drawable.tablayout_item_normal);
                }
            }

            @Override
            public void onTabReselected(Tab tab) {

            }
        });
    }

    public void setTitle(List<String> titles) {
        this.titles = titles;

        /**
         * Start adding tabs for switching.
         */
        for (String title : this.titles) {
            Tab tab = newTab();
            tab.setCustomView(R.layout.tab_layout_item);

            if (tab.getCustomView() != null) {
                TextView text = tab.getCustomView().findViewById(R.id.tab_layout_text);
                text.setText(title);
            }

            this.addTab(tab);
        }
    }
}
