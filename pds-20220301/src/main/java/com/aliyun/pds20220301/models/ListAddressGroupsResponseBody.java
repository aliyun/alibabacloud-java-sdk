// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListAddressGroupsResponseBody extends TeaModel {
    /**
     * <p>A list of address groups.</p>
     */
    @NameInMap("items")
    public java.util.List<AddressGroup> items;

    /**
     * <p>The pagination token to use in a subsequent request to retrieve the next page of results. If this field is empty, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
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
