// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class TerminateFeatureConsistencyCheckJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A6C01890-54CA-5C49-BC91-AD85A98E4A98</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TerminateFeatureConsistencyCheckJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TerminateFeatureConsistencyCheckJobResponseBody self = new TerminateFeatureConsistencyCheckJobResponseBody();
        return TeaModel.build(map, self);
    }

    public TerminateFeatureConsistencyCheckJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
