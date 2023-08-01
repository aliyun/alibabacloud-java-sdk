// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListDashboardRequest extends TeaModel {
    @NameInMap("offset")
    public Integer offset;

    @NameInMap("size")
    public Integer size;

    public static ListDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardRequest self = new ListDashboardRequest();
        return TeaModel.build(map, self);
    }

    public ListDashboardRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListDashboardRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
