// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OfflineExperimentResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>872951C9-7755-5FA1-AACD-7F9375A6D27A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OfflineExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OfflineExperimentResponseBody self = new OfflineExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public OfflineExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
