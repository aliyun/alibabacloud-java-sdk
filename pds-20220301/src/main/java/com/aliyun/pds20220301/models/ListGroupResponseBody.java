// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListGroupResponseBody extends TeaModel {
    @NameInMap("items")
    public java.util.List<Group> items;

    @NameInMap("next_marker")
    public String nextMarker;

    public static ListGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupResponseBody self = new ListGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupResponseBody setItems(java.util.List<Group> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Group> getItems() {
        return this.items;
    }

    public ListGroupResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
