// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageGetByKeyRequest extends TeaModel {
    /**
     * <p>The ID of the instance to which the messages that you want to query belong.</p>
     * 
     * <strong>example:</strong>
     * <p>MQ_INST_111111111111_DOxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The key of the messages that you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>messageKey1</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The topic that contains the messages that you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-mq_topic</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static OnsMessageGetByKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageGetByKeyRequest self = new OnsMessageGetByKeyRequest();
        return TeaModel.build(map, self);
    }

    public OnsMessageGetByKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsMessageGetByKeyRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public OnsMessageGetByKeyRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
