// Generated by view binder compiler. Do not edit!
package com.example.bloodblank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bloodblank.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAwarenessBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button awarenessButton;

  @NonNull
  public final CardView awarenessCardView;

  @NonNull
  public final ImageButton awarenessNextButton;

  @NonNull
  public final TextView awarenessTextView;

  @NonNull
  public final TextView awarenessTitleTextView;

  private FragmentAwarenessBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button awarenessButton, @NonNull CardView awarenessCardView,
      @NonNull ImageButton awarenessNextButton, @NonNull TextView awarenessTextView,
      @NonNull TextView awarenessTitleTextView) {
    this.rootView = rootView;
    this.awarenessButton = awarenessButton;
    this.awarenessCardView = awarenessCardView;
    this.awarenessNextButton = awarenessNextButton;
    this.awarenessTextView = awarenessTextView;
    this.awarenessTitleTextView = awarenessTitleTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAwarenessBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAwarenessBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_awareness, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAwarenessBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.awarenessButton;
      Button awarenessButton = ViewBindings.findChildViewById(rootView, id);
      if (awarenessButton == null) {
        break missingId;
      }

      id = R.id.awarenessCardView;
      CardView awarenessCardView = ViewBindings.findChildViewById(rootView, id);
      if (awarenessCardView == null) {
        break missingId;
      }

      id = R.id.awarenessNextButton;
      ImageButton awarenessNextButton = ViewBindings.findChildViewById(rootView, id);
      if (awarenessNextButton == null) {
        break missingId;
      }

      id = R.id.awarenessTextView;
      TextView awarenessTextView = ViewBindings.findChildViewById(rootView, id);
      if (awarenessTextView == null) {
        break missingId;
      }

      id = R.id.awarenessTitleTextView;
      TextView awarenessTitleTextView = ViewBindings.findChildViewById(rootView, id);
      if (awarenessTitleTextView == null) {
        break missingId;
      }

      return new FragmentAwarenessBinding((ConstraintLayout) rootView, awarenessButton,
          awarenessCardView, awarenessNextButton, awarenessTextView, awarenessTitleTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}