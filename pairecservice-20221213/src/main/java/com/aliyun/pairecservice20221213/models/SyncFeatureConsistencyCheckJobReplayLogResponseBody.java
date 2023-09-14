// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class SyncFeatureConsistencyCheckJobReplayLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SyncFeatureConsistencyCheckJobReplayLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncFeatureConsistencyCheckJobReplayLogResponseBody self = new SyncFeatureConsistencyCheckJobReplayLogResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncFeatureConsistencyCheckJobReplayLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
