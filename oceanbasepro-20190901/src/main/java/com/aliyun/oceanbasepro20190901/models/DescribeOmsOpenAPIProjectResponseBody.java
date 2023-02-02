// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsOpenAPIProjectResponseBody extends TeaModel {
    /**
     * <p>The suggestions (old).</p>
     */
    @NameInMap("Advice")
    public String advice;

    /**
     * <p>The error code (old).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time spent in processing the request, in seconds.</p>
     */
    @NameInMap("Cost")
    public String cost;

    /**
     * <p>The business data returned.</p>
     */
    @NameInMap("Data")
    public DescribeOmsOpenAPIProjectResponseBodyData data;

    /**
     * <p>The error details.</p>
     */
    @NameInMap("ErrorDetail")
    public DescribeOmsOpenAPIProjectResponseBodyErrorDetail errorDetail;

    /**
     * <p>The error description (old).</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number, which takes effect in a pagination query.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size, which takes effect in a pagination query.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total count, which takes effect in a pagination query.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeOmsOpenAPIProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsOpenAPIProjectResponseBody self = new DescribeOmsOpenAPIProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOmsOpenAPIProjectResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public DescribeOmsOpenAPIProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeOmsOpenAPIProjectResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public DescribeOmsOpenAPIProjectResponseBody setData(DescribeOmsOpenAPIProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeOmsOpenAPIProjectResponseBodyData getData() {
        return this.data;
    }

    public DescribeOmsOpenAPIProjectResponseBody setErrorDetail(DescribeOmsOpenAPIProjectResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public DescribeOmsOpenAPIProjectResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public DescribeOmsOpenAPIProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeOmsOpenAPIProjectResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeOmsOpenAPIProjectResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOmsOpenAPIProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOmsOpenAPIProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeOmsOpenAPIProjectResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataDestConfig extends TeaModel {
        /**
         * <p>Indicates whether message tracing is enabled when the destination data source is RocketMQ.</p>
         */
        @NameInMap("EnableMsgTrace")
        public Boolean enableMsgTrace;

        /**
         * <p>The ID of the data source.</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The type of the data source. Valid values: `MYSQL`, `MARIADB`, `OB_MYSQL`, `OB_MYSQL_CE`, `OB_ORACLE`, `ORACLE`, `DB2_LUW`, `KAFKA`, `ROCKETMQ`, `DATAHUB`, `SYBASE`, `LOGPROXY`, `ADB`, `DBP_OP_ROUTE`, `DMS`, `IDB`, and `TIDB`.</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The tag of the Post message when the destination data source is RocketMQ.</p>
         */
        @NameInMap("MsgTags")
        public String msgTags;

        /**
         * <p>The partitioned index, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ, and the partitioning mode is set to ONE.</p>
         */
        @NameInMap("Partition")
        public Integer partition;

        /**
         * <p>The partitioning mode, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ. Valid values: ONE, HASH, and TABLE.</p>
         */
        @NameInMap("PartitionMode")
        public String partitionMode;

        /**
         * <p>The producer group of the Post message when the destination data source is RocketMQ.</p>
         */
        @NameInMap("ProducerGroup")
        public String producerGroup;

        /**
         * <p>The timeout period in seconds for a single Post message when the destination data source is RocketMQ.</p>
         */
        @NameInMap("SendMsgTimeout")
        public Long sendMsgTimeout;

        /**
         * <p>Indicates whether message sequencing is enabled when the destination data source is DataHub.</p>
         */
        @NameInMap("SequenceEnable")
        public Boolean sequenceEnable;

        /**
         * <p>The start time of the sequence, which must be specified if the destination data source is DataHub and message sequencing is enabled. The value is a timestamp in seconds.</p>
         */
        @NameInMap("SequenceStartTimestamp")
        public Long sequenceStartTimestamp;

        /**
         * <p>The text serialization type, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ. Valid values: Default, DefaultExtendColumnType, Canal, Dataworks, and SharePlex.</p>
         */
        @NameInMap("SerializerType")
        public String serializerType;

        /**
         * <p>The type of the topic to which the Post message belongs when the destination data source is DataHub. Valid values: Tuple and Blob.</p>
         */
        @NameInMap("TopicType")
        public String topicType;

        public static DescribeOmsOpenAPIProjectResponseBodyDataDestConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataDestConfig self = new DescribeOmsOpenAPIProjectResponseBodyDataDestConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setEnableMsgTrace(Boolean enableMsgTrace) {
            this.enableMsgTrace = enableMsgTrace;
            return this;
        }
        public Boolean getEnableMsgTrace() {
            return this.enableMsgTrace;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setMsgTags(String msgTags) {
            this.msgTags = msgTags;
            return this;
        }
        public String getMsgTags() {
            return this.msgTags;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setPartitionMode(String partitionMode) {
            this.partitionMode = partitionMode;
            return this;
        }
        public String getPartitionMode() {
            return this.partitionMode;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setProducerGroup(String producerGroup) {
            this.producerGroup = producerGroup;
            return this;
        }
        public String getProducerGroup() {
            return this.producerGroup;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setSendMsgTimeout(Long sendMsgTimeout) {
            this.sendMsgTimeout = sendMsgTimeout;
            return this;
        }
        public Long getSendMsgTimeout() {
            return this.sendMsgTimeout;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setSequenceEnable(Boolean sequenceEnable) {
            this.sequenceEnable = sequenceEnable;
            return this;
        }
        public Boolean getSequenceEnable() {
            return this.sequenceEnable;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setSequenceStartTimestamp(Long sequenceStartTimestamp) {
            this.sequenceStartTimestamp = sequenceStartTimestamp;
            return this;
        }
        public Long getSequenceStartTimestamp() {
            return this.sequenceStartTimestamp;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setSerializerType(String serializerType) {
            this.serializerType = serializerType;
            return this;
        }
        public String getSerializerType() {
            return this.serializerType;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setTopicType(String topicType) {
            this.topicType = topicType;
            return this;
        }
        public String getTopicType() {
            return this.topicType;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataLabels extends TeaModel {
        /**
         * <p>The number of projects that use this label.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The creator. This parameter value is returned only when you log on as the administrator.</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The ID of a label.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the label.</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeOmsOpenAPIProjectResponseBodyDataLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataLabels self = new DescribeOmsOpenAPIProjectResponseBodyDataLabels();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataLabels setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataLabels setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataLabels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig extends TeaModel {
        /**
         * <p>Indicates whether message tracing is enabled when the destination data source is RocketMQ.</p>
         */
        @NameInMap("EnableMsgTrace")
        public Boolean enableMsgTrace;

        /**
         * <p>The ID of the data source.</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The type of the data source. Valid values: `MYSQL`, `MARIADB`, `OB_MYSQL`, `OB_MYSQL_CE`, `OB_ORACLE`, `ORACLE`, `DB2_LUW`, `KAFKA`, `ROCKETMQ`, `DATAHUB`, `SYBASE`, `LOGPROXY`, `ADB`, `DBP_OP_ROUTE`, `DMS`, `IDB`, and `TIDB`.</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The tag of the Post message when the destination data source is RocketMQ.</p>
         */
        @NameInMap("MsgTags")
        public String msgTags;

        /**
         * <p>The partitioned index, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ, and the partitioning mode is set to ONE.</p>
         */
        @NameInMap("Partition")
        public Integer partition;

        /**
         * <p>The partitioning mode, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ. Valid values: ONE, HASH, and TABLE.</p>
         */
        @NameInMap("PartitionMode")
        public String partitionMode;

        /**
         * <p>The producer group of the Post message when the destination data source is RocketMQ.</p>
         */
        @NameInMap("ProducerGroup")
        public String producerGroup;

        /**
         * <p>The timeout period in seconds for a single Post message when the destination data source is RocketMQ.</p>
         */
        @NameInMap("SendMsgTimeout")
        public Long sendMsgTimeout;

        /**
         * <p>Indicates whether message sequencing is enabled when the destination data source is DataHub.</p>
         */
        @NameInMap("SequenceEnable")
        public Boolean sequenceEnable;

        /**
         * <p>The start time of the sequence, which must be specified if the destination data source is DataHub and message sequencing is enabled. The value is a timestamp in seconds.</p>
         */
        @NameInMap("SequenceStartTimestamp")
        public Long sequenceStartTimestamp;

        /**
         * <p>The text serialization type, which must be specified if the destination data source is a message queue system, such as Kafka, DataHub, or RocketMQ. Valid values: Default, DefaultExtendColumnType, Canal, Dataworks, and SharePlex.</p>
         */
        @NameInMap("SerializerType")
        public String serializerType;

        /**
         * <p>The type of the topic to which the Post message belongs when the destination data source is DataHub. Valid values: Tuple and Blob.</p>
         */
        @NameInMap("TopicType")
        public String topicType;

        public static DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig self = new DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setEnableMsgTrace(Boolean enableMsgTrace) {
            this.enableMsgTrace = enableMsgTrace;
            return this;
        }
        public Boolean getEnableMsgTrace() {
            return this.enableMsgTrace;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setMsgTags(String msgTags) {
            this.msgTags = msgTags;
            return this;
        }
        public String getMsgTags() {
            return this.msgTags;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setPartitionMode(String partitionMode) {
            this.partitionMode = partitionMode;
            return this;
        }
        public String getPartitionMode() {
            return this.partitionMode;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setProducerGroup(String producerGroup) {
            this.producerGroup = producerGroup;
            return this;
        }
        public String getProducerGroup() {
            return this.producerGroup;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setSendMsgTimeout(Long sendMsgTimeout) {
            this.sendMsgTimeout = sendMsgTimeout;
            return this;
        }
        public Long getSendMsgTimeout() {
            return this.sendMsgTimeout;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setSequenceEnable(Boolean sequenceEnable) {
            this.sequenceEnable = sequenceEnable;
            return this;
        }
        public Boolean getSequenceEnable() {
            return this.sequenceEnable;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setSequenceStartTimestamp(Long sequenceStartTimestamp) {
            this.sequenceStartTimestamp = sequenceStartTimestamp;
            return this;
        }
        public Long getSequenceStartTimestamp() {
            return this.sequenceStartTimestamp;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setSerializerType(String serializerType) {
            this.serializerType = serializerType;
            return this;
        }
        public String getSerializerType() {
            return this.serializerType;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setTopicType(String topicType) {
            this.topicType = topicType;
            return this;
        }
        public String getTopicType() {
            return this.topicType;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails extends TeaModel {
        /**
         * <p>The error code.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Valid values: CRITICAL, ERROR, and WARN.</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The suggestions (new).</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        public static DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails self = new DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo extends TeaModel {
        /**
         * <p>The error code, such as AUTHENTICATION_ERROR, PARAM_ERROR, PARAM_ERROR_MESSAGE, NOT_IMPLEMENTED_ERROR, SHARD_COLUMNS_CONFLICT_MESSAGE, FAILED_PARSE_TOKEN_MESSAGE, CONNECT_CHECK_ERROR, NOT_SUPPORT_ERROR, CE_NOT_SUPPORT_ERROR, NOT_FOUND_ERROR, SHARDING_COLUMN_NOT_INCLUDED_ERROR, INNER_ERROR, DB_QUERY_ERROR, DATAHUB_QUERY_ERROR, USER_LACK_SYS_PRIV_ERROR, USER_LACK_TABLE_PRIV_ERROR, RM_API_ERROR, RM_TASK_ERROR, CM_API_ERROR, CM_API_NOT_SUCCESS, BAGUALU_API_ERROR, IDB_API_ERROR, SUPERVISOR_API_ERROR, OCP_API_ERROR, OCP_SERVICE_ERROR, OCP_QUERY_VERSION_FAILED, OCP_VERSION_INCORRECT_ERROR, OCP_VERSION_NOT_SUPPORTED_ERROR, OCP_API_USER_PASSWORD_INCORRECT_ERROR, OBSCHEMA_ERROR, EXECUTOR_THREAD_POOL_BUSY, NO_TABLE_SELECTED, NO_VIEW_SELECTED, SOURCE_CRAWLER_START_FAILED, SOURCE_CRAWLER_START_FAILED_DATA_EXPIRED, SOURCE_CRAWLER_START_TIMEOUT, DEST_WRITER_START_FAILED, WRITER_UNKNOWN_STATUS, DRC_TOPIC_EXISTS_ERROR, TOPIC_EMPTY_ERROR, REACH_WRITER_LIMIT_ERROR, FOUND_NO_FEASIBLE_STORE_ERROR, TOO_MANY_STORES_FOR_SUBTOPIC, TIMEOUT_EXCEPTION, KIPP_API_ERROR, KIPP_API_RESOURCE_NOT_FOUND, KIPP_API_INVALID_PARAM, KIPP_API_UNKNOWN_ERROR, KIPP_API_INTERNAL_ERROR, KIPP_API_SERVICE_UNAVAILABLE, OMS_AGENT_API_ERROR, KMS_API_ERROR, OMS_ENCRYPT_API_ERROR, OMS_DECRYPT_API_ERROR, ALIYUN_SDK_ERROR, YAOCHI_API_ERROR, RESOURCE_WITHOUT_STOCK_ERROR, RESOURCE_NO_AVAILABLE_ZONE, CM_SDK_ERROR, MIGRATION_PROJECT_STEP_PRECHECK_FAILED, PRE_CHECK_ERROR, FAILURES_CORRECT_ERROR, EXECUTE_DDL_FAILURE, EXECUTE_DDL_UNSUPPORTED_OR_FAILURE, STRUCT_RECORD_DDL_NOT_FOUND, STRUCT_RECORD_INDEX_NOT_FOUND, STRUCT_RECORD_NOT_FOUND, STRUCT_RECORD_NOT_FOUND_IN_DBCAT, SCHEMA_OBJECT_TYPE_NOT_SUPPORT_ERROR, POLAR_MYSQL_NETWORK_TYPE_NOT_SUPPORT_ERROR, RDS_NETWORK_TYPE_NOT_SUPPORT_ERROR, RDS_VPC_NETWORK_NOT_SUPPORT_ERROR, DB_TYPE_NOT_SUPPORT_ERROR, SYNC_TYPE_NOT_SUPPORT_ERROR, SLAVE_OPERATION_STEP_NOT_SUPPORT_ERROR, BYTE_USED_TYPE_NOT_SUPPORT_ERROR, MANY_TO_ONE_SCHEMA_TABLE_REVERSE_INCR_NOT_SUPPORT_ERROR, DUPLICATE_SCHEMA_TABLE_ERROR, OMS_STEP_NOT_SUPPORT_ERROR, ORACLE_DATABASE_ROLE_NOT_SUPPORT_ERROR, OLD_PRE_CHECK_NOT_SUPPORT_ERROR, SCHEMA_ONE_TO_MANY_NOT_SUPPORT_ERROR, PROJECT_NOT_FOUND_ERROR, ENDPOINT_NOT_FOUND_ERROR, ENDPOINT_NAME_ALREADY_EXIST_ERROR, ENDPOINT_QUERY_ERROR, ENDPOINT_SQL_QUERY_ERROR, PROJECT_NAME_ALREADY_EXIST_ERROR, CHECKER_NOT_FOUND_ERROR, CHECKER_FAILED_ERROR, CHECKER_STATUS_UNEXPECTED_ERROR, CHECKER_NO_TASK_TYPE_ERROR, WORKER_INSTANCE_NOT_FOUND_ERROR, WORKER_INSTANCE_ALLOCATING_ERROR, LOG_SERVICE_TOPIC_NOT_FOUND_ERROR, CLUSTER_NOT_FOUND_ERROR, TENANT_NOT_FOUND_ERROR, DATABASE_NOT_FOUND_ERROR, TABLE_NOT_FOUND_ERROR, COLUMN_NOT_FOUND_ERROR, TABLE_META_NOT_FOUND_ERROR, SYBASE_CHARSET_NOT_FOUND_ERROR, OCP_NOT_FOUND_ERROR, REGION_NOT_FOUND_ERROR, OCP_ALREADY_EXIST_ERROR, ALARM_CHANNEL_NAME_ALREADY_EXIST_ERROR, SEND_MARKDOWN_TEXT_TO_WEBHOOK_FAILED_EXCEPTION_RESPONSE, SEND_MARKDOWN_TEXT_TO_WEBHOOK_FAILED_EXCEPTION_STATUS, LABEL_ALREADY_EXIST_ERROR, LABEL_NOT_EXIST_ERROR, OCP_ALREADY_USED_ERROR, REGION_INFO_INCONSISTENT_ERROR, OCP_NAME_EMPTY_ERROR, MASTER_SLAVE_ENDPOINT_NAME_INCONSISTENT_ERROR, LOG_FILE_NOT_FOUND_ERROR, OPERATION_NOT_ALLOWED_ERROR, PROJECT_OPERATION_NOT_ALLOWED_ERROR, PROJECT_RELEASE_FAILED, STRUCT_MIGRATION_RETRY_NOT_ALLOWED_ERROR, WORKER_INSTANCE_OPERATION_NOT_ALLOWED_ERROR, USER_OPERATION_NOT_ALLOWED_ERROR, OCP_NAME_OR_REGION_NOT_ALLOWED_UPDATE, UPDATE_CONFIG_WITH_NEWLINE_NOT_ALLOWED, EXIST_UNRELEASED_PROJECT_ERROR, EXIST_UNRELEASED_TOPIC_ERROR, LABEL_CREATE_NOT_ALLOWED_ERROR, LABEL_UPDATE_NOT_ALLOWED_ERROR, LABEL_DELETE_NOT_ALLOWED_ERROR, TOPIC_NAME_INVALID_ERROR, INVALID_STATUS_ERROR, INVALID_CSV_HEAD_ERROR, INVALID_CSV_BODY_ERROR, DUPLICATE_SCHEMA_TABLE_SETTING_ERROR, PROJECT_INVALID_STATUS_ERROR, PROJECT_INVALID_CONNECTOR_COUNT_ERROR, WORKER_INSTANCE_INVALID_STATUS_ERROR, LOG_SERVICE_INVALID_STATUS_ERROR, STEP_INVALID_STATUS_ERROR, UPDATE_ALLOW_DEST_TABLE_NOT_EMPTY_NOT_ALLOWED_ERROR, EXIST_INCONSISTENCY_ERROR, OMS_SWITCH_SUBSTEP_FAILED_ERROR, ENDPOINT_ID_INVALID_ERROR, DB_QUERY_VERSION_EMPTY_ERROR, ENDPOINT_NAME_INVALID_ERROR, ENDPOINT_SCHEMA_NOT_ALLOWED_ERROR, ENDPOINT_SCHEMA_CHAR_NOT_ALLOWED_ERROR, NAME_HAS_SPACE_EXCEPTION, CONFIG_CONVERT_VALUE_ERROR, CONFIG_VALUE_EXCEEDS_LIMIT_ERROR, CONFIG_KEY_NOT_FOUND_KEY_ERROR, CONFIG_VALUE_NOT_EMPTY_ERROR, SCHEMA_HAS_CONVERT_INFO, TIME_SERIES_QUERY_SERVICE_ERROR, ETL_VERIFY_ERROR, ETL_SYNTAX_UNSUPPORTED, ETL_FIELD_NOTFOUND, ETL_FAILED_PARSE_SQL, ETL_VAL_TYPE_ERROR, NOT_SUPPORT_GENERATE_COLUMNS, NOT_SUPPORT_UPDATE_ETL, LOCK_FAILED, OMS_USER_EXIST_ERROR, OMS_USER_NOT_FOUND_ERROR, OMS_USER_NAME_LENGTH_CONSTRAINT, OMS_USER_PASSWORD_ERROR, USER_NAME_OR_PASSWORD_ERROR, OMS_USER_PASSWORD_VALIDATION_ERROR, OMS_USER_PASSWORD_DEFAULT_ERROR, OMS_USER_PERMISSION_DENIED_ERROR, OMS_USER_EDIT_ADMIN_ROLE_INFO_PERMISSION_DENIED_ERROR, OMS_USER_ILLEGAL_DELETED_ERROR, CONNECTOR_TASK_NOT_FOUND_ERROR, CONNECTOR_TASK_NUM_LIMIT_ERROR, CONNECTOR_TASK_DELETE_ERROR, METRIC_SERVICE_ERROR, SYNC_PROJECT_TYPE_INVALID_ERROR, SYNC_SHARDING_COLUMNS_INVALID_ERROR, SYNC_PROJECT_PRODUCER_GROUP_INVALID_ERROR, SYNC_PROJECT_PRODUCER_GROUP_LIMIT_EXCEEDS_ERROR, SYNC_PROJECT_COMPLEMENT_CONFIG_ERROR, META_SCHEMA_CREATE_FAILED, RESUME_STEP_FAILED, SCHEMA_INCONSISTENCY, SCHEMA_CASCADE_MAPPING_NOT_SUPPORT_ERROR, SCHEMA_NOT_EXISTED, SCHEMA_EXISTED, SCHEMA_NOT_EXIST, BLACK_LIST_MATCH_ALL, BLACK_LIST_CONTAIN_NON_WHITE_SCHEMA, BLACK_WHITE_LIST_PARAM_INVALID_ERROR, OPERATOR_ERROR, OPERATOR_DIMENSION_NOT_SUPPORT, OPERATOR_PULL_LOG_ERROR, OPERATOR_UPDATE_CONFIG_NOT_SUPPORT, KAFKA_CREATE_TOPIC_ERROR, KAFKA_QUERY_TOPIC_ERROR, KAFKA_BUILD_PROPERTIES_ERROR, ROCKETMQ_CREATE_TOPIC_ERROR, ROCKETMQ_QUERY_TOPIC_ERROR, SYNC_OBJECT_EMPTY_ERROR, WRITER_NUMBER_NOT_UNIQUE, WRITER_NOT_ACTIVE, PROJECT_NAME_DUPLICATE_ERROR, EMPTY_FAILED_STRUCT_MIGRATION_TABLES_ERROR, LOGIC_TABLE_NOT_SUPPORT_UPDATE_OBJECT_ERROR, LOGIC_REQUEST_ERROR, LOGIC_DTO_BUILD_ERROR, UNEXPECTED_REMOTE_API_RESULT, OCEANBASE_USER_UNEXPECTED, STORE_CREATE_FAILED_ERROR, STORE_START_FAILED, STORE_NOT_PULL_LOG_ERROR, ALL_HOSTS_STATUS_ERROR, WORKER_ECS_NOT_FOUND_ERROR, WORKER_ECS_NOT_FOUND_FOR_USER_ERROR, WORKER_POD_NOT_FOUND_ERROR, WORKER_POD_NOT_FOUND_FOR_USER_ERROR, WORKER_INSTANCE_NOT_FOUND_ERROR_V2, and WORKER_INSTANCE_NOT_FOUND_FOR_USER_ERROR.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error details.</p>
         */
        @NameInMap("ErrorDetails")
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails> errorDetails;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The error related parameters.</p>
         */
        @NameInMap("ErrorParam")
        public java.util.Map<String, String> errorParam;

        /**
         * <p>The time when the error occurred.</p>
         */
        @NameInMap("FailedTime")
        public String failedTime;

        public static DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo self = new DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo setErrorDetails(java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo setErrorParam(java.util.Map<String, String> errorParam) {
            this.errorParam = errorParam;
            return this;
        }
        public java.util.Map<String, String> getErrorParam() {
            return this.errorParam;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo setFailedTime(String failedTime) {
            this.failedTime = failedTime;
            return this;
        }
        public String getFailedTime() {
            return this.failedTime;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview extends TeaModel {
        /**
         * <p>The estimated maximum time remained, in seconds.</p>
         */
        @NameInMap("EstimatedRemainingTimeOfSec")
        public Long estimatedRemainingTimeOfSec;

        /**
         * <p>The estimated amount of data to migrate.</p>
         */
        @NameInMap("EstimatedTotalCount")
        public Long estimatedTotalCount;

        /**
         * <p>The amount of data migrated.</p>
         */
        @NameInMap("FinishedCount")
        public Long finishedCount;

        /**
         * <p>finishedCount / estimatedTotalCount</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        public static DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview self = new DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview setEstimatedRemainingTimeOfSec(Long estimatedRemainingTimeOfSec) {
            this.estimatedRemainingTimeOfSec = estimatedRemainingTimeOfSec;
            return this;
        }
        public Long getEstimatedRemainingTimeOfSec() {
            return this.estimatedRemainingTimeOfSec;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview setEstimatedTotalCount(Long estimatedTotalCount) {
            this.estimatedTotalCount = estimatedTotalCount;
            return this;
        }
        public Long getEstimatedTotalCount() {
            return this.estimatedTotalCount;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview setFinishedCount(Long finishedCount) {
            this.finishedCount = finishedCount;
            return this;
        }
        public Long getFinishedCount() {
            return this.finishedCount;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo extends TeaModel {
        /**
         * <p>The estimated total number of rows.</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The checkpoint. The value is a unix timestamp in seconds.</p>
         */
        @NameInMap("Checkpoint")
        public String checkpoint;

        /**
         * <p>The full synchronization progress.</p>
         */
        @NameInMap("ConnectorFullProgressOverview")
        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview connectorFullProgressOverview;

        /**
         * <p>The resource deployment ID.</p>
         */
        @NameInMap("DeployId")
        public String deployId;

        /**
         * <p>The read/write throughput of the destination data source, in bytes per second.</p>
         */
        @NameInMap("DstIops")
        public Long dstIops;

        /**
         * <p>The read/write RPS of the destination data source.</p>
         */
        @NameInMap("DstRps")
        public Long dstRps;

        /**
         * <p>The read/write RPS baseline of the destination data source.</p>
         */
        @NameInMap("DstRpsRef")
        public Long dstRpsRef;

        /**
         * <p>The read/write RT per record of the destination data source, in ms.</p>
         */
        @NameInMap("DstRt")
        public Long dstRt;

        /**
         * <p>The read/write RT baseline of the destination data source.</p>
         */
        @NameInMap("DstRtRef")
        public Long dstRtRef;

        /**
         * <p>The checkpoint collection time. The value is a unix timestamp in seconds.</p>
         */
        @NameInMap("Gmt")
        public Long gmt;

        /**
         * <p>The amount of inconsistent data found during full verification.</p>
         */
        @NameInMap("Inconsistencies")
        public Long inconsistencies;

        /**
         * <p>The checkpoint in incremental synchronization. The value is a unix timestamp in seconds.</p>
         */
        @NameInMap("IncrTimestampCheckpoint")
        public Long incrTimestampCheckpoint;

        /**
         * <p>The job ID.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The number of migrated rows.</p>
         */
        @NameInMap("ProcessedRecords")
        public Long processedRecords;

        /**
         * <p>A sub-status that indicates whether this step is skipped.</p>
         */
        @NameInMap("Skipped")
        public Boolean skipped;

        /**
         * <p>The read throughput of the source data source, in bytes per second.</p>
         */
        @NameInMap("SrcIops")
        public Long srcIops;

        /**
         * <p>The read throughput baseline of the source data source.</p>
         */
        @NameInMap("SrcIopsRef")
        public Long srcIopsRef;

        /**
         * <p>The read requests per second (RPS) of the source data source.</p>
         */
        @NameInMap("SrcRps")
        public Long srcRps;

        /**
         * <p>The read RPS baseline of the source data source.</p>
         */
        @NameInMap("SrcRpsRef")
        public Long srcRpsRef;

        /**
         * <p>The read response time (RT) per record of the source data source, in ms.</p>
         */
        @NameInMap("SrcRt")
        public Long srcRt;

        /**
         * <p>The read RT baseline of the source data source.</p>
         */
        @NameInMap("SrcRtRef")
        public Long srcRtRef;

        /**
         * <p>A sub-status that indicates whether the checker has completed full verification.</p>
         */
        @NameInMap("Validated")
        public Boolean validated;

        public static DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo self = new DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setConnectorFullProgressOverview(DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview connectorFullProgressOverview) {
            this.connectorFullProgressOverview = connectorFullProgressOverview;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview getConnectorFullProgressOverview() {
            return this.connectorFullProgressOverview;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setDeployId(String deployId) {
            this.deployId = deployId;
            return this;
        }
        public String getDeployId() {
            return this.deployId;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setDstIops(Long dstIops) {
            this.dstIops = dstIops;
            return this;
        }
        public Long getDstIops() {
            return this.dstIops;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setDstRps(Long dstRps) {
            this.dstRps = dstRps;
            return this;
        }
        public Long getDstRps() {
            return this.dstRps;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setDstRpsRef(Long dstRpsRef) {
            this.dstRpsRef = dstRpsRef;
            return this;
        }
        public Long getDstRpsRef() {
            return this.dstRpsRef;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setDstRt(Long dstRt) {
            this.dstRt = dstRt;
            return this;
        }
        public Long getDstRt() {
            return this.dstRt;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setDstRtRef(Long dstRtRef) {
            this.dstRtRef = dstRtRef;
            return this;
        }
        public Long getDstRtRef() {
            return this.dstRtRef;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setGmt(Long gmt) {
            this.gmt = gmt;
            return this;
        }
        public Long getGmt() {
            return this.gmt;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setInconsistencies(Long inconsistencies) {
            this.inconsistencies = inconsistencies;
            return this;
        }
        public Long getInconsistencies() {
            return this.inconsistencies;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setIncrTimestampCheckpoint(Long incrTimestampCheckpoint) {
            this.incrTimestampCheckpoint = incrTimestampCheckpoint;
            return this;
        }
        public Long getIncrTimestampCheckpoint() {
            return this.incrTimestampCheckpoint;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setProcessedRecords(Long processedRecords) {
            this.processedRecords = processedRecords;
            return this;
        }
        public Long getProcessedRecords() {
            return this.processedRecords;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setSkipped(Boolean skipped) {
            this.skipped = skipped;
            return this;
        }
        public Boolean getSkipped() {
            return this.skipped;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setSrcIops(Long srcIops) {
            this.srcIops = srcIops;
            return this;
        }
        public Long getSrcIops() {
            return this.srcIops;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setSrcIopsRef(Long srcIopsRef) {
            this.srcIopsRef = srcIopsRef;
            return this;
        }
        public Long getSrcIopsRef() {
            return this.srcIopsRef;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setSrcRps(Long srcRps) {
            this.srcRps = srcRps;
            return this;
        }
        public Long getSrcRps() {
            return this.srcRps;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setSrcRpsRef(Long srcRpsRef) {
            this.srcRpsRef = srcRpsRef;
            return this;
        }
        public Long getSrcRpsRef() {
            return this.srcRpsRef;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setSrcRt(Long srcRt) {
            this.srcRt = srcRt;
            return this;
        }
        public Long getSrcRt() {
            return this.srcRt;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setSrcRtRef(Long srcRtRef) {
            this.srcRtRef = srcRtRef;
            return this;
        }
        public Long getSrcRtRef() {
            return this.srcRtRef;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setValidated(Boolean validated) {
            this.validated = validated;
            return this;
        }
        public Boolean getValidated() {
            return this.validated;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataSteps extends TeaModel {
        /**
         * <p>The estimated time remained.</p>
         */
        @NameInMap("EstimatedRemainingSeconds")
        public Long estimatedRemainingSeconds;

        /**
         * <p>The additional information. The value is a JSON string.</p>
         */
        @NameInMap("ExtraInfo")
        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo extraInfo;

        /**
         * <p>The end time, in the format of "2020-05-22T17:04:18".</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>Indicates whether the current step must be confirmed by the user, rather than scheduled in the backend.</p>
         */
        @NameInMap("Interactive")
        public Boolean interactive;

        /**
         * <p>The start time, in the format of "2020-05-22T17:04:18".</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The description of the step, for example, schema migration, full migration, full verification, incremental log pull, incremental synchronization, or incremental verification.</p>
         */
        @NameInMap("StepDescription")
        public String stepDescription;

        /**
         * <p>The step details. The value is a JSON string.</p>
         */
        @NameInMap("StepInfo")
        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo stepInfo;

        /**
         * <p>The step name. Valid values: struct_migration, full_migration, full_validation, incr_log_pull, incr_sync/incr_validation, PRE_CHECK, PREPARE, STRUCT_MIGRATION, INDEX_MIGRATION, STRUCT_SYNC, FULL_MIGRATION, APP_SWITCH, REVERSE_INCR_SYNC, FULL_VALIDATION, INCR_LOG_PULL, INCR_SYNC, INCR_VALIDATION, SYNC_PREPARE, SYNC_INCR_LOG_PULL, CONNECTOR_FULL_SYNC, or CONNECTOR_INCR_SYNC.</p>
         */
        @NameInMap("StepName")
        public String stepName;

        /**
         * <p>The sequence of steps.</p>
         */
        @NameInMap("StepOrder")
        public Integer stepOrder;

        /**
         * <p>The step progress.</p>
         */
        @NameInMap("StepProgress")
        public Integer stepProgress;

        /**
         * <p>The step status. Valid values: INIT, RUNNING, FAILED, FINISHED, SUSPEND, and MONITORING. The value MONITORING indicates the continuous monitoring of incremental synchronization and incremental verification.</p>
         */
        @NameInMap("StepStatus")
        public String stepStatus;

        public static DescribeOmsOpenAPIProjectResponseBodyDataSteps build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataSteps self = new DescribeOmsOpenAPIProjectResponseBodyDataSteps();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setEstimatedRemainingSeconds(Long estimatedRemainingSeconds) {
            this.estimatedRemainingSeconds = estimatedRemainingSeconds;
            return this;
        }
        public Long getEstimatedRemainingSeconds() {
            return this.estimatedRemainingSeconds;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setExtraInfo(DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setInteractive(Boolean interactive) {
            this.interactive = interactive;
            return this;
        }
        public Boolean getInteractive() {
            return this.interactive;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setStepDescription(String stepDescription) {
            this.stepDescription = stepDescription;
            return this;
        }
        public String getStepDescription() {
            return this.stepDescription;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setStepInfo(DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo stepInfo) {
            this.stepInfo = stepInfo;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo getStepInfo() {
            return this.stepInfo;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setStepOrder(Integer stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Integer getStepOrder() {
            return this.stepOrder;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setStepProgress(Integer stepProgress) {
            this.stepProgress = stepProgress;
            return this;
        }
        public Integer getStepProgress() {
            return this.stepProgress;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setStepStatus(String stepStatus) {
            this.stepStatus = stepStatus;
            return this;
        }
        public String getStepStatus() {
            return this.stepStatus;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema extends TeaModel {
        /**
         * <p>The list of distribution key columns.</p>
         */
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        /**
         * <p>The lifecycle of the table.</p>
         */
        @NameInMap("PartitionLifeCycle")
        public Integer partitionLifeCycle;

        /**
         * <p>The partitioning expression.</p>
         */
        @NameInMap("PartitionStatement")
        public String partitionStatement;

        /**
         * <p>The list of primary key columns.</p>
         */
        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema self = new DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema setPartitionLifeCycle(Integer partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public Integer getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables extends TeaModel {
        /**
         * <p>The schema of the ADB table. If the destination data source is ADB, you need to configure additional information for schema synchronization.</p>
         */
        @NameInMap("AdbTableSchema")
        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema adbTableSchema;

        /**
         * <p>The list of filter columns, which are the columns to be synchronized.</p>
         */
        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        /**
         * <p>The name of the mapped-to table or topic. If the destination data source is a database, this parameter specifies the name of the mapped-to table. If the destination data source is a message queue system, this parameter specifies the name of the mapped-to topic.</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

        /**
         * <p>The list of sharding key columns. This parameter applies to scenarios where the destination data source is a message queue system.</p>
         */
        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        /**
         * <p>The ID of the table. This parameter takes effect when the source data source is IDB.</p>
         */
        @NameInMap("TableId")
        public String tableId;

        /**
         * <p>The name of the table.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>Valid values: DATABASE and TABLE.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The row filter conditions.</p>
         */
        @NameInMap("WhereClause")
        public String whereClause;

        public static DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables self = new DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables setAdbTableSchema(DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases extends TeaModel {
        /**
         * <p>The ID of the database. This parameter takes effect when the source data source is IDB.</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The mapped-to database. This parameter takes effect when the destination data source is a database.</p>
         */
        @NameInMap("MappedName")
        public String mappedName;

        /**
         * <p>The settings for the target table objects in the current database.</p>
         */
        @NameInMap("Tables")
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables> tables;

        /**
         * <p>The mapped-to tenant. This parameter takes effect when the source data source is OceanBase Database.</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>Valid values: DATABASE and TABLE.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases self = new DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases setTables(java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables> getTables() {
            return this.tables;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping extends TeaModel {
        /**
         * <p>The table mapping in the source data source, which is a conventional mapping scheme and takes effect only when Mode is set to NORMAL.</p>
         */
        @NameInMap("Databases")
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases> databases;

        /**
         * <p>The mapping type. Valid values: \"NORMAL\" and \"WHITE_AND_BLACK_LIST\".</p>
         */
        @NameInMap("Mode")
        public String mode;

        public static DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping self = new DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping setDatabases(java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases> getDatabases() {
            return this.databases;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig extends TeaModel {
        /**
         * <p>The list of data types of incremental data synchronized in incremental synchronization.</p>
         */
        @NameInMap("RecordTypeList")
        public java.util.List<String> recordTypeList;

        /**
         * <p>The start time for incremental synchronization. The value is a timestamp in seconds.</p>
         */
        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        /**
         * <p>The retention time of logs when incremental synchronization is enabled and the incremental log pull component is Store.</p>
         */
        @NameInMap("StoreLogKeptHour")
        public Long storeLogKeptHour;

        /**
         * <p>Indicates whether intra-transaction sequencing is enabled when incremental synchronization is enabled and the incremental log pull component is Store.</p>
         */
        @NameInMap("StoreTransactionEnabled")
        public Boolean storeTransactionEnabled;

        /**
         * <p>Valid values: STRUCT, FULL, and INCR.</p>
         */
        @NameInMap("TransferStepType")
        public String transferStepType;

        public static DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig self = new DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig setRecordTypeList(java.util.List<String> recordTypeList) {
            this.recordTypeList = recordTypeList;
            return this;
        }
        public java.util.List<String> getRecordTypeList() {
            return this.recordTypeList;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig setStartTimestamp(Long startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig setStoreLogKeptHour(Long storeLogKeptHour) {
            this.storeLogKeptHour = storeLogKeptHour;
            return this;
        }
        public Long getStoreLogKeptHour() {
            return this.storeLogKeptHour;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig setStoreTransactionEnabled(Boolean storeTransactionEnabled) {
            this.storeTransactionEnabled = storeTransactionEnabled;
            return this;
        }
        public Boolean getStoreTransactionEnabled() {
            return this.storeTransactionEnabled;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig setTransferStepType(String transferStepType) {
            this.transferStepType = transferStepType;
            return this;
        }
        public String getTransferStepType() {
            return this.transferStepType;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig extends TeaModel {
        /**
         * <p>Indicates whether full migration is enabled.</p>
         */
        @NameInMap("EnableFullSync")
        public Boolean enableFullSync;

        /**
         * <p>Indicates whether incremental synchronization is enabled.</p>
         */
        @NameInMap("EnableIncrSync")
        public Boolean enableIncrSync;

        /**
         * <p>Indicates whether schema synchronization is enabled.</p>
         */
        @NameInMap("EnableStructSync")
        public Boolean enableStructSync;

        /**
         * <p>The settings of incremental synchronization steps.</p>
         */
        @NameInMap("IncrSyncStepTransferConfig")
        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig incrSyncStepTransferConfig;

        public static DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig self = new DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig setEnableFullSync(Boolean enableFullSync) {
            this.enableFullSync = enableFullSync;
            return this;
        }
        public Boolean getEnableFullSync() {
            return this.enableFullSync;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig setEnableIncrSync(Boolean enableIncrSync) {
            this.enableIncrSync = enableIncrSync;
            return this;
        }
        public Boolean getEnableIncrSync() {
            return this.enableIncrSync;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig setEnableStructSync(Boolean enableStructSync) {
            this.enableStructSync = enableStructSync;
            return this;
        }
        public Boolean getEnableStructSync() {
            return this.enableStructSync;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig setIncrSyncStepTransferConfig(DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig incrSyncStepTransferConfig) {
            this.incrSyncStepTransferConfig = incrSyncStepTransferConfig;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig getIncrSyncStepTransferConfig() {
            return this.incrSyncStepTransferConfig;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyData extends TeaModel {
        /**
         * <p>The business system identifier, which is optional and is a specific field of the Post message.</p>
         */
        @NameInMap("BusinessName")
        public String businessName;

        /**
         * <p>The settings of the destination data source.</p>
         */
        @NameInMap("DestConfig")
        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig destConfig;

        /**
         * <p>A collection of label IDs.</p>
         */
        @NameInMap("Labels")
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataLabels> labels;

        /**
         * <p>The project ID.</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The name of the project.</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The project owner.</p>
         */
        @NameInMap("ProjectOwner")
        public String projectOwner;

        /**
         * <p>The settings of the source data source.</p>
         */
        @NameInMap("SourceConfig")
        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig sourceConfig;

        /**
         * <p>The detailed project steps.</p>
         */
        @NameInMap("Steps")
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataSteps> steps;

        /**
         * <p>The mappings for the synchronization objects.</p>
         */
        @NameInMap("TransferMapping")
        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping transferMapping;

        /**
         * <p>The settings of synchronization steps</p>
         */
        @NameInMap("TransferStepConfig")
        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig transferStepConfig;

        public static DescribeOmsOpenAPIProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyData self = new DescribeOmsOpenAPIProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setDestConfig(DescribeOmsOpenAPIProjectResponseBodyDataDestConfig destConfig) {
            this.destConfig = destConfig;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig getDestConfig() {
            return this.destConfig;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setLabels(java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataLabels> getLabels() {
            return this.labels;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setProjectOwner(String projectOwner) {
            this.projectOwner = projectOwner;
            return this;
        }
        public String getProjectOwner() {
            return this.projectOwner;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setSourceConfig(DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig getSourceConfig() {
            return this.sourceConfig;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setSteps(java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataSteps> getSteps() {
            return this.steps;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setTransferMapping(DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping transferMapping) {
            this.transferMapping = transferMapping;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping getTransferMapping() {
            return this.transferMapping;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setTransferStepConfig(DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig transferStepConfig) {
            this.transferStepConfig = transferStepConfig;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig getTransferStepConfig() {
            return this.transferStepConfig;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyErrorDetail extends TeaModel {
        /**
         * <p>The error code (new).</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The error level. Valid values: CRITICAL, ERROR, and WARN.</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The error description (new).</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The suggestions (new).</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        public static DescribeOmsOpenAPIProjectResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyErrorDetail self = new DescribeOmsOpenAPIProjectResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeOmsOpenAPIProjectResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeOmsOpenAPIProjectResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeOmsOpenAPIProjectResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

    }

}
