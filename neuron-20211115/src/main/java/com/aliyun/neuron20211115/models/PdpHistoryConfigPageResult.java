// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpHistoryConfigPageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<PdpHistoryConfig> data;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static PdpHistoryConfigPageResult build(java.util.Map<String, ?> map) throws Exception {
        PdpHistoryConfigPageResult self = new PdpHistoryConfigPageResult();
        return TeaModel.build(map, self);
    }

    public PdpHistoryConfigPageResult setData(java.util.List<PdpHistoryConfig> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PdpHistoryConfig> getData() {
        return this.data;
    }

    public PdpHistoryConfigPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PdpHistoryConfigPageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
