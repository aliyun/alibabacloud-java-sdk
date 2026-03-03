// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpLaneInfosResult extends TeaModel {
    @NameInMap("pdpLanes")
    public java.util.List<PdpLaneInfo> pdpLanes;

    @NameInMap("requestId")
    public String requestId;

    public static PdpLaneInfosResult build(java.util.Map<String, ?> map) throws Exception {
        PdpLaneInfosResult self = new PdpLaneInfosResult();
        return TeaModel.build(map, self);
    }

    public PdpLaneInfosResult setPdpLanes(java.util.List<PdpLaneInfo> pdpLanes) {
        this.pdpLanes = pdpLanes;
        return this;
    }
    public java.util.List<PdpLaneInfo> getPdpLanes() {
        return this.pdpLanes;
    }

    public PdpLaneInfosResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
