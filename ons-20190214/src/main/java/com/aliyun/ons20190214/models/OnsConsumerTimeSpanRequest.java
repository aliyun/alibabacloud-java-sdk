// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerTimeSpanRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group whose reset time range you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_test_group_id</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the instance to which the consumer group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>MQ_INST_111111111111_DOxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The topic to which the consumer group subscribes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-mq_topic</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static OnsConsumerTimeSpanRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerTimeSpanRequest self = new OnsConsumerTimeSpanRequest();
        return TeaModel.build(map, self);
    }

    public OnsConsumerTimeSpanRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsConsumerTimeSpanRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsConsumerTimeSpanRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
