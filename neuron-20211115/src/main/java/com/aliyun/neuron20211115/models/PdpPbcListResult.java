// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpPbcListResult extends TeaModel {
    @NameInMap("pdpPbcs")
    public java.util.List<PdpPbc> pdpPbcs;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Integer total;

    public static PdpPbcListResult build(java.util.Map<String, ?> map) throws Exception {
        PdpPbcListResult self = new PdpPbcListResult();
        return TeaModel.build(map, self);
    }

    public PdpPbcListResult setPdpPbcs(java.util.List<PdpPbc> pdpPbcs) {
        this.pdpPbcs = pdpPbcs;
        return this;
    }
    public java.util.List<PdpPbc> getPdpPbcs() {
        return this.pdpPbcs;
    }

    public PdpPbcListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PdpPbcListResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
