// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicCreateRequest extends TeaModel {
    /**
     * <p>The ID of the instance in which you want to create the topic.</p>
     * 
     * <strong>example:</strong>
     * <p>MQ_INST_188077086902****_BXSuW61e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of messages that you want to publish to the topic. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: normal messages</li>
     * <li><strong>1</strong>: partitionally ordered messages</li>
     * <li><strong>2</strong>: globally ordered messages</li>
     * <li><strong>4</strong>: transactional messages</li>
     * <li><strong>5</strong>: scheduled or delayed messages</li>
     * </ul>
     * <p>For more information about message types, see <a href="https://help.aliyun.com/document_detail/155952.html">Message types</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MessageType")
    public Integer messageType;

    /**
     * <p>The description of the topic that you want to create.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The name of the topic that you want to create. The name must meet the following rules:</p>
     * <ul>
     * <li>The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The topic name cannot start with CID or GID because CID and GID are reserved prefixes for group IDs.</li>
     * <li>If the ApsaraMQ for RocketMQ instance in which you want to create the topic uses a namespace, the topic name must be unique in the instance. The topic name cannot be the same as an existing topic name or a group ID in the instance. The topic name can be the same as a topic name or a group ID in another instance that uses a different namespace. For example, if Instance A and Instance B use different namespaces, a topic name in Instance A can be the same as a topic name or a group ID in Instance B.</li>
     * <li>If the instance in which you want to create the topic does not use a namespace, the topic name must be globally unique across instances and regions. The topic name cannot be the same as an existing topic name or group ID in all ApsaraMQ for RocketMQ instances that belong to your Alibaba Cloud account.</li>
     * </ul>
     * <blockquote>
     * <p>To check whether an instance uses a namespace, log on to the ApsaraMQ for RocketMQ console, go to the <strong>Instance Details</strong> page, and then view the value of the Namespace field in the <strong>Basic Information</strong> section.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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
