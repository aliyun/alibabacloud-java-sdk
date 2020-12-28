// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<OnsGroupListResponseBodyData> data;

    @NameInMap("HelpUrl")
    public String helpUrl;

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

    public OnsGroupListResponseBody setData(java.util.List<OnsGroupListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<OnsGroupListResponseBodyData> getData() {
        return this.data;
    }

    public OnsGroupListResponseBody setHelpUrl(String helpUrl) {
        this.helpUrl = helpUrl;
        return this;
    }
    public String getHelpUrl() {
        return this.helpUrl;
    }

    public static class OnsGroupListResponseBodyDataTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static OnsGroupListResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            OnsGroupListResponseBodyDataTags self = new OnsGroupListResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public OnsGroupListResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public OnsGroupListResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class OnsGroupListResponseBodyData extends TeaModel {
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
        public java.util.List<OnsGroupListResponseBodyDataTags> tags;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("GroupType")
        public String groupType;

        public static OnsGroupListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsGroupListResponseBodyData self = new OnsGroupListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsGroupListResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public OnsGroupListResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public OnsGroupListResponseBodyData setIndependentNaming(Boolean independentNaming) {
            this.independentNaming = independentNaming;
            return this;
        }
        public Boolean getIndependentNaming() {
            return this.independentNaming;
        }

        public OnsGroupListResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public OnsGroupListResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public OnsGroupListResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public OnsGroupListResponseBodyData setTags(java.util.List<OnsGroupListResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<OnsGroupListResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public OnsGroupListResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsGroupListResponseBodyData setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

    }

}
