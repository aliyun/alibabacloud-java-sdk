// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListMqSofamqGroupResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMqSofamqGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqGroupResponseBody self = new ListMqSofamqGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqGroupResponseBody setData(ListMqSofamqGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMqSofamqGroupResponseBodyData getData() {
        return this.data;
    }

    public ListMqSofamqGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMqSofamqGroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMqSofamqGroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMqSofamqGroupResponseBodyDataContent extends TeaModel {
        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("DeleteMark")
        public String deleteMark;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>Group ID</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("ReadEnable")
        public Boolean readEnable;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("RetryPerm")
        public Long retryPerm;

        @NameInMap("RetryReadQueueNum")
        public Long retryReadQueueNum;

        @NameInMap("RetryWriteQueueNum")
        public Long retryWriteQueueNum;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Version")
        public Long version;

        public static ListMqSofamqGroupResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqGroupResponseBodyDataContent self = new ListMqSofamqGroupResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqGroupResponseBodyDataContent setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListMqSofamqGroupResponseBodyDataContent setDeleteMark(String deleteMark) {
            this.deleteMark = deleteMark;
            return this;
        }
        public String getDeleteMark() {
            return this.deleteMark;
        }

        public ListMqSofamqGroupResponseBodyDataContent setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMqSofamqGroupResponseBodyDataContent setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListMqSofamqGroupResponseBodyDataContent setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListMqSofamqGroupResponseBodyDataContent setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public ListMqSofamqGroupResponseBodyDataContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMqSofamqGroupResponseBodyDataContent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMqSofamqGroupResponseBodyDataContent setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListMqSofamqGroupResponseBodyDataContent setReadEnable(Boolean readEnable) {
            this.readEnable = readEnable;
            return this;
        }
        public Boolean getReadEnable() {
            return this.readEnable;
        }

        public ListMqSofamqGroupResponseBodyDataContent setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListMqSofamqGroupResponseBodyDataContent setRetryPerm(Long retryPerm) {
            this.retryPerm = retryPerm;
            return this;
        }
        public Long getRetryPerm() {
            return this.retryPerm;
        }

        public ListMqSofamqGroupResponseBodyDataContent setRetryReadQueueNum(Long retryReadQueueNum) {
            this.retryReadQueueNum = retryReadQueueNum;
            return this;
        }
        public Long getRetryReadQueueNum() {
            return this.retryReadQueueNum;
        }

        public ListMqSofamqGroupResponseBodyDataContent setRetryWriteQueueNum(Long retryWriteQueueNum) {
            this.retryWriteQueueNum = retryWriteQueueNum;
            return this;
        }
        public Long getRetryWriteQueueNum() {
            return this.retryWriteQueueNum;
        }

        public ListMqSofamqGroupResponseBodyDataContent setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListMqSofamqGroupResponseBodyDataContent setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class ListMqSofamqGroupResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListMqSofamqGroupResponseBodyDataContent> content;

        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static ListMqSofamqGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMqSofamqGroupResponseBodyData self = new ListMqSofamqGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMqSofamqGroupResponseBodyData setContent(java.util.List<ListMqSofamqGroupResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListMqSofamqGroupResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListMqSofamqGroupResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListMqSofamqGroupResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListMqSofamqGroupResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
