// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListChangeOrdersResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code or the POP error code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: Success.</p>
     * </li>
     * <li><p><strong>3xx</strong>: Redirect.</p>
     * </li>
     * <li><p><strong>4xx</strong>: Request error.</p>
     * </li>
     * <li><p><strong>5xx</strong>: Server error.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the change orders.</p>
     */
    @NameInMap("Data")
    public ListChangeOrdersResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>This parameter is not returned on successful requests.</p>
     * </li>
     * <li><p>Returned if the request fails. For more information, see the <strong>error code</strong> list in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Additional information about the response.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>65E1F-43BA-4D0C-8E61-E4D1337F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the list of change orders was retrieved. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The list was retrieved.</p>
     * </li>
     * <li><p><strong>false</strong>: The list could not be retrieved.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to query request details.</p>
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>164341c-9708-4967-b3ec-24933767****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The number of batches.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BatchCount")
        public Integer batchCount;

        /**
         * <p>The batch type. Valid values:</p>
         * <ul>
         * <li><p><strong>auto</strong>: Automatic.</p>
         * </li>
         * <li><p><strong>manual</strong>: Manual.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("BatchType")
        public String batchType;

        /**
         * <p>The change order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7fa5c0-9ebb-4bb4-b383-1f885447****</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        /**
         * <p>The description of the change type code (<strong>CoTypeCode</strong>).</p>
         * 
         * <strong>example:</strong>
         * <p>Create application</p>
         */
        @NameInMap("CoType")
        public String coType;

        /**
         * <p>The code of the change type. Valid values:</p>
         * <ul>
         * <li><p><strong>CoBindSlb</strong>: Bind an SLB instance.</p>
         * </li>
         * <li><p><strong>CoUnbindSlb</strong>: Unbind an SLB instance.</p>
         * </li>
         * <li><p><strong>CoCreateApp</strong>: Create an application.</p>
         * </li>
         * <li><p><strong>CoDeleteApp</strong>: Delete an application.</p>
         * </li>
         * <li><p><strong>CoDeploy</strong>: Deploy an application.</p>
         * </li>
         * <li><p><strong>CoRestartApplication</strong>: Restart an application.</p>
         * </li>
         * <li><p><strong>CoRollback</strong>: Roll back an application.</p>
         * </li>
         * <li><p><strong>CoScaleIn</strong>: Scale in an application.</p>
         * </li>
         * <li><p><strong>CoScaleOut</strong>: Scale out an application.</p>
         * </li>
         * <li><p><strong>CoStartApplication</strong>: Start an application.</p>
         * </li>
         * <li><p><strong>CoStopApplication</strong>: Stop an application.</p>
         * </li>
         * <li><p><strong>CoRescaleApplicationVertically</strong>: Change the instance type.</p>
         * </li>
         * <li><p><strong>CoDeployHistroy</strong>: Roll back to a previous version.</p>
         * </li>
         * <li><p><strong>CoBindNas</strong>: Bind a NAS file system.</p>
         * </li>
         * <li><p><strong>CoUnbindNas</strong>: Unbind a NAS file system.</p>
         * </li>
         * <li><p><strong>CoBatchStartApplication</strong>: Start multiple applications.</p>
         * </li>
         * <li><p><strong>CoBatchStopApplication</strong>: Stop multiple applications.</p>
         * </li>
         * <li><p><strong>CoRestartInstances</strong>: Restart instances.</p>
         * </li>
         * <li><p><strong>CoDeleteInstances</strong>: Delete instances.</p>
         * </li>
         * <li><p><strong>CoScaleInAppWithInstances</strong>: Scale in an application by specifying instances.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CoCreateApp</p>
         */
        @NameInMap("CoTypeCode")
        public String coTypeCode;

        /**
         * <p>The time the change order was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-07-11 15:54:49</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the user who created the change order.</p>
         * 
         * <strong>example:</strong>
         * <p>sae-beta-test</p>
         */
        @NameInMap("CreateUserId")
        public String createUserId;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Version: 1.0 | image name: nginx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time the change order was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-07-11 20:12:58</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c9ecd2-cf6c-46c3-9f20-525de202****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The source of the change order.</p>
         * 
         * <strong>example:</strong>
         * <p>console</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status of the change order. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Preparing.</p>
         * </li>
         * <li><p><strong>1</strong>: In progress.</p>
         * </li>
         * <li><p><strong>2</strong>: Succeeded.</p>
         * </li>
         * <li><p><strong>3</strong>: Failed.</p>
         * </li>
         * <li><p><strong>6</strong>: Aborted.</p>
         * </li>
         * <li><p><strong>8</strong>: Paused for manual confirmation.</p>
         * </li>
         * <li><p><strong>9</strong>: Paused for automatic confirmation.</p>
         * </li>
         * <li><p><strong>10</strong>: Failed due to a system exception.</p>
         * </li>
         * <li><p><strong>11</strong>: Pending approval.</p>
         * </li>
         * <li><p><strong>12</strong>: Approved and pending execution.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The user ID.</p>
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
         * <p>The list of change orders.</p>
         */
        @NameInMap("ChangeOrderList")
        public java.util.List<ListChangeOrdersResponseBodyDataChangeOrderList> changeOrderList;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of change orders.</p>
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
