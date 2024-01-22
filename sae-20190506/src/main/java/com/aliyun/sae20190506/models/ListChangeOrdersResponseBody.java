// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListChangeOrdersResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the list of change orders was obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: indicates that the list was obtained.</p>
     * <p>*   **false**: indicates that the list could not be obtained.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("Data")
    public ListChangeOrdersResponseBodyData data;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the request was successful.</p>
     * <p>*   **3xx**: indicates that the request was redirected.</p>
     * <p>*   **4xx**: indicates that the request was invalid.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the trace. It is used to query the details of a request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The information about change orders.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListChangeOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChangeOrdersResponseBody self = new ListChangeOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChangeOrdersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChangeOrdersResponseBody setData(ListChangeOrdersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListChangeOrdersResponseBodyData getData() {
        return this.data;
    }

    public ListChangeOrdersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListChangeOrdersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListChangeOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChangeOrdersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListChangeOrdersResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListChangeOrdersResponseBodyDataChangeOrderList extends TeaModel {
        /**
         * <p>The number of entries returned on each page.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the user who created the change order.</p>
         */
        @NameInMap("BatchCount")
        public Integer batchCount;

        /**
         * <p>The ID of the group.</p>
         */
        @NameInMap("BatchType")
        public String batchType;

        /**
         * <p>The mode in which the release batches are determined. Valid values:</p>
         * <br>
         * <p>*   **auto**: SAE automatically determines the release batches.</p>
         * <p>*   **manual**: You must manually determine the release batches.</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("CoType")
        public String coType;

        /**
         * <p>The ID of the change order.</p>
         */
        @NameInMap("CoTypeCode")
        public String coTypeCode;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The code of the change type. Valid values:</p>
         * <br>
         * <p>*   **CoBindSlb**: associates an SLB instance with the application.</p>
         * <p>*   **CoUnbindSlb**: disassociates the SLB instance from the application.</p>
         * <p>*   **CoCreateApp**: creates the application.</p>
         * <p>*   **CoDeleteApp**: deletes the application.</p>
         * <p>*   **CoDeploy**: deploys the application.</p>
         * <p>*   **CoRestartApplication**: restarts the application.</p>
         * <p>*   **CoRollback**: rolls back the application.</p>
         * <p>*   **CoScaleIn**: scales in the application.</p>
         * <p>*   **CoScaleOut**: scales out the application.</p>
         * <p>*   **CoStart**: starts the application.</p>
         * <p>*   **CoStop**: stops the application.</p>
         * <p>*   **CoRescaleApplicationVertically**: modifies the instance specifications.</p>
         * <p>*   **CoDeployHistroy**: rolls back the application to a historical version.</p>
         * <p>*   **CoBindNas**: associates a NAS file system with the application.</p>
         * <p>*   **CoUnbindNas**: disassociates the NAS file system from the application.</p>
         * <p>*   **CoBatchStartApplication**: starts multiple applications concurrently.</p>
         * <p>*   **CoBatchStopApplication**: stops multiple applications concurrently.</p>
         * <p>*   **CoRestartInstances**: restarts the instances.</p>
         * <p>*   **CoDeleteInstances**: deletes the instances.</p>
         * <p>*   **CoScaleInAppWithInstances**: reduces the number of the specified application instances.</p>
         */
        @NameInMap("CreateUserId")
        public String createUserId;

        /**
         * <p>The change type, which corresponds to the **CoTypeCode** parameter.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the change order was created.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The description about the application.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The number of release batches.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The time when the change order was completed.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The source of the change order.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListChangeOrdersResponseBodyDataChangeOrderList build(java.util.Map<String, ?> map) throws Exception {
            ListChangeOrdersResponseBodyDataChangeOrderList self = new ListChangeOrdersResponseBodyDataChangeOrderList();
            return TeaModel.build(map, self);
        }

        public ListChangeOrdersResponseBodyDataChangeOrderList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListChangeOrdersResponseBodyDataChangeOrderList setBatchCount(Integer batchCount) {
            this.batchCount = batchCount;
            return this;
        }
        public Integer getBatchCount() {
            return this.batchCount;
        }

        public ListChangeOrdersResponseBodyDataChangeOrderList setBatchType(String batchType) {
            this.batchType = batchType;
            return this;
        }
        public String getBatchType() {
            return this.batchType;
        }

        public ListChangeOrdersResponseBodyDataChangeOrderList setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public ListChangeOrdersResponseBodyDataChangeOrderList setCoType(String coType) {
            this.coType = coType;
            return this;
        }
        public String getCoType() {
            return this.coType;
        }

        public ListChangeOrdersResponseBodyDataChangeOrderList setCoTypeCode(String coTypeCode) {
            this.coTypeCode = coTypeCode;
            return this;
        }
        public String getCoTypeCode() {
            return this.coTypeCode;
        }

        public ListChangeOrdersResponseBodyDataChangeOrderList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListChangeOrdersResponseBodyDataChangeOrderList setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListChangeOrdersResponseBodyDataChangeOrderList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListChangeOrdersResponseBodyDataChangeOrderList setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListChangeOrdersResponseBodyDataChangeOrderList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListChangeOrdersResponseBodyDataChangeOrderList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListChangeOrdersResponseBodyDataChangeOrderList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListChangeOrdersResponseBodyDataChangeOrderList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListChangeOrdersResponseBodyData extends TeaModel {
        /**
         * <p>The status of the change order. Valid values:</p>
         * <br>
         * <p>*   **0**: The change order is being prepared.</p>
         * <p>*   **1**: The change order is being executed.</p>
         * <p>*   **2**: The change order was executed.</p>
         * <p>*   **3**: The change order could not be executed.</p>
         * <p>*   **6**: The change order was terminated.</p>
         * <p>*   **8**: The execution process is pending. You must manually determine the release batch.</p>
         * <p>*   **9**: The execution process is pending. SAE will automatically determine the release batch.</p>
         * <p>*   **10**: The change order could not be executed due to a system exception.</p>
         * <p>*   **11**: The change order is pending approval.</p>
         * <p>*   **12**: The change order is approved and is pending execution.</p>
         */
        @NameInMap("ChangeOrderList")
        public java.util.List<ListChangeOrdersResponseBodyDataChangeOrderList> changeOrderList;

        /**
         * <p>The total number of change orders.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The error code.</p>
         * <br>
         * <p>*   The **ErrorCode** parameter is not returned when the request succeeds.</p>
         * <p>*   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of change orders.</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListChangeOrdersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListChangeOrdersResponseBodyData self = new ListChangeOrdersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListChangeOrdersResponseBodyData setChangeOrderList(java.util.List<ListChangeOrdersResponseBodyDataChangeOrderList> changeOrderList) {
            this.changeOrderList = changeOrderList;
            return this;
        }
        public java.util.List<ListChangeOrdersResponseBodyDataChangeOrderList> getChangeOrderList() {
            return this.changeOrderList;
        }

        public ListChangeOrdersResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListChangeOrdersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListChangeOrdersResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
