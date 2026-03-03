// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpServiceGroupPageResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<PdpServiceGroup> data;

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

    public static PdpServiceGroupPageResult build(java.util.Map<String, ?> map) throws Exception {
        PdpServiceGroupPageResult self = new PdpServiceGroupPageResult();
        return TeaModel.build(map, self);
    }

    public PdpServiceGroupPageResult setData(java.util.List<PdpServiceGroup> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PdpServiceGroup> getData() {
        return this.data;
    }

    public PdpServiceGroupPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PdpServiceGroupPageResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
