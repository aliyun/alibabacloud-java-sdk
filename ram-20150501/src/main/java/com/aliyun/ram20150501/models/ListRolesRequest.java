// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListRolesRequest extends TeaModel {
    @NameInMap("Marker")
    public String marker;

    @NameInMap("MaxItems")
    public Integer maxItems;

    public static ListRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRolesRequest self = new ListRolesRequest();
        return TeaModel.build(map, self);
    }

    public ListRolesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListRolesRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

}
