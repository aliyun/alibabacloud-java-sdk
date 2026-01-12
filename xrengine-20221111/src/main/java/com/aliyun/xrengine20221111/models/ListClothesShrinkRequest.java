// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListClothesShrinkRequest extends TeaModel {
    @NameInMap("Categories")
    public String categoriesShrink;

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

    public static ListClothesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClothesShrinkRequest self = new ListClothesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListClothesShrinkRequest setCategoriesShrink(String categoriesShrink) {
        this.categoriesShrink = categoriesShrink;
        return this;
    }
    public String getCategoriesShrink() {
        return this.categoriesShrink;
    }

    public ListClothesShrinkRequest setClothSize(String clothSize) {
        this.clothSize = clothSize;
        return this;
    }
    public String getClothSize() {
        return this.clothSize;
    }

    public ListClothesShrinkRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListClothesShrinkRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public ListClothesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListClothesShrinkRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListClothesShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
