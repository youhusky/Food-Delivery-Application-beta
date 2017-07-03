package com;

import com.controller.RestaurantInfoController;
import com.domain.ItemInfo;
import com.domain.RestaurantInfo;
import com.domain.RestaurantRepository;
import com.service.RestaurantInfoService;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by joshua on 7/3/17.
 */
public class RestaurantTest {
    private RestaurantRepository restaurantRepository;
    private RestaurantInfoController restaurantInfoController;
    private RestaurantInfoService restaurantInfoService;
    private List<RestaurantInfo> restaurantInfoList;

    private List<ItemInfo> temp;
    @Before
    public void setupMock(){
        restaurantRepository = mock(RestaurantRepository.class);
        restaurantInfoService = mock(RestaurantInfoService.class);
        restaurantInfoController = mock(RestaurantInfoController.class);
        restaurantInfoList = new ArrayList<>();
        temp = new ArrayList<>();
        temp.add(getInfo("aa","tiger",3.3));
        restaurantInfoList.add(generateInfo("1","Bit","Beautiful",temp));

    }

    @Test
    public void check(){
        restaurantInfoList = new ArrayList<>();
        temp = new ArrayList<>();
        temp.add(getInfo("aa","tiger",3.3));
        restaurantInfoList.add(generateInfo("1","Bit","Beautiful",temp));
        when(restaurantInfoService.findByName("1")).thenReturn(restaurantInfoList);
        assertThat(restaurantInfoController.findItems("1").equals("1"));
    }

    private RestaurantInfo generateInfo(String id,
                                        String name,
                                        String description,
                                        List<ItemInfo> menuItems){
        RestaurantInfo restaurantInfo = new RestaurantInfo(id, name,description,menuItems);
        return restaurantInfo;
    }
    private ItemInfo getInfo(String id, String name, double price){
        ItemInfo itemInfo = new ItemInfo(id,name,price);
        return itemInfo;
    }
}
