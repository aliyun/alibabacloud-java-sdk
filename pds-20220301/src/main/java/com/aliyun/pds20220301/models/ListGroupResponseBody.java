// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the groups.</p>
     */
    @NameInMap("items")
    public java.util.List<Group> items;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.</p>
     */
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
