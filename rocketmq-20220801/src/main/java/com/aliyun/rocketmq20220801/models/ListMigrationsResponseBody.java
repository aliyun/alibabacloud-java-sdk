// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListMigrationsResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>MissingInstanceId</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public ListMigrationsResponseBodyData data;

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
     * <p>instanceId</p>
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
     * <p>The instance cannot be found.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E5897B2E-C3AC-56DC-A482-F0E9E53F48D5</p>
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

    public static ListMigrationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationsResponseBody self = new ListMigrationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMigrationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMigrationsResponseBody setData(ListMigrationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMigrationsResponseBodyData getData() {
        return this.data;
    }

    public ListMigrationsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListMigrationsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListMigrationsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMigrationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMigrationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMigrationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMigrationsResponseBodyDataListCurrentStage extends TeaModel {
        /**
         * <p>The stage data.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("stageData")
        public Object stageData;

        /**
         * <p>The stage status. Valid values:</p>
         * <ul>
         * <li>INIT: Not started.</li>
         * <li>DOING: In progress.</li>
         * <li>DONE: Completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DOING</p>
         */
        @NameInMap("stageStatus")
        public String stageStatus;

        /**
         * <p>The stage type. Valid values:</p>
         * <ul>
         * <li>CONNECT_NETWORK: Network connection.</li>
         * <li>MIGRATE_METADATA: Metadata migration.</li>
         * <li>REPLACE_ENDPOINT: Endpoint replacement.</li>
         * <li>MIGRATE_MESSAGE: Message migration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MIGRATE_METADATA</p>
         */
        @NameInMap("stageType")
        public String stageType;

        public static ListMigrationsResponseBodyDataListCurrentStage build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationsResponseBodyDataListCurrentStage self = new ListMigrationsResponseBodyDataListCurrentStage();
            return TeaModel.build(map, self);
        }

        public ListMigrationsResponseBodyDataListCurrentStage setStageData(Object stageData) {
            this.stageData = stageData;
            return this;
        }
        public Object getStageData() {
            return this.stageData;
        }

        public ListMigrationsResponseBodyDataListCurrentStage setStageStatus(String stageStatus) {
            this.stageStatus = stageStatus;
            return this;
        }
        public String getStageStatus() {
            return this.stageStatus;
        }

        public ListMigrationsResponseBodyDataListCurrentStage setStageType(String stageType) {
            this.stageType = stageType;
            return this;
        }
        public String getStageType() {
            return this.stageType;
        }

    }

    public static class ListMigrationsResponseBodyDataListMigrationSource extends TeaModel {
        /**
         * <p>The migration source data.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;clusterType&quot;:&quot;INTERNET_NETWORK&quot;,
         * &quot;aclType&quot;:&quot;NONE&quot;,
         * &quot;clusterName&quot;:&quot;test&quot;,
         * &quot;namesrvAddrList&quot;:&quot;47.110.248.xxx:9876&quot;],
         * &quot;brokerObtainMethod&quot;:&quot;AUTO_OBTAIN&quot;
         * }</p>
         */
        @NameInMap("sourceData")
        public Object sourceData;

        /**
         * <p>The migration source type. Valid values:</p>
         * <ul>
         * <li>EXTERNAL_INSTANCE: External instance.</li>
         * <li>INTERNAL_INSTANCE: Alibaba Cloud 5.0 instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXTERNAL_INSTANCE</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static ListMigrationsResponseBodyDataListMigrationSource build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationsResponseBodyDataListMigrationSource self = new ListMigrationsResponseBodyDataListMigrationSource();
            return TeaModel.build(map, self);
        }

        public ListMigrationsResponseBodyDataListMigrationSource setSourceData(Object sourceData) {
            this.sourceData = sourceData;
            return this;
        }
        public Object getSourceData() {
            return this.sourceData;
        }

        public ListMigrationsResponseBodyDataListMigrationSource setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class ListMigrationsResponseBodyDataListMigrationTarget extends TeaModel {
        /**
         * <p>The migration target data.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;clusterType&quot;:&quot;ROCKETMQ_V5&quot;,
         * &quot;instanceId&quot;:&quot;rmq-cn-778429mp301&quot;,
         * &quot;regionId&quot;:&quot;cn-hangzhou&quot;
         * }</p>
         */
        @NameInMap("targetData")
        public Object targetData;

        /**
         * <p>The migration target type. Valid values:</p>
         * <ul>
         * <li>INTERNAL_INSTANCE: Alibaba Cloud 5.0 instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INTERNAL_INSTANCE</p>
         */
        @NameInMap("targetType")
        public String targetType;

        public static ListMigrationsResponseBodyDataListMigrationTarget build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationsResponseBodyDataListMigrationTarget self = new ListMigrationsResponseBodyDataListMigrationTarget();
            return TeaModel.build(map, self);
        }

        public ListMigrationsResponseBodyDataListMigrationTarget setTargetData(Object targetData) {
            this.targetData = targetData;
            return this;
        }
        public Object getTargetData() {
            return this.targetData;
        }

        public ListMigrationsResponseBodyDataListMigrationTarget setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class ListMigrationsResponseBodyDataList extends TeaModel {
        /**
         * <p>The creation time, in YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01 00:00:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The current migration stage.</p>
         */
        @NameInMap("currentStage")
        public ListMigrationsResponseBodyDataListCurrentStage currentStage;

        /**
         * <p>The migration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("migrationId")
        public Long migrationId;

        /**
         * <p>The migration name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("migrationName")
        public String migrationName;

        /**
         * <p>The migration source.</p>
         */
        @NameInMap("migrationSource")
        public ListMigrationsResponseBodyDataListMigrationSource migrationSource;

        /**
         * <p>The migration status. Valid values:</p>
         * <ul>
         * <li>CREATED: Created.</li>
         * <li>MIGRATING: Migrating.</li>
         * <li>COMPLETED: Completed.</li>
         * <li>CANCELLED: Cancelled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MIGRATING</p>
         */
        @NameInMap("migrationStatus")
        public String migrationStatus;

        /**
         * <p>The migration target.</p>
         */
        @NameInMap("migrationTarget")
        public ListMigrationsResponseBodyDataListMigrationTarget migrationTarget;

        /**
         * <p>The migration type. Valid values:</p>
         * <ul>
         * <li>INSTANCE_MIGRATION: instance migration</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE_MIGRATION</p>
         */
        @NameInMap("migrationType")
        public String migrationType;

        /**
         * <p>The modification time, in YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-01 20:05:50</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("userId")
        public String userId;

        public static ListMigrationsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationsResponseBodyDataList self = new ListMigrationsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListMigrationsResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMigrationsResponseBodyDataList setCurrentStage(ListMigrationsResponseBodyDataListCurrentStage currentStage) {
            this.currentStage = currentStage;
            return this;
        }
        public ListMigrationsResponseBodyDataListCurrentStage getCurrentStage() {
            return this.currentStage;
        }

        public ListMigrationsResponseBodyDataList setMigrationId(Long migrationId) {
            this.migrationId = migrationId;
            return this;
        }
        public Long getMigrationId() {
            return this.migrationId;
        }

        public ListMigrationsResponseBodyDataList setMigrationName(String migrationName) {
            this.migrationName = migrationName;
            return this;
        }
        public String getMigrationName() {
            return this.migrationName;
        }

        public ListMigrationsResponseBodyDataList setMigrationSource(ListMigrationsResponseBodyDataListMigrationSource migrationSource) {
            this.migrationSource = migrationSource;
            return this;
        }
        public ListMigrationsResponseBodyDataListMigrationSource getMigrationSource() {
            return this.migrationSource;
        }

        public ListMigrationsResponseBodyDataList setMigrationStatus(String migrationStatus) {
            this.migrationStatus = migrationStatus;
            return this;
        }
        public String getMigrationStatus() {
            return this.migrationStatus;
        }

        public ListMigrationsResponseBodyDataList setMigrationTarget(ListMigrationsResponseBodyDataListMigrationTarget migrationTarget) {
            this.migrationTarget = migrationTarget;
            return this;
        }
        public ListMigrationsResponseBodyDataListMigrationTarget getMigrationTarget() {
            return this.migrationTarget;
        }

        public ListMigrationsResponseBodyDataList setMigrationType(String migrationType) {
            this.migrationType = migrationType;
            return this;
        }
        public String getMigrationType() {
            return this.migrationType;
        }

        public ListMigrationsResponseBodyDataList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListMigrationsResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListMigrationsResponseBodyData extends TeaModel {
        /**
         * <p>The paged data.</p>
         */
        @NameInMap("list")
        public java.util.List<ListMigrationsResponseBodyDataList> list;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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

        public static ListMigrationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationsResponseBodyData self = new ListMigrationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMigrationsResponseBodyData setList(java.util.List<ListMigrationsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListMigrationsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListMigrationsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListMigrationsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListMigrationsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
