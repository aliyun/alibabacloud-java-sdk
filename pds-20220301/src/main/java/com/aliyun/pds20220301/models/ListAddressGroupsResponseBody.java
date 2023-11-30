// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListAddressGroupsResponseBody extends TeaModel {
    /**
     * <p>The information about the location-based groups.</p>
     */
    @NameInMap("items")
    public java.util.List<AddressGroup> items;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.</p>
     */
    @NameInMap("next_marker")
    public String nextMarker;

    public static ListAddressGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAddressGroupsResponseBody self = new ListAddressGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAddressGroupsResponseBody setItems(java.util.List<AddressGroup> items) {
        this.items = items;
        return this;
    }
    public java.util.List<AddressGroup> getItems() {
        return this.items;
    }

    public ListAddressGroupsResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}
