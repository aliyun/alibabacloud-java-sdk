// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetCallDetailRecordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c28fc549-d88f-4f6e-85ad-a0806e5e39c0</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>9fe19f64-a290-4a73-a3ed-5f7d21d44ecb</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static GetCallDetailRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCallDetailRecordRequest self = new GetCallDetailRecordRequest();
        return TeaModel.build(map, self);
    }

    public GetCallDetailRecordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetCallDetailRecordRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
