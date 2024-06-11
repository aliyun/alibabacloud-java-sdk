// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    /**
     * <p>The `marker`. If part of a previous response is truncated, you can use this parameter to obtain the truncated part.</p>
     */
    @NameInMap("Marker")
    public String marker;

    /**
     * <p>The number of entries per page. If a response is truncated because it reaches the value of MaxItems, the value of `IsTruncatedg` will be `true`.</p>
     * <br>
     * <p>Valid values: 1 to 1000. Default value: 100.</p>
     */
    @NameInMap("MaxItems")
    public Integer maxItems;

    public static ListUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersRequest self = new ListUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListUsersRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

}
