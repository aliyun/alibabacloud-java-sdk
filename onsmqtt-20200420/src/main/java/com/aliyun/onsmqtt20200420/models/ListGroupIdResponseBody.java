// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListGroupIdResponseBody extends TeaModel {
    /**
     * <p>The details of the returned group IDs.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListGroupIdResponseBodyData> data;

    /**
     * <p>The unique ID for the request. This is a common parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>95996EEB-D894-44FA-A87C-940F5CD9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupIdResponseBody self = new ListGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupIdResponseBody setData(java.util.List<ListGroupIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListGroupIdResponseBodyData> getData() {
        return this.data;
    }

    public ListGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGroupIdResponseBodyDataTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListGroupIdResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            ListGroupIdResponseBodyDataTags self = new ListGroupIdResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public ListGroupIdResponseBodyDataTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListGroupIdResponseBodyDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListGroupIdResponseBodyData extends TeaModel {
        /**
         * <p>The creation timestamp of the group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1564577317000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test1</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>Indicates whether the instance has an independent namespace. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The instance has an independent namespace. In this case, resource names must be unique within the instance, but they can be the same as resource names in other instances.</p>
         * </li>
         * <li><p><strong>false</strong>: The instance does not have an independent namespace. In this case, resource names must be globally unique across all instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IndependentNaming")
        public Boolean independentNaming;

        /**
         * <p>The ID of the instance to which the group ID belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>post-cn-45910tj****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The tags attached to the group ID.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListGroupIdResponseBodyDataTags> tags;

        /**
         * <p>The timestamp of the last update for the group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1564577317000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListGroupIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGroupIdResponseBodyData self = new ListGroupIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGroupIdResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListGroupIdResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListGroupIdResponseBodyData setIndependentNaming(Boolean independentNaming) {
            this.independentNaming = independentNaming;
            return this;
        }
        public Boolean getIndependentNaming() {
            return this.independentNaming;
        }

        public ListGroupIdResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGroupIdResponseBodyData setTags(java.util.List<ListGroupIdResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListGroupIdResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public ListGroupIdResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
