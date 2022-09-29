// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpImagePageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<PdpImage> data;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static PdpImagePageResult build(java.util.Map<String, ?> map) throws Exception {
        PdpImagePageResult self = new PdpImagePageResult();
        return TeaModel.build(map, self);
    }

    public PdpImagePageResult setData(java.util.List<PdpImage> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PdpImage> getData() {
        return this.data;
    }

    public PdpImagePageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PdpImagePageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
