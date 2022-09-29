// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpServicePageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<PdpService> data;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static PdpServicePageResult build(java.util.Map<String, ?> map) throws Exception {
        PdpServicePageResult self = new PdpServicePageResult();
        return TeaModel.build(map, self);
    }

    public PdpServicePageResult setData(java.util.List<PdpService> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PdpService> getData() {
        return this.data;
    }

    public PdpServicePageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PdpServicePageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
