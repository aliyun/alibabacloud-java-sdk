// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListGroupIdResponseBody extends TeaModel {
    /**
     * <p>The details of a queried group.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListGroupIdResponseBodyData> data;

    /**
     * <p>The request ID. This parameter is a common parameter.</p>
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

    public static class ListGroupIdResponseBodyData extends TeaModel {
        /**
         * <p>The time when the group was created.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The queried group that belongs to the ApsaraMQ for MQTT instance.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>Indicates whether a separate namespace is configured for the ApsaraMQ for MQTT instance. Valid values:</p>
         * <br>
         * <p>*   **true**: A separate namespace is configured for the ApsaraMQ for MQTT instance. Resource names must be unique within an ApsaraMQ for MQTT instance but can be the same across ApsaraMQ for MQTT instances.</p>
         * <p>*   **false**: No separate namespace is configured for the ApsaraMQ for MQTT instance. Resource names must be globally unique within an ApsaraMQ for MQTT instance and across ApsaraMQ for MQTT instances.</p>
         */
        @NameInMap("IndependentNaming")
        public Boolean independentNaming;

        /**
         * <p>The ID of the ApsaraMQ for MQTT instance to which the group belongs.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the group was last updated.</p>
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

        public ListGroupIdResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
