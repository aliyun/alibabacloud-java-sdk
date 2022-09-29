// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpListTokenResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<RuntimeToken> data;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static PdpListTokenResult build(java.util.Map<String, ?> map) throws Exception {
        PdpListTokenResult self = new PdpListTokenResult();
        return TeaModel.build(map, self);
    }

    public PdpListTokenResult setData(java.util.List<RuntimeToken> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RuntimeToken> getData() {
        return this.data;
    }

    public PdpListTokenResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PdpListTokenResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
