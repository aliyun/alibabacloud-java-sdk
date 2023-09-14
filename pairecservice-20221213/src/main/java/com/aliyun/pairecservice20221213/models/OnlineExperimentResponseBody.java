// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OnlineExperimentResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnlineExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnlineExperimentResponseBody self = new OnlineExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public OnlineExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
