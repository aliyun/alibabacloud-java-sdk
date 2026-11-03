// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListNamespaceChangeOrdersResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
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
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public ListNamespaceChangeOrdersResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>Request succeeded: The <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>Request failed: The <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Resouce.no.permission</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information about the API call result.</p>
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
     * <p>0bc3915638507554994370d****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the change order list was successfully retrieved. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The list was successfully retrieved.</li>
     * <li><strong>false</strong>: The retrieval failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to query the exact call information.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc3915638507554994370d****</p>
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
         * <p>The number of batches.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BatchCount")
        public Integer batchCount;

        /**
         * <p>The batch type.</p>
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
         * <p>The type of the change order, which is the description of <strong>CoTypeCode</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>msg.docker.app.actions.CoBatchStartApplication</p>
         */
        @NameInMap("CoType")
        public String coType;

        /**
         * <p>The code of the change order type. Valid values:</p>
         * <ul>
         * <li><strong>CoBatchStartApplication</strong>: Starts applications in batches.</li>
         * <li><strong>CoBatchStopApplication</strong>: Stops applications in batches.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CoBatchStartApplication</p>
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
         * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
         */
        @NameInMap("CreateUserId")
        public String createUserId;

        /**
         * <p>The description of the change order.</p>
         * 
         * <strong>example:</strong>
         * <p>Batch Start Applications</p>
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
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai:test</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The change pipelines.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("Pipelines")
        public String pipelines;

        /**
         * <p>The source from which the change order was initiated.</p>
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
         * <li><strong>2</strong>: succeeded</li>
         * <li><strong>3</strong>: failed</li>
         * <li><strong>6</strong>: terminated</li>
         * <li><strong>10</strong>: failed due to a system exception</li>
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
         * <p>test_sae</p>
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
         * <p>32</p>
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
