// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListRevisionResponseBody extends TeaModel {
    /**
     * <p>The information about the versions.</p>
     */
    @NameInMap("items")
    public java.util.List<Revision> items;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.</p>
     */
    @NameInMap("next_marker")
    public String nextMarker;

    public static ListRevisionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRevisionResponseBody self = new ListRevisionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRevisionResponseBody setItems(java.util.List<Revision> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Revision> getItems() {
        return this.items;
    }

    public ListRevisionResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
