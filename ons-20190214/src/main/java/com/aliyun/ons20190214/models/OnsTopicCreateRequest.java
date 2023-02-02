// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicCreateRequest extends TeaModel {
    /**
     * <p>The ID of the instance in which you want to create the topic.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the message. Valid values:</p>
     * <br>
     * <p>*   **0**: normal messages</p>
     * <p>*   **1**: partitionally ordered messages</p>
     * <p>*   **2**: globally ordered messages</p>
     * <p>*   **4**: transactional messages</p>
     * <p>*   **5**: scheduled or delayed messages</p>
     * <br>
     * <p>For more information about message types, see [Message types](~~155952~~).</p>
     */
    @NameInMap("MessageType")
    public Integer messageType;

    /**
     * <p>The description of the topic that you want to create.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The name of the topic that you want to create. The name must meet the following rules:</p>
     * <br>
     * <p>*   The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     * <p>*   The topic name cannot start with CID or GID because CID and GID are reserved prefixes for group IDs.</p>
     * <p>*   If the Message Queue for Apache RocketMQ instance in which you want to create the topic uses a namespace, the topic name must be unique in the instance. The topic name cannot be the same as an existing topic name or a group ID in the instance. The topic name can be the same as a topic name or a group ID in another instance that uses a different namespace. For example, if Instance A and Instance B use different namespaces, a topic name in Instance A can be the same as a topic name or a group ID in Instance B.</p>
     * <p>*   If the instance in which you want to create the topic does not use a namespace, the topic name must be globally unique across instances and regions. The topic name cannot be the same as an existing topic name or group ID in Message Queue for Apache RocketMQ instances that belong to your Alibaba Cloud account.</p>
     * <br>
     * <p>>  To check whether an instance uses a namespace, log on to the Message Queue for Apache RocketMQ console, go to the **Instance Details** page, and then view the value of the Namespace field in the **Basic Information** section.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static OnsTopicCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicCreateRequest self = new OnsTopicCreateRequest();
        return TeaModel.build(map, self);
    }

    public OnsTopicCreateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsTopicCreateRequest setMessageType(Integer messageType) {
        this.messageType = messageType;
        return this;
    }
    public Integer getMessageType() {
        return this.messageType;
    }

    public OnsTopicCreateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public OnsTopicCreateRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
