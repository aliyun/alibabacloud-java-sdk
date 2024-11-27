// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupListResponseBody extends TeaModel {
    /**
     * <p>The returned list of subscriptions.</p>
     */
    @NameInMap("Data")
    public OnsGroupListResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>16996623-AC4A-43AF-9248-FD9D2D75****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsGroupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupListResponseBody self = new OnsGroupListResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsGroupListResponseBody setData(OnsGroupListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsGroupListResponseBodyData getData() {
        return this.data;
    }

    public OnsGroupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsGroupListResponseBodyDataSubscribeInfoDoTagsTag extends TeaModel {
        /**
         * <p>The key of the tag that is attached to the consumer group.</p>
         * 
         * <strong>example:</strong>
         * <p>CartService</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag that is attached to the consumer group.</p>
         * 
         * <strong>example:</strong>
         * <p>ServiceA</p>
         */
        @NameInMap("Value")
        public String value;

        public static OnsGroupListResponseBodyDataSubscribeInfoDoTagsTag build(java.util.Map<String, ?> map) throws Exception {
            OnsGroupListResponseBodyDataSubscribeInfoDoTagsTag self = new OnsGroupListResponseBodyDataSubscribeInfoDoTagsTag();
            return TeaModel.build(map, self);
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDoTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDoTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class OnsGroupListResponseBodyDataSubscribeInfoDoTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<OnsGroupListResponseBodyDataSubscribeInfoDoTagsTag> tag;

        public static OnsGroupListResponseBodyDataSubscribeInfoDoTags build(java.util.Map<String, ?> map) throws Exception {
            OnsGroupListResponseBodyDataSubscribeInfoDoTags self = new OnsGroupListResponseBodyDataSubscribeInfoDoTags();
            return TeaModel.build(map, self);
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDoTags setTag(java.util.List<OnsGroupListResponseBodyDataSubscribeInfoDoTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<OnsGroupListResponseBodyDataSubscribeInfoDoTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class OnsGroupListResponseBodyDataSubscribeInfoDo extends TeaModel {
        /**
         * <p>The point in time when the consumer group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1568896605000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the consumer group.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test_group_id</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The protocol over which the queried consumer group publishes and subscribes to messages. All clients in a consumer group communicate with the ApsaraMQ for RocketMQ broker over the same protocol. You must create different consumer groups for TCP clients and HTTP clients. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong>: indicates that the consumer group publishes and subscribes to messages over TCP.</li>
         * <li><strong>http</strong>: indicates that the consumer group publishes and subscribes to messages over HTTP.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>Indicates whether the instance uses a namespace. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The instance uses a separate namespace. The name of each resource must be unique in the instance. The names of resources in different instances can be the same.</li>
         * <li><strong>false</strong>: The instance does not use a separate namespace. The name of each resource must be globally unique within the instance and across all instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IndependentNaming")
        public Boolean independentNaming;

        /**
         * <p>The ID of the instance</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_111111111111_DOxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The Alibaba Cloud account ID of the user who created the consumer group.</p>
         * 
         * <strong>example:</strong>
         * <p>138015630679****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The description of the consumer group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The tags that are attached to the consumer group.</p>
         */
        @NameInMap("Tags")
        public OnsGroupListResponseBodyDataSubscribeInfoDoTags tags;

        /**
         * <p>The most recent point in time when the consumer group was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1570700979000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static OnsGroupListResponseBodyDataSubscribeInfoDo build(java.util.Map<String, ?> map) throws Exception {
            OnsGroupListResponseBodyDataSubscribeInfoDo self = new OnsGroupListResponseBodyDataSubscribeInfoDo();
            return TeaModel.build(map, self);
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setIndependentNaming(Boolean independentNaming) {
            this.independentNaming = independentNaming;
            return this;
        }
        public Boolean getIndependentNaming() {
            return this.independentNaming;
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setTags(OnsGroupListResponseBodyDataSubscribeInfoDoTags tags) {
            this.tags = tags;
            return this;
        }
        public OnsGroupListResponseBodyDataSubscribeInfoDoTags getTags() {
            return this.tags;
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class OnsGroupListResponseBodyData extends TeaModel {
        @NameInMap("SubscribeInfoDo")
        public java.util.List<OnsGroupListResponseBodyDataSubscribeInfoDo> subscribeInfoDo;

        public static OnsGroupListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsGroupListResponseBodyData self = new OnsGroupListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsGroupListResponseBodyData setSubscribeInfoDo(java.util.List<OnsGroupListResponseBodyDataSubscribeInfoDo> subscribeInfoDo) {
            this.subscribeInfoDo = subscribeInfoDo;
            return this;
        }
        public java.util.List<OnsGroupListResponseBodyDataSubscribeInfoDo> getSubscribeInfoDo() {
            return this.subscribeInfoDo;
        }

    }

}
