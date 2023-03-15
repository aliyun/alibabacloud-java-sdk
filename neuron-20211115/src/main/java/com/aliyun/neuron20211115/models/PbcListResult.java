// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcListResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<Pbc> data;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Integer total;

    public static PbcListResult build(java.util.Map<String, ?> map) throws Exception {
        PbcListResult self = new PbcListResult();
        return TeaModel.build(map, self);
    }

    public PbcListResult setData(java.util.List<Pbc> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Pbc> getData() {
        return this.data;
    }

    public PbcListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PbcListResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
