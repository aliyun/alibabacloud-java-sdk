// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeveloperPageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<Developer> data;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static DeveloperPageResult build(java.util.Map<String, ?> map) throws Exception {
        DeveloperPageResult self = new DeveloperPageResult();
        return TeaModel.build(map, self);
    }

    public DeveloperPageResult setData(java.util.List<Developer> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Developer> getData() {
        return this.data;
    }

    public DeveloperPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeveloperPageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
