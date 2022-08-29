// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListAddressGroupsResponseBody extends TeaModel {
    @NameInMap("items")
    public java.util.List<AddressGroup> items;

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
