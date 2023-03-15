// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PbcVersionListResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<PbcVersion> data;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Integer total;

    public static PbcVersionListResult build(java.util.Map<String, ?> map) throws Exception {
        PbcVersionListResult self = new PbcVersionListResult();
        return TeaModel.build(map, self);
    }

    public PbcVersionListResult setData(java.util.List<PbcVersion> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PbcVersion> getData() {
        return this.data;
    }

    public PbcVersionListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PbcVersionListResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
