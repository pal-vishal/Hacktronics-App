package me.HacktronicsAavesh.HacktronicsAavesh;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import me.HacktronicsAavesh.bottomnavbar.R;
import me.HacktronicsAavesh.library.BottomBarHolderActivity;
import me.HacktronicsAavesh.library.NavigationPage;


public class MainActivity extends BottomBarHolderActivity implements FirstFragment.OnFragmentInteractionListener, SecondFragment.OnFragmentInteractionListener, ThirdFragment.OnFragmentInteractionListener, FourthFragment.OnFragmentInteractionListener , FirstFragmentCardView.OnFragmentInteractionListener{
    View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        NavigationPage page1 = new NavigationPage("Home", ContextCompat.getDrawable(this, R.drawable.ic_home_black_24dp), FirstFragmentCardView.newInstance());
        NavigationPage page2 = new NavigationPage("Timeline", ContextCompat.getDrawable(this, R.drawable.ic_timeline_hacktronics), SecondFragment.newInstance());
        NavigationPage page3 = new NavigationPage("Schedule", ContextCompat.getDrawable(this, R.drawable.ic_schedule_black_24dp), FourthFragment.newInstance());
        NavigationPage page4 = new NavigationPage("Prizes", ContextCompat.getDrawable(this, R.drawable.ic_award), ThirdFragment.newInstance());

        List<NavigationPage> navigationPages = new ArrayList<>();
        navigationPages.add(page1);
        navigationPages.add(page2);
        navigationPages.add(page3);
        navigationPages.add(page4);

        super.setupBottomBarHolderActivity(navigationPages);

        //view.setBackgroundColor(getResources().getColor(R.color.colorBackground));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Contactus:
                Intent intent = new Intent(MainActivity.this, AboutUs.class);
                this.startActivity(intent);
                break;
            case R.id.Developers:
                Intent intent1 = new Intent(MainActivity.this, Developers.class);
                this.startActivity(intent1);


                break;
            default:
                return super.onOptionsItemSelected(item);

        }
        return true;
    }

    @Override
    public void onClicked() {
        Toast.makeText(this, "Clicked!", Toast.LENGTH_SHORT).show();
    }

}

