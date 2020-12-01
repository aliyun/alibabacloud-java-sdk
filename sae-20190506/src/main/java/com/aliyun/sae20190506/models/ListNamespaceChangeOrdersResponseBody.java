// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListNamespaceChangeOrdersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("TraceId")
    @Validation(required = true)
    public String traceId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public ListNamespaceChangeOrdersResponseBodyData data;

    public static ListNamespaceChangeOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNamespaceChangeOrdersResponseBody self = new ListNamespaceChangeOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNamespaceChangeOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNamespaceChangeOrdersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListNamespaceChangeOrdersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNamespaceChangeOrdersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNamespaceChangeOrdersResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ListNamespaceChangeOrdersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListNamespaceChangeOrdersResponseBody setData(ListNamespaceChangeOrdersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListNamespaceChangeOrdersResponseBodyData getData() {
        return this.data;
    }

    public static class ListNamespaceChangeOrdersResponseBodyDataChangeOrderList extends TeaModel {
        @NameInMap("NamespaceId")
        @Validation(required = true)
        public String namespaceId;

        @NameInMap("BatchCount")
        @Validation(required = true)
        public Integer batchCount;

        @NameInMap("BatchType")
        @Validation(required = true)
        public String batchType;

        @NameInMap("ChangeOrderId")
        @Validation(required = true)
        public String changeOrderId;

        @NameInMap("CoType")
        @Validation(required = true)
        public String coType;

        @NameInMap("CoTypeCode")
        @Validation(required = true)
        public String coTypeCode;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public String finishTime;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("Pipelines")
        @Validation(required = true)
        public String pipelines;

        @NameInMap("Source")
        @Validation(required = true)
        public String source;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("CreateUserId")
        @Validation(required = true)
        public String createUserId;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        public static ListNamespaceChangeOrdersResponseBodyDataChangeOrderList build(java.util.Map<String, ?> map) throws Exception {
            ListNamespaceChangeOrdersResponseBodyDataChangeOrderList self = new ListNamespaceChangeOrdersResponseBodyDataChangeOrderList();
            return TeaModel.build(map, self);
        }

        public ListNamespaceChangeOrdersResponseBodyDataChangeOrderList setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
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

        public ListNamespaceChangeOrdersResponseBodyDataChangeOrderList setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
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
        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalSize")
        @Validation(required = true)
        public Integer totalSize;

        @NameInMap("ChangeOrderList")
        @Validation(required = true)
        public java.util.List<ListNamespaceChangeOrdersResponseBodyDataChangeOrderList> changeOrderList;

        public static ListNamespaceChangeOrdersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNamespaceChangeOrdersResponseBodyData self = new ListNamespaceChangeOrdersResponseBodyData();
            return TeaModel.build(map, self);
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

        public ListNamespaceChangeOrdersResponseBodyData setChangeOrderList(java.util.List<ListNamespaceChangeOrdersResponseBodyDataChangeOrderList> changeOrderList) {
            this.changeOrderList = changeOrderList;
            return this;
        }
        public java.util.List<ListNamespaceChangeOrdersResponseBodyDataChangeOrderList> getChangeOrderList() {
            return this.changeOrderList;
        }

    }

}
