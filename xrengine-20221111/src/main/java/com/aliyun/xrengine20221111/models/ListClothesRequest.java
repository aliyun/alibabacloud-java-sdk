// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListClothesRequest extends TeaModel {
    @NameInMap("Categories")
    public java.util.List<Long> categories;

    @NameInMap("ClothSize")
    public String clothSize;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("Name")
    public String name;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Type")
    public String type;

    public static ListClothesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClothesRequest self = new ListClothesRequest();
        return TeaModel.build(map, self);
    }

    public ListClothesRequest setCategories(java.util.List<Long> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<Long> getCategories() {
        return this.categories;
    }

    public ListClothesRequest setClothSize(String clothSize) {
        this.clothSize = clothSize;
        return this;
    }
    public String getClothSize() {
        return this.clothSize;
    }

    public ListClothesRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListClothesRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public ListClothesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListClothesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListClothesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
