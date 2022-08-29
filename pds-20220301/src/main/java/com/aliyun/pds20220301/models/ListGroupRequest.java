// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListGroupRequest extends TeaModel {
    @NameInMap("limit")
    public String limit;

    @NameInMap("marker")
    public String marker;

    public static ListGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupRequest self = new ListGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public ListGroupRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

}
