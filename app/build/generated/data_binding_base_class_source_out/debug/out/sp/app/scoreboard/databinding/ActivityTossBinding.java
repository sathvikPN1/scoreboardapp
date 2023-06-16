// Generated by view binder compiler. Do not edit!
package sp.app.scoreboard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import sp.app.scoreboard.R;

public final class ActivityTossBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final ImageView cointossiv;

  @NonNull
  public final Button continuebtn;

  @NonNull
  public final Guideline guideline19;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final Guideline guideline20;

  @NonNull
  public final Guideline guideline21;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final Guideline guideline4;

  @NonNull
  public final Guideline guideline5;

  @NonNull
  public final Guideline guideline6;

  @NonNull
  public final Guideline guideline7;

  @NonNull
  public final Guideline guideline9;

  @NonNull
  public final TextView servertv;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final FloatingActionButton togglecam;

  private ActivityTossBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardView,
      @NonNull CardView cardView2, @NonNull ImageView cointossiv, @NonNull Button continuebtn,
      @NonNull Guideline guideline19, @NonNull Guideline guideline2, @NonNull Guideline guideline20,
      @NonNull Guideline guideline21, @NonNull Guideline guideline3, @NonNull Guideline guideline4,
      @NonNull Guideline guideline5, @NonNull Guideline guideline6, @NonNull Guideline guideline7,
      @NonNull Guideline guideline9, @NonNull TextView servertv, @NonNull TextView textView7,
      @NonNull TextView textView8, @NonNull FloatingActionButton togglecam) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.cardView2 = cardView2;
    this.cointossiv = cointossiv;
    this.continuebtn = continuebtn;
    this.guideline19 = guideline19;
    this.guideline2 = guideline2;
    this.guideline20 = guideline20;
    this.guideline21 = guideline21;
    this.guideline3 = guideline3;
    this.guideline4 = guideline4;
    this.guideline5 = guideline5;
    this.guideline6 = guideline6;
    this.guideline7 = guideline7;
    this.guideline9 = guideline9;
    this.servertv = servertv;
    this.textView7 = textView7;
    this.textView8 = textView8;
    this.togglecam = togglecam;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTossBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTossBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_toss, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTossBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.cardView2;
      CardView cardView2 = ViewBindings.findChildViewById(rootView, id);
      if (cardView2 == null) {
        break missingId;
      }

      id = R.id.cointossiv;
      ImageView cointossiv = ViewBindings.findChildViewById(rootView, id);
      if (cointossiv == null) {
        break missingId;
      }

      id = R.id.continuebtn;
      Button continuebtn = ViewBindings.findChildViewById(rootView, id);
      if (continuebtn == null) {
        break missingId;
      }

      id = R.id.guideline19;
      Guideline guideline19 = ViewBindings.findChildViewById(rootView, id);
      if (guideline19 == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = ViewBindings.findChildViewById(rootView, id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.guideline20;
      Guideline guideline20 = ViewBindings.findChildViewById(rootView, id);
      if (guideline20 == null) {
        break missingId;
      }

      id = R.id.guideline21;
      Guideline guideline21 = ViewBindings.findChildViewById(rootView, id);
      if (guideline21 == null) {
        break missingId;
      }

      id = R.id.guideline3;
      Guideline guideline3 = ViewBindings.findChildViewById(rootView, id);
      if (guideline3 == null) {
        break missingId;
      }

      id = R.id.guideline4;
      Guideline guideline4 = ViewBindings.findChildViewById(rootView, id);
      if (guideline4 == null) {
        break missingId;
      }

      id = R.id.guideline5;
      Guideline guideline5 = ViewBindings.findChildViewById(rootView, id);
      if (guideline5 == null) {
        break missingId;
      }

      id = R.id.guideline6;
      Guideline guideline6 = ViewBindings.findChildViewById(rootView, id);
      if (guideline6 == null) {
        break missingId;
      }

      id = R.id.guideline7;
      Guideline guideline7 = ViewBindings.findChildViewById(rootView, id);
      if (guideline7 == null) {
        break missingId;
      }

      id = R.id.guideline9;
      Guideline guideline9 = ViewBindings.findChildViewById(rootView, id);
      if (guideline9 == null) {
        break missingId;
      }

      id = R.id.servertv;
      TextView servertv = ViewBindings.findChildViewById(rootView, id);
      if (servertv == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.togglecam;
      FloatingActionButton togglecam = ViewBindings.findChildViewById(rootView, id);
      if (togglecam == null) {
        break missingId;
      }

      return new ActivityTossBinding((ConstraintLayout) rootView, cardView, cardView2, cointossiv,
          continuebtn, guideline19, guideline2, guideline20, guideline21, guideline3, guideline4,
          guideline5, guideline6, guideline7, guideline9, servertv, textView7, textView8,
          togglecam);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
