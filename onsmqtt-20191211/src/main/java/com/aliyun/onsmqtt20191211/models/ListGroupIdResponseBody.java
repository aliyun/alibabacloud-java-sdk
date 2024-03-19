// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20191211.models;

import com.aliyun.tea.*;

public class ListGroupIdResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListGroupIdResponseBodyData> data;

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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("IndependentNaming")
        public Boolean independentNaming;

        @NameInMap("InstanceId")
        public String instanceId;

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
