package org.nz.sharein.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import org.nz.sharein.R;
import org.nz.sharein.adapter.MyViewPagerAdapter;
import org.nz.sharein.fragment.FaXianFragment;
import org.nz.sharein.fragment.JingXuanFragment;
import org.nz.sharein.fragment.TaoLunFragment;


public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    protected void initView() {
        setContentView(R.layout.activity_main);
        setToolBar();
        initFab();
        setDrawerLayout();
        setNavigationViewClickListener();
        //----------------------
        initViewPager();
        initTabLayout();
    }

    /**
     * 设置ToolBar
     */
    private void setToolBar() {
        mToolbar = (Toolbar) findViewById(R.id.activity_main_toolbar);
        mToolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }

    /**
     * 设置抽屉DrawerLayout
     */
    private void setDrawerLayout() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(
                this, mDrawerLayout, mToolbar, R.string.drawer_open, R.string.drawer_close);
        mDrawerToggle.syncState();//初始化状态
        mDrawerLayout.setDrawerListener(mDrawerToggle);
    }

    /**
     * 设置导航栏NavigationView的点击事件
     * 使侧滑菜单栏里的item能够响应点击事件
     */
    private void setNavigationViewClickListener() {
        NavigationView mNavigationView = (NavigationView) findViewById(R.id.navigation_view);
        mNavigationView.setVerticalScrollBarEnabled(false);
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.item_1:
                        break;
                    case R.id.item_2:
                        break;
                    case R.id.item_3:
                        break;
                    case R.id.item_4:
                        break;
                }
                mDrawerLayout.closeDrawers();//关闭抽屉
                return true;
            }
        });
    }

    /**
     * 给首页中的viewpaager添加三个fragment
     */
    private void initViewPager() {
        mViewPager = (ViewPager) findViewById(R.id.activity_main_viewpager);
        MyViewPagerAdapter viewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(JingXuanFragment.newInstance(), "精选");
        viewPagerAdapter.addFragment(FaXianFragment.newInstance(), "发现");
        viewPagerAdapter.addFragment(TaoLunFragment.newInstance(), "讨论");
        mViewPager.setAdapter(viewPagerAdapter);
    }

    /**
     * 初始化tablayout
     */
    private void initTabLayout() {
        mTabLayout = (TabLayout) findViewById(R.id.activity_main_tabLayout);
        mTabLayout.addTab(mTabLayout.newTab().setText("精选"));
        mTabLayout.addTab(mTabLayout.newTab().setText("发现"));
        mTabLayout.addTab(mTabLayout.newTab().setText("讨论"));
        mTabLayout.setupWithViewPager(mViewPager);
    }

    /**
     * 初始化下面的黄色的按钮
     */
    private void initFab() {
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.activity_main_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    //————————————————————————————————
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    /**
     * 在actionbar中添加action按钮
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * 在这个方法里给actionbar上的按钮添加点击事件
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.message_center) {
            Toast.makeText(this, "message_center", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.search_af) {
            Toast.makeText(this, "search_af", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
