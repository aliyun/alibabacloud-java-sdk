// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicListResponseBody extends TeaModel {
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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("IndependentNaming")
        public Boolean independentNaming;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MessageType")
        public Integer messageType;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Relation")
        public Integer relation;

        @NameInMap("RelationName")
        public String relationName;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ServiceStatus")
        public Integer serviceStatus;

        @NameInMap("Tags")
        public OnsTopicListResponseBodyDataPublishInfoDoTags tags;

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
