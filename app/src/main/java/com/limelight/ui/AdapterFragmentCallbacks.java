package com.limelight.ui;

import android.widget.AbsListView;

public interface AdapterFragmentCallbacks {
    int getAdapterFragmentLayoutId();
    void receiveAbsListView(AbsListView gridView);

    int getComputerCounts ();
    void deleteComputer ();
    boolean pairComputer ();
    void listGame ();
}
