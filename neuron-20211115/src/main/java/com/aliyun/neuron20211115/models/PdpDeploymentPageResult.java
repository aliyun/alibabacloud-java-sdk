// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpDeploymentPageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<PdpServiceDeployment> data;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static PdpDeploymentPageResult build(java.util.Map<String, ?> map) throws Exception {
        PdpDeploymentPageResult self = new PdpDeploymentPageResult();
        return TeaModel.build(map, self);
    }

    public PdpDeploymentPageResult setData(java.util.List<PdpServiceDeployment> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PdpServiceDeployment> getData() {
        return this.data;
    }

    public PdpDeploymentPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PdpDeploymentPageResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
