// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsOpenAPIProjectStepsResponseBody extends TeaModel {
    /**
     * <p>The error related parameters.</p>
     */
    @NameInMap("Advice")
    public String advice;

    /**
     * <p>The error code (old), such as AUTHENTICATION_ERROR, PARAM_ERROR, PARAM_ERROR_MESSAGE, NOT_IMPLEMENTED_ERROR, SHARD_COLUMNS_CONFLICT_MESSAGE, FAILED_PARSE_TOKEN_MESSAGE, CONNECT_CHECK_ERROR, NOT_SUPPORT_ERROR, CE_NOT_SUPPORT_ERROR, NOT_FOUND_ERROR, SHARDING_COLUMN_NOT_INCLUDED_ERROR, INNER_ERROR, DB_QUERY_ERROR, DATAHUB_QUERY_ERROR, USER_LACK_SYS_PRIV_ERROR, USER_LACK_TABLE_PRIV_ERROR, RM_API_ERROR, RM_TASK_ERROR, CM_API_ERROR, CM_API_NOT_SUCCESS, BAGUALU_API_ERROR, IDB_API_ERROR, SUPERVISOR_API_ERROR, OCP_API_ERROR, OCP_SERVICE_ERROR, OCP_QUERY_VERSION_FAILED, OCP_VERSION_INCORRECT_ERROR, OCP_VERSION_NOT_SUPPORTED_ERROR, OCP_API_USER_PASSWORD_INCORRECT_ERROR, OBSCHEMA_ERROR, EXECUTOR_THREAD_POOL_BUSY, NO_TABLE_SELECTED, NO_VIEW_SELECTED, SOURCE_CRAWLER_START_FAILED, SOURCE_CRAWLER_START_FAILED_DATA_EXPIRED, SOURCE_CRAWLER_START_TIMEOUT, DEST_WRITER_START_FAILED, WRITER_UNKNOWN_STATUS, DRC_TOPIC_EXISTS_ERROR, TOPIC_EMPTY_ERROR, REACH_WRITER_LIMIT_ERROR, FOUND_NO_FEASIBLE_STORE_ERROR, TOO_MANY_STORES_FOR_SUBTOPIC, TIMEOUT_EXCEPTION, KIPP_API_ERROR, KIPP_API_RESOURCE_NOT_FOUND, KIPP_API_INVALID_PARAM, KIPP_API_UNKNOWN_ERROR, KIPP_API_INTERNAL_ERROR, KIPP_API_SERVICE_UNAVAILABLE, OMS_AGENT_API_ERROR, KMS_API_ERROR, OMS_ENCRYPT_API_ERROR, OMS_DECRYPT_API_ERROR, ALIYUN_SDK_ERROR, YAOCHI_API_ERROR, RESOURCE_WITHOUT_STOCK_ERROR, RESOURCE_NO_AVAILABLE_ZONE, CM_SDK_ERROR, MIGRATION_PROJECT_STEP_PRECHECK_FAILED, PRE_CHECK_ERROR, FAILURES_CORRECT_ERROR, EXECUTE_DDL_FAILURE, EXECUTE_DDL_UNSUPPORTED_OR_FAILURE, STRUCT_RECORD_DDL_NOT_FOUND, STRUCT_RECORD_INDEX_NOT_FOUND, STRUCT_RECORD_NOT_FOUND, STRUCT_RECORD_NOT_FOUND_IN_DBCAT, SCHEMA_OBJECT_TYPE_NOT_SUPPORT_ERROR, POLAR_MYSQL_NETWORK_TYPE_NOT_SUPPORT_ERROR, RDS_NETWORK_TYPE_NOT_SUPPORT_ERROR, RDS_VPC_NETWORK_NOT_SUPPORT_ERROR, DB_TYPE_NOT_SUPPORT_ERROR, SYNC_TYPE_NOT_SUPPORT_ERROR, SLAVE_OPERATION_STEP_NOT_SUPPORT_ERROR, BYTE_USED_TYPE_NOT_SUPPORT_ERROR, MANY_TO_ONE_SCHEMA_TABLE_REVERSE_INCR_NOT_SUPPORT_ERROR, DUPLICATE_SCHEMA_TABLE_ERROR, OMS_STEP_NOT_SUPPORT_ERROR, ORACLE_DATABASE_ROLE_NOT_SUPPORT_ERROR, OLD_PRE_CHECK_NOT_SUPPORT_ERROR, SCHEMA_ONE_TO_MANY_NOT_SUPPORT_ERROR, PROJECT_NOT_FOUND_ERROR, ENDPOINT_NOT_FOUND_ERROR, ENDPOINT_NAME_ALREADY_EXIST_ERROR, ENDPOINT_QUERY_ERROR, ENDPOINT_SQL_QUERY_ERROR, PROJECT_NAME_ALREADY_EXIST_ERROR, CHECKER_NOT_FOUND_ERROR, CHECKER_FAILED_ERROR, CHECKER_STATUS_UNEXPECTED_ERROR, CHECKER_NO_TASK_TYPE_ERROR, WORKER_INSTANCE_NOT_FOUND_ERROR, WORKER_INSTANCE_ALLOCATING_ERROR, LOG_SERVICE_TOPIC_NOT_FOUND_ERROR, CLUSTER_NOT_FOUND_ERROR, TENANT_NOT_FOUND_ERROR, DATABASE_NOT_FOUND_ERROR, TABLE_NOT_FOUND_ERROR, COLUMN_NOT_FOUND_ERROR, TABLE_META_NOT_FOUND_ERROR, SYBASE_CHARSET_NOT_FOUND_ERROR, OCP_NOT_FOUND_ERROR, REGION_NOT_FOUND_ERROR, OCP_ALREADY_EXIST_ERROR, ALARM_CHANNEL_NAME_ALREADY_EXIST_ERROR, SEND_MARKDOWN_TEXT_TO_WEBHOOK_FAILED_EXCEPTION_RESPONSE, SEND_MARKDOWN_TEXT_TO_WEBHOOK_FAILED_EXCEPTION_STATUS, LABEL_ALREADY_EXIST_ERROR, LABEL_NOT_EXIST_ERROR, OCP_ALREADY_USED_ERROR, REGION_INFO_INCONSISTENT_ERROR, OCP_NAME_EMPTY_ERROR, MASTER_SLAVE_ENDPOINT_NAME_INCONSISTENT_ERROR, LOG_FILE_NOT_FOUND_ERROR, OPERATION_NOT_ALLOWED_ERROR, PROJECT_OPERATION_NOT_ALLOWED_ERROR, PROJECT_RELEASE_FAILED, STRUCT_MIGRATION_RETRY_NOT_ALLOWED_ERROR, WORKER_INSTANCE_OPERATION_NOT_ALLOWED_ERROR, USER_OPERATION_NOT_ALLOWED_ERROR, OCP_NAME_OR_REGION_NOT_ALLOWED_UPDATE, UPDATE_CONFIG_WITH_NEWLINE_NOT_ALLOWED, EXIST_UNRELEASED_PROJECT_ERROR, EXIST_UNRELEASED_TOPIC_ERROR, LABEL_CREATE_NOT_ALLOWED_ERROR, LABEL_UPDATE_NOT_ALLOWED_ERROR, LABEL_DELETE_NOT_ALLOWED_ERROR, TOPIC_NAME_INVALID_ERROR, INVALID_STATUS_ERROR, INVALID_CSV_HEAD_ERROR, INVALID_CSV_BODY_ERROR, DUPLICATE_SCHEMA_TABLE_SETTING_ERROR, PROJECT_INVALID_STATUS_ERROR, PROJECT_INVALID_CONNECTOR_COUNT_ERROR, WORKER_INSTANCE_INVALID_STATUS_ERROR, LOG_SERVICE_INVALID_STATUS_ERROR, STEP_INVALID_STATUS_ERROR, UPDATE_ALLOW_DEST_TABLE_NOT_EMPTY_NOT_ALLOWED_ERROR, EXIST_INCONSISTENCY_ERROR, OMS_SWITCH_SUBSTEP_FAILED_ERROR, ENDPOINT_ID_INVALID_ERROR, DB_QUERY_VERSION_EMPTY_ERROR, ENDPOINT_NAME_INVALID_ERROR, ENDPOINT_SCHEMA_NOT_ALLOWED_ERROR, ENDPOINT_SCHEMA_CHAR_NOT_ALLOWED_ERROR, NAME_HAS_SPACE_EXCEPTION, CONFIG_CONVERT_VALUE_ERROR, CONFIG_VALUE_EXCEEDS_LIMIT_ERROR, CONFIG_KEY_NOT_FOUND_KEY_ERROR, CONFIG_VALUE_NOT_EMPTY_ERROR, SCHEMA_HAS_CONVERT_INFO, TIME_SERIES_QUERY_SERVICE_ERROR, ETL_VERIFY_ERROR, ETL_SYNTAX_UNSUPPORTED, ETL_FIELD_NOTFOUND, ETL_FAILED_PARSE_SQL, ETL_VAL_TYPE_ERROR, NOT_SUPPORT_GENERATE_COLUMNS, NOT_SUPPORT_UPDATE_ETL, LOCK_FAILED, OMS_USER_EXIST_ERROR, OMS_USER_NOT_FOUND_ERROR, OMS_USER_NAME_LENGTH_CONSTRAINT, OMS_USER_PASSWORD_ERROR, USER_NAME_OR_PASSWORD_ERROR, OMS_USER_PASSWORD_VALIDATION_ERROR, OMS_USER_PASSWORD_DEFAULT_ERROR, OMS_USER_PERMISSION_DENIED_ERROR, OMS_USER_EDIT_ADMIN_ROLE_INFO_PERMISSION_DENIED_ERROR, OMS_USER_ILLEGAL_DELETED_ERROR, CONNECTOR_TASK_NOT_FOUND_ERROR, CONNECTOR_TASK_NUM_LIMIT_ERROR, CONNECTOR_TASK_DELETE_ERROR, METRIC_SERVICE_ERROR, SYNC_PROJECT_TYPE_INVALID_ERROR, SYNC_SHARDING_COLUMNS_INVALID_ERROR, SYNC_PROJECT_PRODUCER_GROUP_INVALID_ERROR, SYNC_PROJECT_PRODUCER_GROUP_LIMIT_EXCEEDS_ERROR, SYNC_PROJECT_COMPLEMENT_CONFIG_ERROR, META_SCHEMA_CREATE_FAILED, RESUME_STEP_FAILED, SCHEMA_INCONSISTENCY, SCHEMA_CASCADE_MAPPING_NOT_SUPPORT_ERROR, SCHEMA_NOT_EXISTED, SCHEMA_EXISTED, SCHEMA_NOT_EXIST, BLACK_LIST_MATCH_ALL, BLACK_LIST_CONTAIN_NON_WHITE_SCHEMA, BLACK_WHITE_LIST_PARAM_INVALID_ERROR, OPERATOR_ERROR, OPERATOR_DIMENSION_NOT_SUPPORT, OPERATOR_PULL_LOG_ERROR, OPERATOR_UPDATE_CONFIG_NOT_SUPPORT, KAFKA_CREATE_TOPIC_ERROR, KAFKA_QUERY_TOPIC_ERROR, KAFKA_BUILD_PROPERTIES_ERROR, ROCKETMQ_CREATE_TOPIC_ERROR, ROCKETMQ_QUERY_TOPIC_ERROR, SYNC_OBJECT_EMPTY_ERROR, WRITER_NUMBER_NOT_UNIQUE, WRITER_NOT_ACTIVE, PROJECT_NAME_DUPLICATE_ERROR, EMPTY_FAILED_STRUCT_MIGRATION_TABLES_ERROR, LOGIC_TABLE_NOT_SUPPORT_UPDATE_OBJECT_ERROR, LOGIC_REQUEST_ERROR, LOGIC_DTO_BUILD_ERROR, UNEXPECTED_REMOTE_API_RESULT, OCEANBASE_USER_UNEXPECTED, STORE_CREATE_FAILED_ERROR, STORE_START_FAILED, STORE_NOT_PULL_LOG_ERROR, ALL_HOSTS_STATUS_ERROR, WORKER_ECS_NOT_FOUND_ERROR, WORKER_ECS_NOT_FOUND_FOR_USER_ERROR, WORKER_POD_NOT_FOUND_ERROR, WORKER_POD_NOT_FOUND_FOR_USER_ERROR, WORKER_INSTANCE_NOT_FOUND_ERROR_V2, and WORKER_INSTANCE_NOT_FOUND_FOR_USER_ERROR.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The step end time, in the format of "yyyy-MM-ddTHH:mm:ss".</p>
     */
    @NameInMap("Cost")
    public String cost;

    /**
     * <p>Indicates whether the current step must be confirmed by the user, rather than scheduled in the backend.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeOmsOpenAPIProjectStepsResponseBodyData> data;

    /**
     * <p>The step details. The value is a JSON string.</p>
     */
    @NameInMap("ErrorDetail")
    public DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail errorDetail;

    /**
     * <p>A system error occurred.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The additional information. The value is a JSON string.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The step start time, in the format of "yyyy-MM-ddTHH:mm:ss".</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The time when the error occurred.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The read throughput baseline of the source data source.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The estimated remaining time. This parameter takes effect in full synchronization.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeOmsOpenAPIProjectStepsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsOpenAPIProjectStepsResponseBody self = new DescribeOmsOpenAPIProjectStepsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setData(java.util.List<DescribeOmsOpenAPIProjectStepsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeOmsOpenAPIProjectStepsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setErrorDetail(DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails extends TeaModel {
        /**
         * <p>The suggestions (old).</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Contact the administrator.</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>A sub-status that indicates whether the checker has completed full verification.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The amount of data migrated.</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        public static DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails self = new DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

    }

    public static class DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo extends TeaModel {
        /**
         * <p>The job ID.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Schema migration</p>
         */
        @NameInMap("ErrorDetails")
        public java.util.List<DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails> errorDetails;

        /**
         * <p>The resource deployment ID.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The error code (new).</p>
         */
        @NameInMap("ErrorParam")
        public java.util.Map<String, String> errorParam;

        /**
         * <p>The additional information. The value is a JSON string.</p>
         */
        @NameInMap("FailedTime")
        public String failedTime;

        public static DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo self = new DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo setErrorDetails(java.util.List<DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo setErrorParam(java.util.Map<String, String> errorParam) {
            this.errorParam = errorParam;
            return this;
        }
        public java.util.Map<String, String> getErrorParam() {
            return this.errorParam;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo setFailedTime(String failedTime) {
            this.failedTime = failedTime;
            return this;
        }
        public String getFailedTime() {
            return this.failedTime;
        }

    }

    public static class DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview extends TeaModel {
        /**
         * <p>A sub-status that indicates whether this step is skipped.</p>
         */
        @NameInMap("EstimatedRemainingTimeOfSec")
        public Long estimatedRemainingTimeOfSec;

        /**
         * <p>The read RPS baseline of the source data source.</p>
         */
        @NameInMap("EstimatedTotalCount")
        public Long estimatedTotalCount;

        /**
         * <p>The read/write RT per record of the destination data source, in ms.</p>
         */
        @NameInMap("FinishedCount")
        public Long finishedCount;

        /**
         * <p>The business data returned.</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        public static DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview self = new DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview setEstimatedRemainingTimeOfSec(Long estimatedRemainingTimeOfSec) {
            this.estimatedRemainingTimeOfSec = estimatedRemainingTimeOfSec;
            return this;
        }
        public Long getEstimatedRemainingTimeOfSec() {
            return this.estimatedRemainingTimeOfSec;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview setEstimatedTotalCount(Long estimatedTotalCount) {
            this.estimatedTotalCount = estimatedTotalCount;
            return this;
        }
        public Long getEstimatedTotalCount() {
            return this.estimatedTotalCount;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview setFinishedCount(Long finishedCount) {
            this.finishedCount = finishedCount;
            return this;
        }
        public Long getFinishedCount() {
            return this.finishedCount;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

    }

    public static class DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo extends TeaModel {
        /**
         * <p>The total count, which takes effect in a pagination query.</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The operation that you want to perform. Set the value to **DescribeOmsOpenAPIProjectSteps**.</p>
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

        /**
         * <p>The error code, such as AUTHENTICATION_ERROR, PARAM_ERROR, PARAM_ERROR_MESSAGE, NOT_IMPLEMENTED_ERROR, SHARD_COLUMNS_CONFLICT_MESSAGE, FAILED_PARSE_TOKEN_MESSAGE, CONNECT_CHECK_ERROR, NOT_SUPPORT_ERROR, CE_NOT_SUPPORT_ERROR, NOT_FOUND_ERROR, SHARDING_COLUMN_NOT_INCLUDED_ERROR, INNER_ERROR, DB_QUERY_ERROR, DATAHUB_QUERY_ERROR, USER_LACK_SYS_PRIV_ERROR, USER_LACK_TABLE_PRIV_ERROR, RM_API_ERROR, RM_TASK_ERROR, CM_API_ERROR, CM_API_NOT_SUCCESS, BAGUALU_API_ERROR, IDB_API_ERROR, SUPERVISOR_API_ERROR, OCP_API_ERROR, OCP_SERVICE_ERROR, OCP_QUERY_VERSION_FAILED, OCP_VERSION_INCORRECT_ERROR, OCP_VERSION_NOT_SUPPORTED_ERROR, OCP_API_USER_PASSWORD_INCORRECT_ERROR, OBSCHEMA_ERROR, EXECUTOR_THREAD_POOL_BUSY, NO_TABLE_SELECTED, NO_VIEW_SELECTED, SOURCE_CRAWLER_START_FAILED, SOURCE_CRAWLER_START_FAILED_DATA_EXPIRED, SOURCE_CRAWLER_START_TIMEOUT, DEST_WRITER_START_FAILED, WRITER_UNKNOWN_STATUS, DRC_TOPIC_EXISTS_ERROR, TOPIC_EMPTY_ERROR, REACH_WRITER_LIMIT_ERROR, FOUND_NO_FEASIBLE_STORE_ERROR, TOO_MANY_STORES_FOR_SUBTOPIC, TIMEOUT_EXCEPTION, KIPP_API_ERROR, KIPP_API_RESOURCE_NOT_FOUND, KIPP_API_INVALID_PARAM, KIPP_API_UNKNOWN_ERROR, KIPP_API_INTERNAL_ERROR, KIPP_API_SERVICE_UNAVAILABLE, OMS_AGENT_API_ERROR, KMS_API_ERROR, OMS_ENCRYPT_API_ERROR, OMS_DECRYPT_API_ERROR, ALIYUN_SDK_ERROR, YAOCHI_API_ERROR, RESOURCE_WITHOUT_STOCK_ERROR, RESOURCE_NO_AVAILABLE_ZONE, CM_SDK_ERROR, MIGRATION_PROJECT_STEP_PRECHECK_FAILED, PRE_CHECK_ERROR, FAILURES_CORRECT_ERROR, EXECUTE_DDL_FAILURE, EXECUTE_DDL_UNSUPPORTED_OR_FAILURE, STRUCT_RECORD_DDL_NOT_FOUND, STRUCT_RECORD_INDEX_NOT_FOUND, STRUCT_RECORD_NOT_FOUND, STRUCT_RECORD_NOT_FOUND_IN_DBCAT, SCHEMA_OBJECT_TYPE_NOT_SUPPORT_ERROR, POLAR_MYSQL_NETWORK_TYPE_NOT_SUPPORT_ERROR, RDS_NETWORK_TYPE_NOT_SUPPORT_ERROR, RDS_VPC_NETWORK_NOT_SUPPORT_ERROR, DB_TYPE_NOT_SUPPORT_ERROR, SYNC_TYPE_NOT_SUPPORT_ERROR, SLAVE_OPERATION_STEP_NOT_SUPPORT_ERROR, BYTE_USED_TYPE_NOT_SUPPORT_ERROR, MANY_TO_ONE_SCHEMA_TABLE_REVERSE_INCR_NOT_SUPPORT_ERROR, DUPLICATE_SCHEMA_TABLE_ERROR, OMS_STEP_NOT_SUPPORT_ERROR, ORACLE_DATABASE_ROLE_NOT_SUPPORT_ERROR, OLD_PRE_CHECK_NOT_SUPPORT_ERROR, SCHEMA_ONE_TO_MANY_NOT_SUPPORT_ERROR, PROJECT_NOT_FOUND_ERROR, ENDPOINT_NOT_FOUND_ERROR, ENDPOINT_NAME_ALREADY_EXIST_ERROR, ENDPOINT_QUERY_ERROR, ENDPOINT_SQL_QUERY_ERROR, PROJECT_NAME_ALREADY_EXIST_ERROR, CHECKER_NOT_FOUND_ERROR, CHECKER_FAILED_ERROR, CHECKER_STATUS_UNEXPECTED_ERROR, CHECKER_NO_TASK_TYPE_ERROR, WORKER_INSTANCE_NOT_FOUND_ERROR, WORKER_INSTANCE_ALLOCATING_ERROR, LOG_SERVICE_TOPIC_NOT_FOUND_ERROR, CLUSTER_NOT_FOUND_ERROR, TENANT_NOT_FOUND_ERROR, DATABASE_NOT_FOUND_ERROR, TABLE_NOT_FOUND_ERROR, COLUMN_NOT_FOUND_ERROR, TABLE_META_NOT_FOUND_ERROR, SYBASE_CHARSET_NOT_FOUND_ERROR, OCP_NOT_FOUND_ERROR, REGION_NOT_FOUND_ERROR, OCP_ALREADY_EXIST_ERROR, ALARM_CHANNEL_NAME_ALREADY_EXIST_ERROR, SEND_MARKDOWN_TEXT_TO_WEBHOOK_FAILED_EXCEPTION_RESPONSE, SEND_MARKDOWN_TEXT_TO_WEBHOOK_FAILED_EXCEPTION_STATUS, LABEL_ALREADY_EXIST_ERROR, LABEL_NOT_EXIST_ERROR, OCP_ALREADY_USED_ERROR, REGION_INFO_INCONSISTENT_ERROR, OCP_NAME_EMPTY_ERROR, MASTER_SLAVE_ENDPOINT_NAME_INCONSISTENT_ERROR, LOG_FILE_NOT_FOUND_ERROR, OPERATION_NOT_ALLOWED_ERROR, PROJECT_OPERATION_NOT_ALLOWED_ERROR, PROJECT_RELEASE_FAILED, STRUCT_MIGRATION_RETRY_NOT_ALLOWED_ERROR, WORKER_INSTANCE_OPERATION_NOT_ALLOWED_ERROR, USER_OPERATION_NOT_ALLOWED_ERROR, OCP_NAME_OR_REGION_NOT_ALLOWED_UPDATE, UPDATE_CONFIG_WITH_NEWLINE_NOT_ALLOWED, EXIST_UNRELEASED_PROJECT_ERROR, EXIST_UNRELEASED_TOPIC_ERROR, LABEL_CREATE_NOT_ALLOWED_ERROR, LABEL_UPDATE_NOT_ALLOWED_ERROR, LABEL_DELETE_NOT_ALLOWED_ERROR, TOPIC_NAME_INVALID_ERROR, INVALID_STATUS_ERROR, INVALID_CSV_HEAD_ERROR, INVALID_CSV_BODY_ERROR, DUPLICATE_SCHEMA_TABLE_SETTING_ERROR, PROJECT_INVALID_STATUS_ERROR, PROJECT_INVALID_CONNECTOR_COUNT_ERROR, WORKER_INSTANCE_INVALID_STATUS_ERROR, LOG_SERVICE_INVALID_STATUS_ERROR, STEP_INVALID_STATUS_ERROR, UPDATE_ALLOW_DEST_TABLE_NOT_EMPTY_NOT_ALLOWED_ERROR, EXIST_INCONSISTENCY_ERROR, OMS_SWITCH_SUBSTEP_FAILED_ERROR, ENDPOINT_ID_INVALID_ERROR, DB_QUERY_VERSION_EMPTY_ERROR, ENDPOINT_NAME_INVALID_ERROR, ENDPOINT_SCHEMA_NOT_ALLOWED_ERROR, ENDPOINT_SCHEMA_CHAR_NOT_ALLOWED_ERROR, NAME_HAS_SPACE_EXCEPTION, CONFIG_CONVERT_VALUE_ERROR, CONFIG_VALUE_EXCEEDS_LIMIT_ERROR, CONFIG_KEY_NOT_FOUND_KEY_ERROR, CONFIG_VALUE_NOT_EMPTY_ERROR, SCHEMA_HAS_CONVERT_INFO, TIME_SERIES_QUERY_SERVICE_ERROR, ETL_VERIFY_ERROR, ETL_SYNTAX_UNSUPPORTED, ETL_FIELD_NOTFOUND, ETL_FAILED_PARSE_SQL, ETL_VAL_TYPE_ERROR, NOT_SUPPORT_GENERATE_COLUMNS, NOT_SUPPORT_UPDATE_ETL, LOCK_FAILED, OMS_USER_EXIST_ERROR, OMS_USER_NOT_FOUND_ERROR, OMS_USER_NAME_LENGTH_CONSTRAINT, OMS_USER_PASSWORD_ERROR, USER_NAME_OR_PASSWORD_ERROR, OMS_USER_PASSWORD_VALIDATION_ERROR, OMS_USER_PASSWORD_DEFAULT_ERROR, OMS_USER_PERMISSION_DENIED_ERROR, OMS_USER_EDIT_ADMIN_ROLE_INFO_PERMISSION_DENIED_ERROR, OMS_USER_ILLEGAL_DELETED_ERROR, CONNECTOR_TASK_NOT_FOUND_ERROR, CONNECTOR_TASK_NUM_LIMIT_ERROR, CONNECTOR_TASK_DELETE_ERROR, METRIC_SERVICE_ERROR, SYNC_PROJECT_TYPE_INVALID_ERROR, SYNC_SHARDING_COLUMNS_INVALID_ERROR, SYNC_PROJECT_PRODUCER_GROUP_INVALID_ERROR, SYNC_PROJECT_PRODUCER_GROUP_LIMIT_EXCEEDS_ERROR, SYNC_PROJECT_COMPLEMENT_CONFIG_ERROR, META_SCHEMA_CREATE_FAILED, RESUME_STEP_FAILED, SCHEMA_INCONSISTENCY, SCHEMA_CASCADE_MAPPING_NOT_SUPPORT_ERROR, SCHEMA_NOT_EXISTED, SCHEMA_EXISTED, SCHEMA_NOT_EXIST, BLACK_LIST_MATCH_ALL, BLACK_LIST_CONTAIN_NON_WHITE_SCHEMA, BLACK_WHITE_LIST_PARAM_INVALID_ERROR, OPERATOR_ERROR, OPERATOR_DIMENSION_NOT_SUPPORT, OPERATOR_PULL_LOG_ERROR, OPERATOR_UPDATE_CONFIG_NOT_SUPPORT, KAFKA_CREATE_TOPIC_ERROR, KAFKA_QUERY_TOPIC_ERROR, KAFKA_BUILD_PROPERTIES_ERROR, ROCKETMQ_CREATE_TOPIC_ERROR, ROCKETMQ_QUERY_TOPIC_ERROR, SYNC_OBJECT_EMPTY_ERROR, WRITER_NUMBER_NOT_UNIQUE, WRITER_NOT_ACTIVE, PROJECT_NAME_DUPLICATE_ERROR, EMPTY_FAILED_STRUCT_MIGRATION_TABLES_ERROR, LOGIC_TABLE_NOT_SUPPORT_UPDATE_OBJECT_ERROR, LOGIC_REQUEST_ERROR, LOGIC_DTO_BUILD_ERROR, UNEXPECTED_REMOTE_API_RESULT, OCEANBASE_USER_UNEXPECTED, STORE_CREATE_FAILED_ERROR, STORE_START_FAILED, STORE_NOT_PULL_LOG_ERROR, ALL_HOSTS_STATUS_ERROR, WORKER_ECS_NOT_FOUND_ERROR, WORKER_ECS_NOT_FOUND_FOR_USER_ERROR, WORKER_POD_NOT_FOUND_ERROR, WORKER_POD_NOT_FOUND_FOR_USER_ERROR, WORKER_INSTANCE_NOT_FOUND_ERROR_V2, and WORKER_INSTANCE_NOT_FOUND_FOR_USER_ERROR.</p>
         */
        @NameInMap("ConnectorFullProgressOverview")
        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview connectorFullProgressOverview;

        /**
         * <p>The page size, which takes effect in a pagination query.</p>
         */
        @NameInMap("DeployId")
        public String deployId;

        /**
         * <p>The error description (old).</p>
         */
        @NameInMap("DstIops")
        public Long dstIops;

        /**
         * <p>The estimated amount of data to migrate.</p>
         */
        @NameInMap("DstRps")
        public Long dstRps;

        /**
         * <p>The step progress.</p>
         */
        @NameInMap("DstRpsRef")
        public Long dstRpsRef;

        /**
         * <p>The read requests per second (RPS) of the source data source.</p>
         */
        @NameInMap("DstRt")
        public Long dstRt;

        /**
         * <p>A system error occurred.</p>
         */
        @NameInMap("DstRtRef")
        public Long dstRtRef;

        /**
         * <p>The full synchronization progress.</p>
         */
        @NameInMap("Gmt")
        public Long gmt;

        /**
         * <p>The read/write throughput of the destination data source, in bytes per second.</p>
         */
        @NameInMap("Inconsistencies")
        public Long inconsistencies;

        /**
         * <p>The read throughput of the source data source, in bytes per second.</p>
         */
        @NameInMap("IncrTimestampCheckpoint")
        public Long incrTimestampCheckpoint;

        /**
         * <p>The error code (old).</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The error related parameters.</p>
         */
        @NameInMap("ProcessedRecords")
        public Long processedRecords;

        /**
         * <p>The time spent in processing the request, in seconds.</p>
         */
        @NameInMap("Skipped")
        public Boolean skipped;

        /**
         * <p>finishedCount / estimatedTotalCount</p>
         */
        @NameInMap("SrcIops")
        public Long srcIops;

        /**
         * <p>The end time, in the format of "2020-05-22T17:04:18".</p>
         */
        @NameInMap("SrcIopsRef")
        public Long srcIopsRef;

        /**
         * <p>The error level. Valid values: CRITICAL, ERROR, and WARN.</p>
         */
        @NameInMap("SrcRps")
        public Long srcRps;

        /**
         * <p>The checkpoint. The value is a unix timestamp in seconds.</p>
         */
        @NameInMap("SrcRpsRef")
        public Long srcRpsRef;

        /**
         * <p>The error code.</p>
         */
        @NameInMap("SrcRt")
        public Long srcRt;

        /**
         * <p>The checkpoint collection time. The value is a unix timestamp in seconds.</p>
         */
        @NameInMap("SrcRtRef")
        public Long srcRtRef;

        /**
         * <p>The read/write RPS of the destination data source.</p>
         */
        @NameInMap("Validated")
        public Boolean validated;

        public static DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo self = new DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setConnectorFullProgressOverview(DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview connectorFullProgressOverview) {
            this.connectorFullProgressOverview = connectorFullProgressOverview;
            return this;
        }
        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview getConnectorFullProgressOverview() {
            return this.connectorFullProgressOverview;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setDeployId(String deployId) {
            this.deployId = deployId;
            return this;
        }
        public String getDeployId() {
            return this.deployId;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setDstIops(Long dstIops) {
            this.dstIops = dstIops;
            return this;
        }
        public Long getDstIops() {
            return this.dstIops;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setDstRps(Long dstRps) {
            this.dstRps = dstRps;
            return this;
        }
        public Long getDstRps() {
            return this.dstRps;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setDstRpsRef(Long dstRpsRef) {
            this.dstRpsRef = dstRpsRef;
            return this;
        }
        public Long getDstRpsRef() {
            return this.dstRpsRef;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setDstRt(Long dstRt) {
            this.dstRt = dstRt;
            return this;
        }
        public Long getDstRt() {
            return this.dstRt;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setDstRtRef(Long dstRtRef) {
            this.dstRtRef = dstRtRef;
            return this;
        }
        public Long getDstRtRef() {
            return this.dstRtRef;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setGmt(Long gmt) {
            this.gmt = gmt;
            return this;
        }
        public Long getGmt() {
            return this.gmt;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setInconsistencies(Long inconsistencies) {
            this.inconsistencies = inconsistencies;
            return this;
        }
        public Long getInconsistencies() {
            return this.inconsistencies;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setIncrTimestampCheckpoint(Long incrTimestampCheckpoint) {
            this.incrTimestampCheckpoint = incrTimestampCheckpoint;
            return this;
        }
        public Long getIncrTimestampCheckpoint() {
            return this.incrTimestampCheckpoint;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setProcessedRecords(Long processedRecords) {
            this.processedRecords = processedRecords;
            return this;
        }
        public Long getProcessedRecords() {
            return this.processedRecords;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setSkipped(Boolean skipped) {
            this.skipped = skipped;
            return this;
        }
        public Boolean getSkipped() {
            return this.skipped;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setSrcIops(Long srcIops) {
            this.srcIops = srcIops;
            return this;
        }
        public Long getSrcIops() {
            return this.srcIops;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setSrcIopsRef(Long srcIopsRef) {
            this.srcIopsRef = srcIopsRef;
            return this;
        }
        public Long getSrcIopsRef() {
            return this.srcIopsRef;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setSrcRps(Long srcRps) {
            this.srcRps = srcRps;
            return this;
        }
        public Long getSrcRps() {
            return this.srcRps;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setSrcRpsRef(Long srcRpsRef) {
            this.srcRpsRef = srcRpsRef;
            return this;
        }
        public Long getSrcRpsRef() {
            return this.srcRpsRef;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setSrcRt(Long srcRt) {
            this.srcRt = srcRt;
            return this;
        }
        public Long getSrcRt() {
            return this.srcRt;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setSrcRtRef(Long srcRtRef) {
            this.srcRtRef = srcRtRef;
            return this;
        }
        public Long getSrcRtRef() {
            return this.srcRtRef;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setValidated(Boolean validated) {
            this.validated = validated;
            return this;
        }
        public Boolean getValidated() {
            return this.validated;
        }

    }

    public static class DescribeOmsOpenAPIProjectStepsResponseBodyData extends TeaModel {
        /**
         * <p>The request ID.</p>
         */
        @NameInMap("EstimatedRemainingSeconds")
        public Long estimatedRemainingSeconds;

        /**
         * <p>A system error occurred.</p>
         */
        @NameInMap("ExtraInfo")
        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo extraInfo;

        /**
         * <p>$.parameters[3].schema.example</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>$.parameters[5].schema.description</p>
         */
        @NameInMap("Interactive")
        public Boolean interactive;

        /**
         * <p>The error details.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>It is an Alibaba Cloud asset management and configuration tool, with which you can manage multiple Alibaba Cloud products and services by using commands. It is easy to use and a good helper in migration to cloud.</p>
         */
        @NameInMap("StepDescription")
        public String stepDescription;

        /**
         * <p>The error related parameters.</p>
         */
        @NameInMap("StepInfo")
        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo stepInfo;

        /**
         * <p>Alibaba Cloud provides SDKs in different languages to help you quickly integrate Alibaba Cloud products and services by using APIs. We recommend that you use an SDK to call APIs. In this way, you do not need to sign for verification.</p>
         */
        @NameInMap("StepName")
        public String stepName;

        /**
         * <p>DescribeOmsOpenAPIProjectSteps</p>
         */
        @NameInMap("StepOrder")
        public Integer stepOrder;

        /**
         * <p>cn-hangzhou</p>
         */
        @NameInMap("StepProgress")
        public Integer stepProgress;

        /**
         * <p>Indicates whether the call is successful.</p>
         */
        @NameInMap("StepStatus")
        public String stepStatus;

        public static DescribeOmsOpenAPIProjectStepsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectStepsResponseBodyData self = new DescribeOmsOpenAPIProjectStepsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setEstimatedRemainingSeconds(Long estimatedRemainingSeconds) {
            this.estimatedRemainingSeconds = estimatedRemainingSeconds;
            return this;
        }
        public Long getEstimatedRemainingSeconds() {
            return this.estimatedRemainingSeconds;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setExtraInfo(DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setInteractive(Boolean interactive) {
            this.interactive = interactive;
            return this;
        }
        public Boolean getInteractive() {
            return this.interactive;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setStepDescription(String stepDescription) {
            this.stepDescription = stepDescription;
            return this;
        }
        public String getStepDescription() {
            return this.stepDescription;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setStepInfo(DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo stepInfo) {
            this.stepInfo = stepInfo;
            return this;
        }
        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo getStepInfo() {
            return this.stepInfo;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setStepOrder(Integer stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Integer getStepOrder() {
            return this.stepOrder;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setStepProgress(Integer stepProgress) {
            this.stepProgress = stepProgress;
            return this;
        }
        public Integer getStepProgress() {
            return this.stepProgress;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setStepStatus(String stepStatus) {
            this.stepStatus = stepStatus;
            return this;
        }
        public String getStepStatus() {
            return this.stepStatus;
        }

    }

    public static class DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail extends TeaModel {
        /**
         * <p>The error details.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Valid values: CRITICAL, ERROR, and WARN.</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>A system error occurred.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Contact the administrator.</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        public static DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail self = new DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

    }

}
