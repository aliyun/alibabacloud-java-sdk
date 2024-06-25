// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class SyncFeatureConsistencyCheckJobReplayLogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C7D0B48F-0105-52B9-B60A-FA7606E2234D</p>
     */
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
