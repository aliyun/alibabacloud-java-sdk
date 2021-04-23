// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class AddDeletionAudioTaskRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AudioId")
    public String audioId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static AddDeletionAudioTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDeletionAudioTaskRequest self = new AddDeletionAudioTaskRequest();
        return TeaModel.build(map, self);
    }

    public AddDeletionAudioTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddDeletionAudioTaskRequest setAudioId(String audioId) {
        this.audioId = audioId;
        return this;
    }
    public String getAudioId() {
        return this.audioId;
    }

    public AddDeletionAudioTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
