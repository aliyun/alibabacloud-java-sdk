// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListMigrationOperationsResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance.NotFound</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public ListMigrationOperationsResponseBodyData data;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>consumerGroupId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The topic already exists.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C7E8AE3A-219B-52EE-BE32-4036F5F88833</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListMigrationOperationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationOperationsResponseBody self = new ListMigrationOperationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMigrationOperationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMigrationOperationsResponseBody setData(ListMigrationOperationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMigrationOperationsResponseBodyData getData() {
        return this.data;
    }

    public ListMigrationOperationsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListMigrationOperationsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListMigrationOperationsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMigrationOperationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMigrationOperationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMigrationOperationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMigrationOperationsResponseBodyDataListOperationParam extends TeaModel {
        /**
         * <p>The parameter information.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;action&quot;: &quot;MIGRATE_FORWARD&quot;,
         *       &quot;targetStage&quot;: &quot;MIGRATE_FINISH&quot;
         * }</p>
         */
        @NameInMap("paramData")
        public Object paramData;

        public static ListMigrationOperationsResponseBodyDataListOperationParam build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationOperationsResponseBodyDataListOperationParam self = new ListMigrationOperationsResponseBodyDataListOperationParam();
            return TeaModel.build(map, self);
        }

        public ListMigrationOperationsResponseBodyDataListOperationParam setParamData(Object paramData) {
            this.paramData = paramData;
            return this;
        }
        public Object getParamData() {
            return this.paramData;
        }

    }

    public static class ListMigrationOperationsResponseBodyDataListOperationResult extends TeaModel {
        /**
         * <p>The operation result.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;checkStatus&quot;: &quot;WAIT_CHECK&quot;,
         *       &quot;sourceTopicStatus&quot;: &quot;PERM_6&quot;,
         *       &quot;targetTopicStatus&quot;: &quot;PERM_4&quot;,
         *       &quot;checkResult&quot;: {},
         *       &quot;migrateStage&quot;: &quot;DOUBLE_READ&quot;
         * }</p>
         */
        @NameInMap("resultData")
        public Object resultData;

        public static ListMigrationOperationsResponseBodyDataListOperationResult build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationOperationsResponseBodyDataListOperationResult self = new ListMigrationOperationsResponseBodyDataListOperationResult();
            return TeaModel.build(map, self);
        }

        public ListMigrationOperationsResponseBodyDataListOperationResult setResultData(Object resultData) {
            this.resultData = resultData;
            return this;
        }
        public Object getResultData() {
            return this.resultData;
        }

    }

    public static class ListMigrationOperationsResponseBodyDataList extends TeaModel {
        /**
         * <p>The operation business status.</p>
         * 
         * <strong>example:</strong>
         * <p>DOUBLE_READ</p>
         */
        @NameInMap("businessStatus")
        public String businessStatus;

        /**
         * <p>The creation time, in the format of YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01 00:00:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The migration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("migrationId")
        public Long migrationId;

        /**
         * <p>The migration operation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>183</p>
         */
        @NameInMap("operationId")
        public Long operationId;

        /**
         * <p>The primary key of the operation object.</p>
         * <blockquote>
         * <ul>
         * <li>During the message migration stage, the operation object is the topic name.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>normal-topic-1</p>
         */
        @NameInMap("operationKey")
        public String operationKey;

        /**
         * <p>The operation parameter.</p>
         */
        @NameInMap("operationParam")
        public ListMigrationOperationsResponseBodyDataListOperationParam operationParam;

        /**
         * <p>The operation result.</p>
         */
        @NameInMap("operationResult")
        public ListMigrationOperationsResponseBodyDataListOperationResult operationResult;

        /**
         * <p>The operation status.</p>
         * 
         * <strong>example:</strong>
         * <p>DOING</p>
         */
        @NameInMap("operationStatus")
        public String operationStatus;

        /**
         * <p>The operation type.</p>
         * 
         * <strong>example:</strong>
         * <p>MIGRATE_MESSAGE</p>
         */
        @NameInMap("operationType")
        public String operationType;

        /**
         * <p>The migration stage type.</p>
         * 
         * <strong>example:</strong>
         * <p>MIGRATE_MESSAGE</p>
         */
        @NameInMap("stageType")
        public String stageType;

        /**
         * <p>The update time, in the format of YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01 20:05:50</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListMigrationOperationsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationOperationsResponseBodyDataList self = new ListMigrationOperationsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListMigrationOperationsResponseBodyDataList setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public ListMigrationOperationsResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMigrationOperationsResponseBodyDataList setMigrationId(Long migrationId) {
            this.migrationId = migrationId;
            return this;
        }
        public Long getMigrationId() {
            return this.migrationId;
        }

        public ListMigrationOperationsResponseBodyDataList setOperationId(Long operationId) {
            this.operationId = operationId;
            return this;
        }
        public Long getOperationId() {
            return this.operationId;
        }

        public ListMigrationOperationsResponseBodyDataList setOperationKey(String operationKey) {
            this.operationKey = operationKey;
            return this;
        }
        public String getOperationKey() {
            return this.operationKey;
        }

        public ListMigrationOperationsResponseBodyDataList setOperationParam(ListMigrationOperationsResponseBodyDataListOperationParam operationParam) {
            this.operationParam = operationParam;
            return this;
        }
        public ListMigrationOperationsResponseBodyDataListOperationParam getOperationParam() {
            return this.operationParam;
        }

        public ListMigrationOperationsResponseBodyDataList setOperationResult(ListMigrationOperationsResponseBodyDataListOperationResult operationResult) {
            this.operationResult = operationResult;
            return this;
        }
        public ListMigrationOperationsResponseBodyDataListOperationResult getOperationResult() {
            return this.operationResult;
        }

        public ListMigrationOperationsResponseBodyDataList setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public String getOperationStatus() {
            return this.operationStatus;
        }

        public ListMigrationOperationsResponseBodyDataList setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListMigrationOperationsResponseBodyDataList setStageType(String stageType) {
            this.stageType = stageType;
            return this;
        }
        public String getStageType() {
            return this.stageType;
        }

        public ListMigrationOperationsResponseBodyDataList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListMigrationOperationsResponseBodyData extends TeaModel {
        /**
         * <p>The paginated data.</p>
         */
        @NameInMap("list")
        public java.util.List<ListMigrationOperationsResponseBodyDataList> list;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListMigrationOperationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationOperationsResponseBodyData self = new ListMigrationOperationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMigrationOperationsResponseBodyData setList(java.util.List<ListMigrationOperationsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListMigrationOperationsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListMigrationOperationsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListMigrationOperationsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListMigrationOperationsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
