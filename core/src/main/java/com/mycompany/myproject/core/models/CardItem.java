package com.myproject.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)
public class CardItem {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String category;

    @ValueMapValue
    private String image;

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getImage() {
        return image;
    }
}