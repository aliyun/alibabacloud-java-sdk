// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicListResponseBody extends TeaModel {
    /**
     * <p>The information about the topics.</p>
     */
    @NameInMap("Data")
    public OnsTopicListResponseBodyData data;

    /**
     * <p>The ID of the request. This is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4A978869-7681-4529-B470-107E1379****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsTopicListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicListResponseBody self = new OnsTopicListResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTopicListResponseBody setData(OnsTopicListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsTopicListResponseBodyData getData() {
        return this.data;
    }

    public OnsTopicListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsTopicListResponseBodyDataPublishInfoDoTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>CartService</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>SrviceA</p>
         */
        @NameInMap("Value")
        public String value;

        public static OnsTopicListResponseBodyDataPublishInfoDoTagsTag build(java.util.Map<String, ?> map) throws Exception {
            OnsTopicListResponseBodyDataPublishInfoDoTagsTag self = new OnsTopicListResponseBodyDataPublishInfoDoTagsTag();
            return TeaModel.build(map, self);
        }

        public OnsTopicListResponseBodyDataPublishInfoDoTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public OnsTopicListResponseBodyDataPublishInfoDoTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class OnsTopicListResponseBodyDataPublishInfoDoTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<OnsTopicListResponseBodyDataPublishInfoDoTagsTag> tag;

        public static OnsTopicListResponseBodyDataPublishInfoDoTags build(java.util.Map<String, ?> map) throws Exception {
            OnsTopicListResponseBodyDataPublishInfoDoTags self = new OnsTopicListResponseBodyDataPublishInfoDoTags();
            return TeaModel.build(map, self);
        }

        public OnsTopicListResponseBodyDataPublishInfoDoTags setTag(java.util.List<OnsTopicListResponseBodyDataPublishInfoDoTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<OnsTopicListResponseBodyDataPublishInfoDoTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class OnsTopicListResponseBodyDataPublishInfoDo extends TeaModel {
        /**
         * <p>The time when the topic was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1570700947000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether the instance that contains the topic uses a namespace. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The instance uses a separate namespace. The name of each resource must be unique in the instance. The names of resources in different instances can be the same.</li>
         * <li><strong>false</strong>: The instance does not use a separate namespace. The name of each resource must be globally unique within an instance and across all instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IndependentNaming")
        public Boolean independentNaming;

        /**
         * <p>The ID of the instance that contains the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_188077086902****_BXSuW61e</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The message type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: normal messages</li>
         * <li><strong>1</strong>: partitionally ordered messages</li>
         * <li><strong>2</strong>: globally ordered messages</li>
         * <li><strong>4</strong>: transactional messages</li>
         * <li><strong>5</strong>: scheduled or delayed messages</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MessageType")
        public Integer messageType;

        /**
         * <p>The user ID of the topic owner. The value of this parameter is an Alibaba account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>138015630679****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>Indicates the relationship between the current account and the topic. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The current account is the owner of the topic.</li>
         * <li><strong>2</strong>: The current account can publish messages to the topic.</li>
         * <li><strong>4</strong>: The current account can subscribe to the topic.</li>
         * <li><strong>6</strong>: The current account can publish messages to and subscribe to the topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Relation")
        public Integer relation;

        /**
         * <p>The relationship between the current account and the topic. The value of this parameter indicates whether the current account is the owner of the topic, and whether the current account can subscribe or publish messages to the topic. the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>Publish and subscribe</p>
         */
        @NameInMap("RelationName")
        public String relationName;

        /**
         * <p>The description of the topic.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the topic that is asynchronously created. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The topic is being created.</li>
         * <li><strong>1</strong>: The topic is being used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ServiceStatus")
        public Integer serviceStatus;

        /**
         * <p>The tags that are attached to the topic.</p>
         */
        @NameInMap("Tags")
        public OnsTopicListResponseBodyDataPublishInfoDoTags tags;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static OnsTopicListResponseBodyDataPublishInfoDo build(java.util.Map<String, ?> map) throws Exception {
            OnsTopicListResponseBodyDataPublishInfoDo self = new OnsTopicListResponseBodyDataPublishInfoDo();
            return TeaModel.build(map, self);
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setIndependentNaming(Boolean independentNaming) {
            this.independentNaming = independentNaming;
            return this;
        }
        public Boolean getIndependentNaming() {
            return this.independentNaming;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setMessageType(Integer messageType) {
            this.messageType = messageType;
            return this;
        }
        public Integer getMessageType() {
            return this.messageType;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setRelation(Integer relation) {
            this.relation = relation;
            return this;
        }
        public Integer getRelation() {
            return this.relation;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setRelationName(String relationName) {
            this.relationName = relationName;
            return this;
        }
        public String getRelationName() {
            return this.relationName;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setServiceStatus(Integer serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setTags(OnsTopicListResponseBodyDataPublishInfoDoTags tags) {
            this.tags = tags;
            return this;
        }
        public OnsTopicListResponseBodyDataPublishInfoDoTags getTags() {
            return this.tags;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class OnsTopicListResponseBodyData extends TeaModel {
        @NameInMap("PublishInfoDo")
        public java.util.List<OnsTopicListResponseBodyDataPublishInfoDo> publishInfoDo;

        public static OnsTopicListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsTopicListResponseBodyData self = new OnsTopicListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsTopicListResponseBodyData setPublishInfoDo(java.util.List<OnsTopicListResponseBodyDataPublishInfoDo> publishInfoDo) {
            this.publishInfoDo = publishInfoDo;
            return this;
        }
        public java.util.List<OnsTopicListResponseBodyDataPublishInfoDo> getPublishInfoDo() {
            return this.publishInfoDo;
        }

    }

}
