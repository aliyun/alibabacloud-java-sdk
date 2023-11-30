// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListShareLinkResponseBody extends TeaModel {
    /**
     * <p>The information about the shares.</p>
     */
    @NameInMap("items")
    public java.util.List<ShareLink> items;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.</p>
     */
    @NameInMap("next_marker")
    public String nextMarker;

    public static ListShareLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListShareLinkResponseBody self = new ListShareLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public ListShareLinkResponseBody setItems(java.util.List<ShareLink> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ShareLink> getItems() {
        return this.items;
    }

    public ListShareLinkResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
