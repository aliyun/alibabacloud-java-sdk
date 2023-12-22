// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateABMetricGroupResponseBody extends TeaModel {
    @NameInMap("ABMetricGroupId")
    public String ABMetricGroupId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateABMetricGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateABMetricGroupResponseBody self = new CreateABMetricGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateABMetricGroupResponseBody setABMetricGroupId(String ABMetricGroupId) {
        this.ABMetricGroupId = ABMetricGroupId;
        return this;
    }
    public String getABMetricGroupId() {
        return this.ABMetricGroupId;
    }

    public CreateABMetricGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
