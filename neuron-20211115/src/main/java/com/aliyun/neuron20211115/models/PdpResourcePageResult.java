// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpResourcePageResult extends TeaModel {
    @NameInMap("list")
    public java.util.List<PdpResource> list;

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

    public static PdpResourcePageResult build(java.util.Map<String, ?> map) throws Exception {
        PdpResourcePageResult self = new PdpResourcePageResult();
        return TeaModel.build(map, self);
    }

    public PdpResourcePageResult setList(java.util.List<PdpResource> list) {
        this.list = list;
        return this;
    }
    public java.util.List<PdpResource> getList() {
        return this.list;
    }

    public PdpResourcePageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PdpResourcePageResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
