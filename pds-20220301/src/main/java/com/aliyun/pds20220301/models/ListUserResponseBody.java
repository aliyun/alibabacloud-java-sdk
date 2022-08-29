// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListUserResponseBody extends TeaModel {
    @NameInMap("items")
    public java.util.List<User> items;

    @NameInMap("next_marker")
    public String nextMarker;

    public static ListUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserResponseBody self = new ListUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserResponseBody setItems(java.util.List<User> items) {
        this.items = items;
        return this;
    }
    public java.util.List<User> getItems() {
        return this.items;
    }

    public ListUserResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
