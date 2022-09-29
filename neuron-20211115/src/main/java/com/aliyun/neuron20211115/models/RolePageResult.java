// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RolePageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<Role> data;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static RolePageResult build(java.util.Map<String, ?> map) throws Exception {
        RolePageResult self = new RolePageResult();
        return TeaModel.build(map, self);
    }

    public RolePageResult setData(java.util.List<Role> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Role> getData() {
        return this.data;
    }

    public RolePageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RolePageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
