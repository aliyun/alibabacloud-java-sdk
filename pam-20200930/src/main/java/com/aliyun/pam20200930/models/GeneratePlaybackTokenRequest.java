// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class GeneratePlaybackTokenRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SessionId")
    public String sessionId;

    public static GeneratePlaybackTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GeneratePlaybackTokenRequest self = new GeneratePlaybackTokenRequest();
        return TeaModel.build(map, self);
    }

    public GeneratePlaybackTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GeneratePlaybackTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GeneratePlaybackTokenRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
