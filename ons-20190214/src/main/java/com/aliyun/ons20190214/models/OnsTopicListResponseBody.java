// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<OnsTopicListResponseBodyData> data;

    @NameInMap("HelpUrl")
    public String helpUrl;

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

    public OnsTopicListResponseBody setData(java.util.List<OnsTopicListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<OnsTopicListResponseBodyData> getData() {
        return this.data;
    }

    public OnsTopicListResponseBody setHelpUrl(String helpUrl) {
        this.helpUrl = helpUrl;
        return this;
    }
    public String getHelpUrl() {
        return this.helpUrl;
    }

    public static class OnsTopicListResponseBodyDataTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static OnsTopicListResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            OnsTopicListResponseBodyDataTags self = new OnsTopicListResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public OnsTopicListResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public OnsTopicListResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class OnsTopicListResponseBodyData extends TeaModel {
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
        public java.util.List<OnsTopicListResponseBodyDataTags> tags;

        @NameInMap("InstanceId")
        public String instanceId;

        public static OnsTopicListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsTopicListResponseBodyData self = new OnsTopicListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsTopicListResponseBodyData setMessageType(Integer messageType) {
            this.messageType = messageType;
            return this;
        }
        public Integer getMessageType() {
            return this.messageType;
        }

        public OnsTopicListResponseBodyData setRelationName(String relationName) {
            this.relationName = relationName;
            return this;
        }
        public String getRelationName() {
            return this.relationName;
        }

        public OnsTopicListResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public OnsTopicListResponseBodyData setIndependentNaming(Boolean independentNaming) {
            this.independentNaming = independentNaming;
            return this;
        }
        public Boolean getIndependentNaming() {
            return this.independentNaming;
        }

        public OnsTopicListResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public OnsTopicListResponseBodyData setRelation(Integer relation) {
            this.relation = relation;
            return this;
        }
        public Integer getRelation() {
            return this.relation;
        }

        public OnsTopicListResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public OnsTopicListResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public OnsTopicListResponseBodyData setTags(java.util.List<OnsTopicListResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<OnsTopicListResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public OnsTopicListResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
