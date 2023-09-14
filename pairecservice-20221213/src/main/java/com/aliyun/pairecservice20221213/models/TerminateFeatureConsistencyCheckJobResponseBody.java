// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class TerminateFeatureConsistencyCheckJobResponseBody extends TeaModel {
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
