// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class PushAllExperimentResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>74D958EF-3598-56FA-8296-FF1575CE43DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PushAllExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushAllExperimentResponseBody self = new PushAllExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public PushAllExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
