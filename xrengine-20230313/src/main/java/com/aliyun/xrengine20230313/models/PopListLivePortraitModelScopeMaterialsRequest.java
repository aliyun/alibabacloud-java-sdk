// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListLivePortraitModelScopeMaterialsRequest extends TeaModel {
    @NameInMap("Current")
    public Integer current;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Types")
    public String types;

    public static PopListLivePortraitModelScopeMaterialsRequest build(java.util.Map<String, ?> map) throws Exception {
        PopListLivePortraitModelScopeMaterialsRequest self = new PopListLivePortraitModelScopeMaterialsRequest();
        return TeaModel.build(map, self);
    }

    public PopListLivePortraitModelScopeMaterialsRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public PopListLivePortraitModelScopeMaterialsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public PopListLivePortraitModelScopeMaterialsRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

}
