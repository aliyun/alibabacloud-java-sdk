// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class GetAudioInstanceRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static GetAudioInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAudioInstanceRequest self = new GetAudioInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetAudioInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetAudioInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
