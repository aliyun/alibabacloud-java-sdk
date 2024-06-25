// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateABMetricResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ABMetricId")
    public String ABMetricId;

    /**
     * <strong>example:</strong>
     * <p>F7AC05FF-EDE7-5C2B-B9AE-33D6DF4178BA</p>
     */
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
