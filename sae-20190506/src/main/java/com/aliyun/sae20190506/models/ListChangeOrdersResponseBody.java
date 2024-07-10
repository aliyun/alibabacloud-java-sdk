// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListChangeOrdersResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the list of change orders was obtained. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: indicates that the list was obtained.</li>
     * <li><strong>false</strong>: indicates that the list could not be obtained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * <ul>
     * <li><strong>2xx</strong>: indicates that the request was successful.</li>
     * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
     * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
     * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the trace. It is used to query the details of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>65E1F-43BA-4D0C-8E61-E4D1337F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The information about change orders.</p>
     * 
     * <strong>example:</strong>
     * <p>0bb6f815638568884597879d****</p>
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
         * 
         * <strong>example:</strong>
         * <p>164341c-9708-4967-b3ec-24933767****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the user who created the change order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BatchCount")
        public Integer batchCount;

        /**
         * <p>The ID of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("BatchType")
        public String batchType;

        /**
         * <p>The mode in which the release batches are determined. Valid values:</p>
         * <ul>
         * <li><strong>auto</strong>: SAE automatically determines the release batches.</li>
         * <li><strong>manual</strong>: You must manually determine the release batches.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7fa5c0-9ebb-4bb4-b383-1f885447****</p>
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
         * 
         * <strong>example:</strong>
         * <p>CoCreateApp</p>
         */
        @NameInMap("CoTypeCode")
        public String coTypeCode;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-07-11 15:54:49</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The code of the change type. Valid values:</p>
         * <ul>
         * <li><strong>CoBindSlb</strong>: associates an SLB instance with the application.</li>
         * <li><strong>CoUnbindSlb</strong>: disassociates the SLB instance from the application.</li>
         * <li><strong>CoCreateApp</strong>: creates the application.</li>
         * <li><strong>CoDeleteApp</strong>: deletes the application.</li>
         * <li><strong>CoDeploy</strong>: deploys the application.</li>
         * <li><strong>CoRestartApplication</strong>: restarts the application.</li>
         * <li><strong>CoRollback</strong>: rolls back the application.</li>
         * <li><strong>CoScaleIn</strong>: scales in the application.</li>
         * <li><strong>CoScaleOut</strong>: scales out the application.</li>
         * <li><strong>CoStart</strong>: starts the application.</li>
         * <li><strong>CoStop</strong>: stops the application.</li>
         * <li><strong>CoRescaleApplicationVertically</strong>: modifies the instance specifications.</li>
         * <li><strong>CoDeployHistroy</strong>: rolls back the application to a historical version.</li>
         * <li><strong>CoBindNas</strong>: associates a NAS file system with the application.</li>
         * <li><strong>CoUnbindNas</strong>: disassociates the NAS file system from the application.</li>
         * <li><strong>CoBatchStartApplication</strong>: starts multiple applications concurrently.</li>
         * <li><strong>CoBatchStopApplication</strong>: stops multiple applications concurrently.</li>
         * <li><strong>CoRestartInstances</strong>: restarts the instances.</li>
         * <li><strong>CoDeleteInstances</strong>: deletes the instances.</li>
         * <li><strong>CoScaleInAppWithInstances</strong>: reduces the number of the specified application instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sae-beta-test</p>
         */
        @NameInMap("CreateUserId")
        public String createUserId;

        /**
         * <p>The change type, which corresponds to the <strong>CoTypeCode</strong> parameter.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the change order was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-07-11 20:12:58</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The description about the application.</p>
         * 
         * <strong>example:</strong>
         * <p>c9ecd2-cf6c-46c3-9f20-525de202****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The number of release batches.</p>
         * 
         * <strong>example:</strong>
         * <p>console</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The time when the change order was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The source of the change order.</p>
         * 
         * <strong>example:</strong>
         * <p>sae-beta-test</p>
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
         * <ul>
         * <li><strong>0</strong>: The change order is being prepared.</li>
         * <li><strong>1</strong>: The change order is being executed.</li>
         * <li><strong>2</strong>: The change order was executed.</li>
         * <li><strong>3</strong>: The change order could not be executed.</li>
         * <li><strong>6</strong>: The change order was terminated.</li>
         * <li><strong>8</strong>: The execution process is pending. You must manually determine the release batch.</li>
         * <li><strong>9</strong>: The execution process is pending. SAE will automatically determine the release batch.</li>
         * <li><strong>10</strong>: The change order could not be executed due to a system exception.</li>
         * <li><strong>11</strong>: The change order is pending approval.</li>
         * <li><strong>12</strong>: The change order is approved and is pending execution.</li>
         * </ul>
         */
        @NameInMap("ChangeOrderList")
        public java.util.List<ListChangeOrdersResponseBodyDataChangeOrderList> changeOrderList;

        /**
         * <p>The total number of change orders.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The error code.</p>
         * <ul>
         * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
         * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of change orders.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
