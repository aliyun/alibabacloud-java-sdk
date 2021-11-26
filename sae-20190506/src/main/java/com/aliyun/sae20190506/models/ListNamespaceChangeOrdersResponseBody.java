// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListNamespaceChangeOrdersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListNamespaceChangeOrdersResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static ListNamespaceChangeOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNamespaceChangeOrdersResponseBody self = new ListNamespaceChangeOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNamespaceChangeOrdersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListNamespaceChangeOrdersResponseBody setData(ListNamespaceChangeOrdersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListNamespaceChangeOrdersResponseBodyData getData() {
        return this.data;
    }

    public ListNamespaceChangeOrdersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNamespaceChangeOrdersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNamespaceChangeOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNamespaceChangeOrdersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListNamespaceChangeOrdersResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListNamespaceChangeOrdersResponseBodyDataChangeOrderList extends TeaModel {
        @NameInMap("BatchCount")
        public Integer batchCount;

        @NameInMap("BatchType")
        public String batchType;

        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        @NameInMap("CoType")
        public String coType;

        @NameInMap("CoTypeCode")
        public String coTypeCode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateUserId")
        public String createUserId;

        @NameInMap("Description")
        public String description;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("Pipelines")
        public String pipelines;

        @NameInMap("Source")
        public String source;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UserId")
        public String userId;

        public static ListNamespaceChangeOrdersResponseBodyDataChangeOrderList build(java.util.Map<String, ?> map) throws Exception {
            ListNamespaceChangeOrdersResponseBodyDataChangeOrderList self = new ListNamespaceChangeOrdersResponseBodyDataChangeOrderList();
            return TeaModel.build(map, self);
        }

        public ListNamespaceChangeOrdersResponseBodyDataChangeOrderList setBatchCount(Integer batchCount) {
            this.batchCount = batchCount;
            return this;
        }
        public Integer getBatchCount() {
            return this.batchCount;
        }

        public ListNamespaceChangeOrdersResponseBodyDataChangeOrderList setBatchType(String batchType) {
            this.batchType = batchType;
            return this;
        }
        public String getBatchType() {
            return this.batchType;
        }

        public ListNamespaceChangeOrdersResponseBodyDataChangeOrderList setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public ListNamespaceChangeOrdersResponseBodyDataChangeOrderList setCoType(String coType) {
            this.coType = coType;
            return this;
        }
        public String getCoType() {
            return this.coType;
        }

        public ListNamespaceChangeOrdersResponseBodyDataChangeOrderList setCoTypeCode(String coTypeCode) {
            this.coTypeCode = coTypeCode;
            return this;
        }
        public String getCoTypeCode() {
            return this.coTypeCode;
        }

        public ListNamespaceChangeOrdersResponseBodyDataChangeOrderList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListNamespaceChangeOrdersResponseBodyDataChangeOrderList setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListNamespaceChangeOrdersResponseBodyDataChangeOrderList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListNamespaceChangeOrdersResponseBodyDataChangeOrderList setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListNamespaceChangeOrdersResponseBodyDataChangeOrderList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListNamespaceChangeOrdersResponseBodyDataChangeOrderList setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListNamespaceChangeOrdersResponseBodyDataChangeOrderList setPipelines(String pipelines) {
            this.pipelines = pipelines;
            return this;
        }
        public String getPipelines() {
            return this.pipelines;
        }

        public ListNamespaceChangeOrdersResponseBodyDataChangeOrderList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListNamespaceChangeOrdersResponseBodyDataChangeOrderList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListNamespaceChangeOrdersResponseBodyDataChangeOrderList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListNamespaceChangeOrdersResponseBodyData extends TeaModel {
        @NameInMap("ChangeOrderList")
        public java.util.List<ListNamespaceChangeOrdersResponseBodyDataChangeOrderList> changeOrderList;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListNamespaceChangeOrdersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNamespaceChangeOrdersResponseBodyData self = new ListNamespaceChangeOrdersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNamespaceChangeOrdersResponseBodyData setChangeOrderList(java.util.List<ListNamespaceChangeOrdersResponseBodyDataChangeOrderList> changeOrderList) {
            this.changeOrderList = changeOrderList;
            return this;
        }
        public java.util.List<ListNamespaceChangeOrdersResponseBodyDataChangeOrderList> getChangeOrderList() {
            return this.changeOrderList;
        }

        public ListNamespaceChangeOrdersResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListNamespaceChangeOrdersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListNamespaceChangeOrdersResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
