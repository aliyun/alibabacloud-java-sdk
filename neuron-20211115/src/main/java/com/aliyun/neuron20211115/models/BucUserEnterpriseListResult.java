// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class BucUserEnterpriseListResult extends TeaModel {
    @NameInMap("data")
    public java.util.List<BucEnterprise> data;

    @NameInMap("requestId")
    public String requestId;

    public static BucUserEnterpriseListResult build(java.util.Map<String, ?> map) throws Exception {
        BucUserEnterpriseListResult self = new BucUserEnterpriseListResult();
        return TeaModel.build(map, self);
    }

    public BucUserEnterpriseListResult setData(java.util.List<BucEnterprise> data) {
        this.data = data;
        return this;
    }
    public java.util.List<BucEnterprise> getData() {
        return this.data;
    }

    public BucUserEnterpriseListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
