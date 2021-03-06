// Generated by view binder compiler. Do not edit!
package com.example.bloodblank.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bloodblank.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BloodDonationDonorInfoLayoutBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView profilePhotoCardView;

  @NonNull
  public final ImageView profilePhotoImageView;

  @NonNull
  public final TextView textView;

  private BloodDonationDonorInfoLayoutBinding(@NonNull CardView rootView,
      @NonNull CardView profilePhotoCardView, @NonNull ImageView profilePhotoImageView,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.profilePhotoCardView = profilePhotoCardView;
    this.profilePhotoImageView = profilePhotoImageView;
    this.textView = textView;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static BloodDonationDonorInfoLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BloodDonationDonorInfoLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.blood_donation_donor_info_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BloodDonationDonorInfoLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.profilePhotoCardView;
      CardView profilePhotoCardView = ViewBindings.findChildViewById(rootView, id);
      if (profilePhotoCardView == null) {
        break missingId;
      }

      id = R.id.profilePhotoImageView;
      ImageView profilePhotoImageView = ViewBindings.findChildViewById(rootView, id);
      if (profilePhotoImageView == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new BloodDonationDonorInfoLayoutBinding((CardView) rootView, profilePhotoCardView,
          profilePhotoImageView, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
