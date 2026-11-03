// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListChangeOrdersResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: success</li>
     * <li><strong>3xx</strong>: redirection</li>
     * <li><strong>4xx</strong>: client error</li>
     * <li><strong>5xx</strong>: server error</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the change order list.</p>
     */
    @NameInMap("Data")
    public ListChangeOrdersResponseBodyData data;

    /**
     * <p>The error code. Take note of the following items:</p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the error codes in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.NotEmpty</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information about the call result.</p>
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
     * <p>Indicates whether the change order list was successfully queried. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: the query was successful</li>
     * <li><strong>false</strong>: the query failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID, which is used to accurately query the call information.</p>
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
         * <li><strong>auto</strong>: automatic</li>
         * <li><strong>manual</strong>: manual</li>
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
         * <p>The change type, which is the description of the <strong>CoTypeCode</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Create Application</p>
         */
        @NameInMap("CoType")
        public String coType;

        /**
         * <p>The code of the change type. Valid values:</p>
         * <ul>
         * <li><strong>CoBindSlb</strong>: bind an SLB instance</li>
         * <li><strong>CoUnbindSlb</strong>: unbind an SLB instance</li>
         * <li><strong>CoCreateApp</strong>: create an application</li>
         * <li><strong>CoDeleteApp</strong>: delete an application</li>
         * <li><strong>CoDeploy</strong>: deploy an application</li>
         * <li><strong>CoRestartApplication</strong>: restart an application</li>
         * <li><strong>CoRollback</strong>: roll back an application</li>
         * <li><strong>CoScaleIn</strong>: scale in an application</li>
         * <li><strong>CoScaleOut</strong>: scale out an application</li>
         * <li><strong>CoStartApplication</strong>: start an application</li>
         * <li><strong>CoStopApplication</strong>: stop an application</li>
         * <li><strong>CoRescaleApplicationVertically</strong>: change instance specifications</li>
         * <li><strong>CoDeployHistroy</strong>: roll back to a historical version</li>
         * <li><strong>CoBindNas</strong>: bind a NAS file system</li>
         * <li><strong>CoUnbindNas</strong>: unbind a NAS file system</li>
         * <li><strong>CoBatchStartApplication</strong>: start applications in batches</li>
         * <li><strong>CoBatchStopApplication</strong>: stop applications in batches</li>
         * <li><strong>CoRestartInstances</strong>: restart instances</li>
         * <li><strong>CoDeleteInstances</strong>: delete instances</li>
         * <li><strong>CoScaleInAppWithInstances</strong>: scale in specified instances</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CoCreateApp</p>
         */
        @NameInMap("CoTypeCode")
        public String coTypeCode;

        /**
         * <p>The creation time.</p>
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
         * <p>Version: 1.0 | Image name: nginx</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The end time.</p>
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
         * <p>The source of the change order operation.</p>
         * 
         * <strong>example:</strong>
         * <p>console</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The status of the change order. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: preparing</li>
         * <li><strong>1</strong>: executing</li>
         * <li><strong>2</strong>: executed successfully</li>
         * <li><strong>3</strong>: execution failed</li>
         * <li><strong>6</strong>: terminated</li>
         * <li><strong>8</strong>: waiting for manual batch confirmation</li>
         * <li><strong>9</strong>: waiting for automatic batch confirmation</li>
         * <li><strong>10</strong>: execution failed due to a system exception</li>
         * <li><strong>11</strong>: waiting for approval</li>
         * <li><strong>12</strong>: approved and waiting for execution</li>
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
         * <p>The number of entries per page.</p>
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
