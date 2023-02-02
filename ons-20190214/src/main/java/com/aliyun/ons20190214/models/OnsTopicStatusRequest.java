// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicStatusRequest extends TeaModel {
    /**
     * <p>The ID of the instance that contains the topic you want to query.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the topic that you want to query.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static OnsTopicStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicStatusRequest self = new OnsTopicStatusRequest();
        return TeaModel.build(map, self);
    }

    public OnsTopicStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsTopicStatusRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
