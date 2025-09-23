// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListMigrationOperationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Instance.NotFound</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListMigrationOperationsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>consumerGroupId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>The topic already exists.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>C7E8AE3A-219B-52EE-BE32-4036F5F88833</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>[]</p>
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
         * <strong>example:</strong>
         * <p>[]</p>
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
         * <strong>example:</strong>
         * <p>CONNECT_PENDING</p>
         */
        @NameInMap("businessStatus")
        public String businessStatus;

        /**
         * <strong>example:</strong>
         * <p>2022-08-01 00:00:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("migrationId")
        public Long migrationId;

        /**
         * <strong>example:</strong>
         * <p>183</p>
         */
        @NameInMap("operationId")
        public Long operationId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("operationKey")
        public String operationKey;

        @NameInMap("operationParam")
        public ListMigrationOperationsResponseBodyDataListOperationParam operationParam;

        @NameInMap("operationResult")
        public ListMigrationOperationsResponseBodyDataListOperationResult operationResult;

        /**
         * <strong>example:</strong>
         * <p>DOING</p>
         */
        @NameInMap("operationStatus")
        public String operationStatus;

        /**
         * <strong>example:</strong>
         * <p>IMPORT_CONSUMER_GROUP</p>
         */
        @NameInMap("operationType")
        public String operationType;

        /**
         * <strong>example:</strong>
         * <p>CONNECT_NETWORK</p>
         */
        @NameInMap("stageType")
        public String stageType;

        /**
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
        @NameInMap("list")
        public java.util.List<ListMigrationOperationsResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
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
