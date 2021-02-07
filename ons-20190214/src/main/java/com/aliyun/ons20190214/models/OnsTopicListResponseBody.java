// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsTopicListResponseBodyData data;

    public static OnsTopicListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicListResponseBody self = new OnsTopicListResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTopicListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsTopicListResponseBody setData(OnsTopicListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsTopicListResponseBodyData getData() {
        return this.data;
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
        @NameInMap("MessageType")
        public Integer messageType;

        @NameInMap("RelationName")
        public String relationName;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("IndependentNaming")
        public Boolean independentNaming;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Relation")
        public Integer relation;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("Tags")
        public OnsTopicListResponseBodyDataPublishInfoDoTags tags;

        @NameInMap("InstanceId")
        public String instanceId;

        public static OnsTopicListResponseBodyDataPublishInfoDo build(java.util.Map<String, ?> map) throws Exception {
            OnsTopicListResponseBodyDataPublishInfoDo self = new OnsTopicListResponseBodyDataPublishInfoDo();
            return TeaModel.build(map, self);
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setMessageType(Integer messageType) {
            this.messageType = messageType;
            return this;
        }
        public Integer getMessageType() {
            return this.messageType;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setRelationName(String relationName) {
            this.relationName = relationName;
            return this;
        }
        public String getRelationName() {
            return this.relationName;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setIndependentNaming(Boolean independentNaming) {
            this.independentNaming = independentNaming;
            return this;
        }
        public Boolean getIndependentNaming() {
            return this.independentNaming;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setRelation(Integer relation) {
            this.relation = relation;
            return this;
        }
        public Integer getRelation() {
            return this.relation;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setTags(OnsTopicListResponseBodyDataPublishInfoDoTags tags) {
            this.tags = tags;
            return this;
        }
        public OnsTopicListResponseBodyDataPublishInfoDoTags getTags() {
            return this.tags;
        }

        public OnsTopicListResponseBodyDataPublishInfoDo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
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
