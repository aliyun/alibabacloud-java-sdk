// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListNamespaceChangeOrdersResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the request was successful.</p>
     * <p>*   **3xx**: indicates that the request was redirected.</p>
     * <p>*   **4xx**: indicates that the request was invalid.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListNamespaceChangeOrdersResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned when the request succeeds.</p>
     * <p>*   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the list of change orders was obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: indicates that the list was obtained.</p>
     * <p>*   **false**: indicates that the list could not be obtained.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It is used to query the details of a request.</p>
     */
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
        /**
         * <p>The number of release batches.</p>
         */
        @NameInMap("BatchCount")
        public Integer batchCount;

        /**
         * <p>The mode in which the release batches are determined. Valid values:</p>
         * <br>
         * <p>*   **auto**: SAE automatically determines the release batches.</p>
         * <p>*   **manual**: You must manually determine the release batches.</p>
         */
        @NameInMap("BatchType")
        public String batchType;

        /**
         * <p>The ID of the change order.</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        /**
         * <p>The type of the change order, which corresponds the **CoTypeCode** parameter.</p>
         */
        @NameInMap("CoType")
        public String coType;

        /**
         * <p>The code of the change order type. Valid values:</p>
         * <br>
         * <p>*   **CoBatchStartApplication**: starts multiple applications concurrently.</p>
         * <p>*   **CoBatchStopApplication**: stops multiple applications concurrently.</p>
         */
        @NameInMap("CoTypeCode")
        public String coTypeCode;

        /**
         * <p>The time when the change order was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the user who created the change order.</p>
         */
        @NameInMap("CreateUserId")
        public String createUserId;

        /**
         * <p>The description of the change order.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the change order was completed.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The information about release batches.</p>
         */
        @NameInMap("Pipelines")
        public String pipelines;

        /**
         * <p>The source of the change order.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status of the change order. Valid values:</p>
         * <br>
         * <p>*   **0**: The change order is being prepared.</p>
         * <p>*   **1**: The change order is being executed.</p>
         * <p>*   **2**: The change order was executed.</p>
         * <p>*   **3**: The change order could not be executed.</p>
         * <p>*   **6**: The change order was terminated.</p>
         * <p>*   **10**: The change order could not be executed due to a system exception.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the user.</p>
         */
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
        /**
         * <p>The list of change orders.</p>
         */
        @NameInMap("ChangeOrderList")
        public java.util.List<ListNamespaceChangeOrdersResponseBodyDataChangeOrderList> changeOrderList;

        /**
         * <p>The number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned on each page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of change orders.</p>
         */
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
