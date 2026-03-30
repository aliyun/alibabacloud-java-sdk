// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetRecordingRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>868eef14-7515-4856-8a50-5c9a22abdbcc</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>89ab28c2-eb94-4010-a539-f0eee922e371</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    public static GetRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecordingRequest self = new GetRecordingRequest();
        return TeaModel.build(map, self);
    }

    public GetRecordingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRecordingRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
