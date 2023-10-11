// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListCommonMaterialsAllRequest extends TeaModel {
    @NameInMap("Current")
    public Integer current;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("ListStatus")
    public String listStatus;

    @NameInMap("Name")
    public String name;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Type")
    public String type;

    public static PopListCommonMaterialsAllRequest build(java.util.Map<String, ?> map) throws Exception {
        PopListCommonMaterialsAllRequest self = new PopListCommonMaterialsAllRequest();
        return TeaModel.build(map, self);
    }

    public PopListCommonMaterialsAllRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public PopListCommonMaterialsAllRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public PopListCommonMaterialsAllRequest setListStatus(String listStatus) {
        this.listStatus = listStatus;
        return this;
    }
    public String getListStatus() {
        return this.listStatus;
    }

    public PopListCommonMaterialsAllRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PopListCommonMaterialsAllRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public PopListCommonMaterialsAllRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public PopListCommonMaterialsAllRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
