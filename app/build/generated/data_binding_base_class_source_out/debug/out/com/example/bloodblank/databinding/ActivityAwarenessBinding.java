// Generated by view binder compiler. Do not edit!
package com.example.bloodblank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.example.bloodblank.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAwarenessBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ViewPager awarenessViewPager;

  private ActivityAwarenessBinding(@NonNull ConstraintLayout rootView,
      @NonNull ViewPager awarenessViewPager) {
    this.rootView = rootView;
    this.awarenessViewPager = awarenessViewPager;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAwarenessBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAwarenessBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_awareness, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAwarenessBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.awarenessViewPager;
      ViewPager awarenessViewPager = ViewBindings.findChildViewById(rootView, id);
      if (awarenessViewPager == null) {
        break missingId;
      }

      return new ActivityAwarenessBinding((ConstraintLayout) rootView, awarenessViewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
