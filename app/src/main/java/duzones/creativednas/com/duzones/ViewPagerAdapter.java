package duzones.creativednas.com.duzones;

import android.support.annotation.Nullable;
import androidx.core.app.Fragment;
import androidx.core.app.FragmentManager;
import androidx.core.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> lstFragment =new ArrayList<>();
    private final List<String> lstTitle=new ArrayList<>();



    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return lstFragment.get(i);
    }

    @Override
    public int getCount() {
        return lstTitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lstTitle.get(position);
    }

    public void AddFragment(Fragment fragment,String title){
        lstFragment.add(fragment);
        lstTitle.add(title);
    }
}
