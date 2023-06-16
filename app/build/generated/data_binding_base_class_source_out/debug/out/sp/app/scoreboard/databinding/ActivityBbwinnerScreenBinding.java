// Generated by view binder compiler. Do not edit!
package sp.app.scoreboard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import sp.app.scoreboard.R;

public final class ActivityBbwinnerScreenBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraintLayout4;

  @NonNull
  public final Button exitbtn;

  @NonNull
  public final Guideline guideline25;

  @NonNull
  public final Guideline guideline35;

  @NonNull
  public final Guideline guideline36;

  @NonNull
  public final Guideline guideline37;

  @NonNull
  public final Guideline guideline38;

  @NonNull
  public final Guideline guideline39;

  @NonNull
  public final Guideline guideline40;

  @NonNull
  public final Guideline guideline41;

  @NonNull
  public final Guideline guideline42;

  @NonNull
  public final Guideline guideline43;

  @NonNull
  public final Guideline guideline44;

  @NonNull
  public final Guideline guideline45;

  @NonNull
  public final Guideline guideline46;

  @NonNull
  public final Guideline guideline47;

  @NonNull
  public final Guideline guideline48;

  @NonNull
  public final TextView headdertv;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextView p1nametv;

  @NonNull
  public final ConstraintLayout p1scorecl;

  @NonNull
  public final CardView p1scorecv;

  @NonNull
  public final TextView p1scoretv;

  @NonNull
  public final TextView p2nametv;

  @NonNull
  public final ConstraintLayout p2scorecl;

  @NonNull
  public final CardView p2scorecv;

  @NonNull
  public final TextView p2scoretv;

  @NonNull
  public final ConstraintLayout roundscl;

  @NonNull
  public final CardView roundscv;

  @NonNull
  public final TextView roundstv;

  @NonNull
  public final LinearLayout scorelist;

  @NonNull
  public final TextView winnertv;

  private ActivityBbwinnerScreenBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraintLayout4, @NonNull Button exitbtn,
      @NonNull Guideline guideline25, @NonNull Guideline guideline35,
      @NonNull Guideline guideline36, @NonNull Guideline guideline37,
      @NonNull Guideline guideline38, @NonNull Guideline guideline39,
      @NonNull Guideline guideline40, @NonNull Guideline guideline41,
      @NonNull Guideline guideline42, @NonNull Guideline guideline43,
      @NonNull Guideline guideline44, @NonNull Guideline guideline45,
      @NonNull Guideline guideline46, @NonNull Guideline guideline47,
      @NonNull Guideline guideline48, @NonNull TextView headdertv, @NonNull ImageView imageView2,
      @NonNull TextView p1nametv, @NonNull ConstraintLayout p1scorecl, @NonNull CardView p1scorecv,
      @NonNull TextView p1scoretv, @NonNull TextView p2nametv, @NonNull ConstraintLayout p2scorecl,
      @NonNull CardView p2scorecv, @NonNull TextView p2scoretv, @NonNull ConstraintLayout roundscl,
      @NonNull CardView roundscv, @NonNull TextView roundstv, @NonNull LinearLayout scorelist,
      @NonNull TextView winnertv) {
    this.rootView = rootView;
    this.constraintLayout4 = constraintLayout4;
    this.exitbtn = exitbtn;
    this.guideline25 = guideline25;
    this.guideline35 = guideline35;
    this.guideline36 = guideline36;
    this.guideline37 = guideline37;
    this.guideline38 = guideline38;
    this.guideline39 = guideline39;
    this.guideline40 = guideline40;
    this.guideline41 = guideline41;
    this.guideline42 = guideline42;
    this.guideline43 = guideline43;
    this.guideline44 = guideline44;
    this.guideline45 = guideline45;
    this.guideline46 = guideline46;
    this.guideline47 = guideline47;
    this.guideline48 = guideline48;
    this.headdertv = headdertv;
    this.imageView2 = imageView2;
    this.p1nametv = p1nametv;
    this.p1scorecl = p1scorecl;
    this.p1scorecv = p1scorecv;
    this.p1scoretv = p1scoretv;
    this.p2nametv = p2nametv;
    this.p2scorecl = p2scorecl;
    this.p2scorecv = p2scorecv;
    this.p2scoretv = p2scoretv;
    this.roundscl = roundscl;
    this.roundscv = roundscv;
    this.roundstv = roundstv;
    this.scorelist = scorelist;
    this.winnertv = winnertv;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBbwinnerScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBbwinnerScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_bbwinner_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBbwinnerScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintLayout4;
      ConstraintLayout constraintLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout4 == null) {
        break missingId;
      }

      id = R.id.exitbtn;
      Button exitbtn = ViewBindings.findChildViewById(rootView, id);
      if (exitbtn == null) {
        break missingId;
      }

      id = R.id.guideline25;
      Guideline guideline25 = ViewBindings.findChildViewById(rootView, id);
      if (guideline25 == null) {
        break missingId;
      }

      id = R.id.guideline35;
      Guideline guideline35 = ViewBindings.findChildViewById(rootView, id);
      if (guideline35 == null) {
        break missingId;
      }

      id = R.id.guideline36;
      Guideline guideline36 = ViewBindings.findChildViewById(rootView, id);
      if (guideline36 == null) {
        break missingId;
      }

      id = R.id.guideline37;
      Guideline guideline37 = ViewBindings.findChildViewById(rootView, id);
      if (guideline37 == null) {
        break missingId;
      }

      id = R.id.guideline38;
      Guideline guideline38 = ViewBindings.findChildViewById(rootView, id);
      if (guideline38 == null) {
        break missingId;
      }

      id = R.id.guideline39;
      Guideline guideline39 = ViewBindings.findChildViewById(rootView, id);
      if (guideline39 == null) {
        break missingId;
      }

      id = R.id.guideline40;
      Guideline guideline40 = ViewBindings.findChildViewById(rootView, id);
      if (guideline40 == null) {
        break missingId;
      }

      id = R.id.guideline41;
      Guideline guideline41 = ViewBindings.findChildViewById(rootView, id);
      if (guideline41 == null) {
        break missingId;
      }

      id = R.id.guideline42;
      Guideline guideline42 = ViewBindings.findChildViewById(rootView, id);
      if (guideline42 == null) {
        break missingId;
      }

      id = R.id.guideline43;
      Guideline guideline43 = ViewBindings.findChildViewById(rootView, id);
      if (guideline43 == null) {
        break missingId;
      }

      id = R.id.guideline44;
      Guideline guideline44 = ViewBindings.findChildViewById(rootView, id);
      if (guideline44 == null) {
        break missingId;
      }

      id = R.id.guideline45;
      Guideline guideline45 = ViewBindings.findChildViewById(rootView, id);
      if (guideline45 == null) {
        break missingId;
      }

      id = R.id.guideline46;
      Guideline guideline46 = ViewBindings.findChildViewById(rootView, id);
      if (guideline46 == null) {
        break missingId;
      }

      id = R.id.guideline47;
      Guideline guideline47 = ViewBindings.findChildViewById(rootView, id);
      if (guideline47 == null) {
        break missingId;
      }

      id = R.id.guideline48;
      Guideline guideline48 = ViewBindings.findChildViewById(rootView, id);
      if (guideline48 == null) {
        break missingId;
      }

      id = R.id.headdertv;
      TextView headdertv = ViewBindings.findChildViewById(rootView, id);
      if (headdertv == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.p1nametv;
      TextView p1nametv = ViewBindings.findChildViewById(rootView, id);
      if (p1nametv == null) {
        break missingId;
      }

      id = R.id.p1scorecl;
      ConstraintLayout p1scorecl = ViewBindings.findChildViewById(rootView, id);
      if (p1scorecl == null) {
        break missingId;
      }

      id = R.id.p1scorecv;
      CardView p1scorecv = ViewBindings.findChildViewById(rootView, id);
      if (p1scorecv == null) {
        break missingId;
      }

      id = R.id.p1scoretv;
      TextView p1scoretv = ViewBindings.findChildViewById(rootView, id);
      if (p1scoretv == null) {
        break missingId;
      }

      id = R.id.p2nametv;
      TextView p2nametv = ViewBindings.findChildViewById(rootView, id);
      if (p2nametv == null) {
        break missingId;
      }

      id = R.id.p2scorecl;
      ConstraintLayout p2scorecl = ViewBindings.findChildViewById(rootView, id);
      if (p2scorecl == null) {
        break missingId;
      }

      id = R.id.p2scorecv;
      CardView p2scorecv = ViewBindings.findChildViewById(rootView, id);
      if (p2scorecv == null) {
        break missingId;
      }

      id = R.id.p2scoretv;
      TextView p2scoretv = ViewBindings.findChildViewById(rootView, id);
      if (p2scoretv == null) {
        break missingId;
      }

      id = R.id.roundscl;
      ConstraintLayout roundscl = ViewBindings.findChildViewById(rootView, id);
      if (roundscl == null) {
        break missingId;
      }

      id = R.id.roundscv;
      CardView roundscv = ViewBindings.findChildViewById(rootView, id);
      if (roundscv == null) {
        break missingId;
      }

      id = R.id.roundstv;
      TextView roundstv = ViewBindings.findChildViewById(rootView, id);
      if (roundstv == null) {
        break missingId;
      }

      id = R.id.scorelist;
      LinearLayout scorelist = ViewBindings.findChildViewById(rootView, id);
      if (scorelist == null) {
        break missingId;
      }

      id = R.id.winnertv;
      TextView winnertv = ViewBindings.findChildViewById(rootView, id);
      if (winnertv == null) {
        break missingId;
      }

      return new ActivityBbwinnerScreenBinding((ConstraintLayout) rootView, constraintLayout4,
          exitbtn, guideline25, guideline35, guideline36, guideline37, guideline38, guideline39,
          guideline40, guideline41, guideline42, guideline43, guideline44, guideline45, guideline46,
          guideline47, guideline48, headdertv, imageView2, p1nametv, p1scorecl, p1scorecv,
          p1scoretv, p2nametv, p2scorecl, p2scorecv, p2scoretv, roundscl, roundscv, roundstv,
          scorelist, winnertv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
