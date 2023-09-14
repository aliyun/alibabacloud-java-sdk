// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OfflineExperimentGroupResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OfflineExperimentGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OfflineExperimentGroupResponseBody self = new OfflineExperimentGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public OfflineExperimentGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
