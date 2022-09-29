// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class EnterprisePageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<Enterprise> data;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static EnterprisePageResult build(java.util.Map<String, ?> map) throws Exception {
        EnterprisePageResult self = new EnterprisePageResult();
        return TeaModel.build(map, self);
    }

    public EnterprisePageResult setData(java.util.List<Enterprise> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Enterprise> getData() {
        return this.data;
    }

    public EnterprisePageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterprisePageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
