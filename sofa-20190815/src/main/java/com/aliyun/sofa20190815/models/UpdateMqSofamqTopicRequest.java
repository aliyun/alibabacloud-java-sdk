// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMqSofamqTopicRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Perm")
    public Long perm;

    @NameInMap("Topic")
    public String topic;

    public static UpdateMqSofamqTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMqSofamqTopicRequest self = new UpdateMqSofamqTopicRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMqSofamqTopicRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMqSofamqTopicRequest setPerm(Long perm) {
        this.perm = perm;
        return this;
    }
    public Long getPerm() {
        return this.perm;
    }

    public UpdateMqSofamqTopicRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
