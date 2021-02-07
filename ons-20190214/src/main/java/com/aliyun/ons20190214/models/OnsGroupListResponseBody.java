// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsGroupListResponseBodyData data;

    public static OnsGroupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupListResponseBody self = new OnsGroupListResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsGroupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsGroupListResponseBody setData(OnsGroupListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsGroupListResponseBodyData getData() {
        return this.data;
    }

    public static class OnsGroupListResponseBodyDataSubscribeInfoDoTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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
        @NameInMap("Owner")
        public String owner;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("IndependentNaming")
        public Boolean independentNaming;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Tags")
        public OnsGroupListResponseBodyDataSubscribeInfoDoTags tags;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("GroupType")
        public String groupType;

        public static OnsGroupListResponseBodyDataSubscribeInfoDo build(java.util.Map<String, ?> map) throws Exception {
            OnsGroupListResponseBodyDataSubscribeInfoDo self = new OnsGroupListResponseBodyDataSubscribeInfoDo();
            return TeaModel.build(map, self);
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setIndependentNaming(Boolean independentNaming) {
            this.independentNaming = independentNaming;
            return this;
        }
        public Boolean getIndependentNaming() {
            return this.independentNaming;
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setTags(OnsGroupListResponseBodyDataSubscribeInfoDoTags tags) {
            this.tags = tags;
            return this;
        }
        public OnsGroupListResponseBodyDataSubscribeInfoDoTags getTags() {
            return this.tags;
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsGroupListResponseBodyDataSubscribeInfoDo setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
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
