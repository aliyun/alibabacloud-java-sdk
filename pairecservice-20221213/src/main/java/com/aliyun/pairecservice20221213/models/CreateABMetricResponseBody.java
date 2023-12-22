// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateABMetricResponseBody extends TeaModel {
    @NameInMap("ABMetricId")
    public String ABMetricId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateABMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateABMetricResponseBody self = new CreateABMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateABMetricResponseBody setABMetricId(String ABMetricId) {
        this.ABMetricId = ABMetricId;
        return this;
    }
    public String getABMetricId() {
        return this.ABMetricId;
    }

    public CreateABMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
