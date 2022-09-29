// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpConfigPageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<PdpConfig> data;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static PdpConfigPageResult build(java.util.Map<String, ?> map) throws Exception {
        PdpConfigPageResult self = new PdpConfigPageResult();
        return TeaModel.build(map, self);
    }

    public PdpConfigPageResult setData(java.util.List<PdpConfig> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PdpConfig> getData() {
        return this.data;
    }

    public PdpConfigPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PdpConfigPageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
