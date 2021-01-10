// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMqSofamqTopicRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Topic")
    public String topic;

    public static DeleteMqSofamqTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMqSofamqTopicRequest self = new DeleteMqSofamqTopicRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMqSofamqTopicRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteMqSofamqTopicRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
