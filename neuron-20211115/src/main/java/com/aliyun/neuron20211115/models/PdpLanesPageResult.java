// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpLanesPageResult extends TeaModel {
    @NameInMap("pdpLanes")
    public java.util.List<PdpLaneInfo> pdpLanes;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("total")
    public Integer total;

    public static PdpLanesPageResult build(java.util.Map<String, ?> map) throws Exception {
        PdpLanesPageResult self = new PdpLanesPageResult();
        return TeaModel.build(map, self);
    }

    public PdpLanesPageResult setPdpLanes(java.util.List<PdpLaneInfo> pdpLanes) {
        this.pdpLanes = pdpLanes;
        return this;
    }
    public java.util.List<PdpLaneInfo> getPdpLanes() {
        return this.pdpLanes;
    }

    public PdpLanesPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PdpLanesPageResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
