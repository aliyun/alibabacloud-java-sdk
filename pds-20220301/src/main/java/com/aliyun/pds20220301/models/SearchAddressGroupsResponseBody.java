// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchAddressGroupsResponseBody extends TeaModel {
    /**
     * <p>The location-based groups.</p>
     */
    @NameInMap("items")
    public java.util.List<AddressGroup> items;

    public static SearchAddressGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchAddressGroupsResponseBody self = new SearchAddressGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchAddressGroupsResponseBody setItems(java.util.List<AddressGroup> items) {
        this.items = items;
        return this;
    }
    public java.util.List<AddressGroup> getItems() {
        return this.items;
    }

}
