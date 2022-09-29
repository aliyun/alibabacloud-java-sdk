// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PrivilegePageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<Privilege> data;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static PrivilegePageResult build(java.util.Map<String, ?> map) throws Exception {
        PrivilegePageResult self = new PrivilegePageResult();
        return TeaModel.build(map, self);
    }

    public PrivilegePageResult setData(java.util.List<Privilege> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Privilege> getData() {
        return this.data;
    }

    public PrivilegePageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PrivilegePageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
