// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OnlineExperimentGroupResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>47F761ED-BE4E-51A6-B678-78E1490DF313</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnlineExperimentGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnlineExperimentGroupResponseBody self = new OnlineExperimentGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public OnlineExperimentGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
