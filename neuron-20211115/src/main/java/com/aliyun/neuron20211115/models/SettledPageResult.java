// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SettledPageResult extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("settleds")
    public java.util.List<Settled> settleds;

    public static SettledPageResult build(java.util.Map<String, ?> map) throws Exception {
        SettledPageResult self = new SettledPageResult();
        return TeaModel.build(map, self);
    }

    public SettledPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SettledPageResult setSettleds(java.util.List<Settled> settleds) {
        this.settleds = settleds;
        return this;
    }
    public java.util.List<Settled> getSettleds() {
        return this.settleds;
    }

}
