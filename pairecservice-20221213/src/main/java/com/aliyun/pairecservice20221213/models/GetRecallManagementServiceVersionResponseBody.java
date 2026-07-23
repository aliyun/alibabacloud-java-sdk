// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetRecallManagementServiceVersionResponseBody extends TeaModel {
    /**
     * <p>The configuration details.</p>
     */
    @NameInMap("Configs")
    public GetRecallManagementServiceVersionResponseBodyConfigs configs;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>Indicates whether the current version is effective.</p>
     */
    @NameInMap("IsEffective")
    public Boolean isEffective;

    /**
     * <p>The name of the recall service version.</p>
     * 
     * <strong>example:</strong>
     * <p>V1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The identifier of the recall service version.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RecallManagementServiceVersionId")
    public String recallManagementServiceVersionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E15A1443-7917-5BE0-AE70-25538ECF398D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRecallManagementServiceVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecallManagementServiceVersionResponseBody self = new GetRecallManagementServiceVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecallManagementServiceVersionResponseBody setConfigs(GetRecallManagementServiceVersionResponseBodyConfigs configs) {
        this.configs = configs;
        return this;
    }
    public GetRecallManagementServiceVersionResponseBodyConfigs getConfigs() {
        return this.configs;
    }

    public GetRecallManagementServiceVersionResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetRecallManagementServiceVersionResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetRecallManagementServiceVersionResponseBody setIsEffective(Boolean isEffective) {
        this.isEffective = isEffective;
        return this;
    }
    public Boolean getIsEffective() {
        return this.isEffective;
    }

    public GetRecallManagementServiceVersionResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetRecallManagementServiceVersionResponseBody setRecallManagementServiceVersionId(String recallManagementServiceVersionId) {
        this.recallManagementServiceVersionId = recallManagementServiceVersionId;
        return this;
    }
    public String getRecallManagementServiceVersionId() {
        return this.recallManagementServiceVersionId;
    }

    public GetRecallManagementServiceVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRecallManagementServiceVersionResponseBodyConfigsMergeConfig extends TeaModel {
        /**
         * <p>Reserved for future use.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ExtendedConfig")
        public String extendedConfig;

        /**
         * <p>The filter expression.</p>
         * 
         * <strong>example:</strong>
         * <p>age&gt;20</p>
         */
        @NameInMap("FilterExpression")
        public String filterExpression;

        /**
         * <p>The identifiers of the tables to filter.</p>
         */
        @NameInMap("FilterRecallManagementTableIds")
        public java.util.List<String> filterRecallManagementTableIds;

        /**
         * <p>The identifier of the item table.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ItemRecallManagementTableId")
        public String itemRecallManagementTableId;

        /**
         * <p>The output fields from the item table.</p>
         */
        @NameInMap("ItemTableFields")
        public java.util.List<String> itemTableFields;

        /**
         * <p>The merge type.</p>
         * 
         * <strong>example:</strong>
         * <p>Weight</p>
         */
        @NameInMap("MergeType")
        public String mergeType;

        /**
         * <p>The identifier of the recall service version configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecallManagementServiceVersionConfigId")
        public String recallManagementServiceVersionConfigId;

        public static GetRecallManagementServiceVersionResponseBodyConfigsMergeConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementServiceVersionResponseBodyConfigsMergeConfig self = new GetRecallManagementServiceVersionResponseBodyConfigsMergeConfig();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsMergeConfig setExtendedConfig(String extendedConfig) {
            this.extendedConfig = extendedConfig;
            return this;
        }
        public String getExtendedConfig() {
            return this.extendedConfig;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsMergeConfig setFilterExpression(String filterExpression) {
            this.filterExpression = filterExpression;
            return this;
        }
        public String getFilterExpression() {
            return this.filterExpression;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsMergeConfig setFilterRecallManagementTableIds(java.util.List<String> filterRecallManagementTableIds) {
            this.filterRecallManagementTableIds = filterRecallManagementTableIds;
            return this;
        }
        public java.util.List<String> getFilterRecallManagementTableIds() {
            return this.filterRecallManagementTableIds;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsMergeConfig setItemRecallManagementTableId(String itemRecallManagementTableId) {
            this.itemRecallManagementTableId = itemRecallManagementTableId;
            return this;
        }
        public String getItemRecallManagementTableId() {
            return this.itemRecallManagementTableId;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsMergeConfig setItemTableFields(java.util.List<String> itemTableFields) {
            this.itemTableFields = itemTableFields;
            return this;
        }
        public java.util.List<String> getItemTableFields() {
            return this.itemTableFields;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsMergeConfig setMergeType(String mergeType) {
            this.mergeType = mergeType;
            return this;
        }
        public String getMergeType() {
            return this.mergeType;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsMergeConfig setRecallManagementServiceVersionConfigId(String recallManagementServiceVersionConfigId) {
            this.recallManagementServiceVersionConfigId = recallManagementServiceVersionConfigId;
            return this;
        }
        public String getRecallManagementServiceVersionConfigId() {
            return this.recallManagementServiceVersionConfigId;
        }

    }

    public static class GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFeatureConfig extends TeaModel {
        /**
         * <p>The feature expression.</p>
         * 
         * <strong>example:</strong>
         * <p>city = \&quot;hangzhou\&quot;</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The feature name.</p>
         * 
         * <strong>example:</strong>
         * <p>city</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The feature type.</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFeatureConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFeatureConfig self = new GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFeatureConfig();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFeatureConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFeatureConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFeatureConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFilterConfig extends TeaModel {
        /**
         * <p>The filter expression.</p>
         * 
         * <strong>example:</strong>
         * <p>age &gt; 10</p>
         */
        @NameInMap("Experession")
        public String experession;

        public static GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFilterConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFilterConfig self = new GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFilterConfig();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFilterConfig setExperession(String experession) {
            this.experession = experession;
            return this;
        }
        public String getExperession() {
            return this.experession;
        }

    }

    public static class GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsJoinConfig extends TeaModel {
        /**
         * <p>The join field.</p>
         * 
         * <strong>example:</strong>
         * <p>item_id</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <p>The fields to return.</p>
         */
        @NameInMap("OutputFields")
        public java.util.List<String> outputFields;

        /**
         * <p>The identifier of the join table.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RecallManagementTableId")
        public String recallManagementTableId;

        public static GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsJoinConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsJoinConfig self = new GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsJoinConfig();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsJoinConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsJoinConfig setOutputFields(java.util.List<String> outputFields) {
            this.outputFields = outputFields;
            return this;
        }
        public java.util.List<String> getOutputFields() {
            return this.outputFields;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsJoinConfig setRecallManagementTableId(String recallManagementTableId) {
            this.recallManagementTableId = recallManagementTableId;
            return this;
        }
        public String getRecallManagementTableId() {
            return this.recallManagementTableId;
        }

    }

    public static class GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsTriggerConfig extends TeaModel {
        /**
         * <p>The field name.</p>
         * 
         * <strong>example:</strong>
         * <p>user_id</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <p>The maximum number of fields.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("FieldQuantityLimit")
        public Integer fieldQuantityLimit;

        /**
         * <p>Indicates whether to perform a random sort.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsRandSort")
        public Boolean isRandSort;

        /**
         * <p>The sort field.</p>
         * 
         * <strong>example:</strong>
         * <p>create_time</p>
         */
        @NameInMap("SortField")
        public String sortField;

        public static GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsTriggerConfig self = new GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsTriggerConfig();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsTriggerConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsTriggerConfig setFieldQuantityLimit(Integer fieldQuantityLimit) {
            this.fieldQuantityLimit = fieldQuantityLimit;
            return this;
        }
        public Integer getFieldQuantityLimit() {
            return this.fieldQuantityLimit;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsTriggerConfig setIsRandSort(Boolean isRandSort) {
            this.isRandSort = isRandSort;
            return this;
        }
        public Boolean getIsRandSort() {
            return this.isRandSort;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsTriggerConfig setSortField(String sortField) {
            this.sortField = sortField;
            return this;
        }
        public String getSortField() {
            return this.sortField;
        }

    }

    public static class GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperators extends TeaModel {
        /**
         * <p>The configuration for the Feature operator.</p>
         */
        @NameInMap("FeatureConfig")
        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFeatureConfig featureConfig;

        /**
         * <p>The configuration for the Filter operator.</p>
         */
        @NameInMap("FilterConfig")
        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFilterConfig filterConfig;

        /**
         * <p>The configuration for the Join operator.</p>
         */
        @NameInMap("JoinConfig")
        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsJoinConfig joinConfig;

        /**
         * <p>The operator type.</p>
         * 
         * <strong>example:</strong>
         * <p>Filter</p>
         */
        @NameInMap("OperatorType")
        public String operatorType;

        /**
         * <p>The configuration for the Trigger operator.</p>
         */
        @NameInMap("TriggerConfig")
        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsTriggerConfig triggerConfig;

        public static GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperators build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperators self = new GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperators();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperators setFeatureConfig(GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFeatureConfig featureConfig) {
            this.featureConfig = featureConfig;
            return this;
        }
        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFeatureConfig getFeatureConfig() {
            return this.featureConfig;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperators setFilterConfig(GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFilterConfig filterConfig) {
            this.filterConfig = filterConfig;
            return this;
        }
        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFilterConfig getFilterConfig() {
            return this.filterConfig;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperators setJoinConfig(GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsJoinConfig joinConfig) {
            this.joinConfig = joinConfig;
            return this;
        }
        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsJoinConfig getJoinConfig() {
            return this.joinConfig;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperators setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperators setTriggerConfig(GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsTriggerConfig triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }
        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsTriggerConfig getTriggerConfig() {
            return this.triggerConfig;
        }

    }

    public static class GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs extends TeaModel {
        /**
         * <p>The recall description.</p>
         * 
         * <strong>example:</strong>
         * <p>this is etrec recall</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Reserved for future use.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ExtendedConfig")
        public String extendedConfig;

        /**
         * <p>The item conditions, specified as a string in JSON array format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;option&quot;:&quot;&lt;&quot;,&quot;field&quot;:&quot;category&quot;,&quot;type&quot;:&quot;STRING&quot;,&quot;value&quot;:&quot;10&quot;}]</p>
         */
        @NameInMap("ItemConditionArray")
        public String itemConditionArray;

        /**
         * <p>The item condition expression.</p>
         * 
         * <strong>example:</strong>
         * <p>age&gt;20</p>
         */
        @NameInMap("ItemConditionExpression")
        public String itemConditionExpression;

        /**
         * <p>The item vector field.</p>
         * 
         * <strong>example:</strong>
         * <p>item_embedding</p>
         */
        @NameInMap("ItemVectorField")
        public String itemVectorField;

        /**
         * <p>The identifier of the item vector recall table.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ItemVectorRecallManagementTableId")
        public String itemVectorRecallManagementTableId;

        /**
         * <p>The recall name.</p>
         * 
         * <strong>example:</strong>
         * <p>etrec</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of operators to apply.</p>
         */
        @NameInMap("Operators")
        public java.util.List<GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperators> operators;

        /**
         * <p>The priority. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <p>The identifier of the recall service version configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RecallManagementServiceVersionConfigId")
        public String recallManagementServiceVersionConfigId;

        /**
         * <p>The identifier of the recall management table.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RecallManagementTableId")
        public String recallManagementTableId;

        /**
         * <p>The recall type.</p>
         * 
         * <strong>example:</strong>
         * <p>X2I</p>
         */
        @NameInMap("RecallType")
        public String recallType;

        /**
         * <p>The sort fields.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("SortFields")
        public String sortFields;

        /**
         * <p>The user vector field.</p>
         * 
         * <strong>example:</strong>
         * <p>user_embedding</p>
         */
        @NameInMap("UserVectorField")
        public String userVectorField;

        /**
         * <p>The identifier of the user vector recall table.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("UserVectorRecallManagementTableId")
        public String userVectorRecallManagementTableId;

        public static GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs self = new GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs setExtendedConfig(String extendedConfig) {
            this.extendedConfig = extendedConfig;
            return this;
        }
        public String getExtendedConfig() {
            return this.extendedConfig;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs setItemConditionArray(String itemConditionArray) {
            this.itemConditionArray = itemConditionArray;
            return this;
        }
        public String getItemConditionArray() {
            return this.itemConditionArray;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs setItemConditionExpression(String itemConditionExpression) {
            this.itemConditionExpression = itemConditionExpression;
            return this;
        }
        public String getItemConditionExpression() {
            return this.itemConditionExpression;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs setItemVectorField(String itemVectorField) {
            this.itemVectorField = itemVectorField;
            return this;
        }
        public String getItemVectorField() {
            return this.itemVectorField;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs setItemVectorRecallManagementTableId(String itemVectorRecallManagementTableId) {
            this.itemVectorRecallManagementTableId = itemVectorRecallManagementTableId;
            return this;
        }
        public String getItemVectorRecallManagementTableId() {
            return this.itemVectorRecallManagementTableId;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs setOperators(java.util.List<GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperators> operators) {
            this.operators = operators;
            return this;
        }
        public java.util.List<GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperators> getOperators() {
            return this.operators;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs setRecallManagementServiceVersionConfigId(String recallManagementServiceVersionConfigId) {
            this.recallManagementServiceVersionConfigId = recallManagementServiceVersionConfigId;
            return this;
        }
        public String getRecallManagementServiceVersionConfigId() {
            return this.recallManagementServiceVersionConfigId;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs setRecallManagementTableId(String recallManagementTableId) {
            this.recallManagementTableId = recallManagementTableId;
            return this;
        }
        public String getRecallManagementTableId() {
            return this.recallManagementTableId;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs setRecallType(String recallType) {
            this.recallType = recallType;
            return this;
        }
        public String getRecallType() {
            return this.recallType;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs setSortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }
        public String getSortFields() {
            return this.sortFields;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs setUserVectorField(String userVectorField) {
            this.userVectorField = userVectorField;
            return this;
        }
        public String getUserVectorField() {
            return this.userVectorField;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs setUserVectorRecallManagementTableId(String userVectorRecallManagementTableId) {
            this.userVectorRecallManagementTableId = userVectorRecallManagementTableId;
            return this;
        }
        public String getUserVectorRecallManagementTableId() {
            return this.userVectorRecallManagementTableId;
        }

    }

    public static class GetRecallManagementServiceVersionResponseBodyConfigs extends TeaModel {
        /**
         * <p>The merge configuration.</p>
         */
        @NameInMap("MergeConfig")
        public GetRecallManagementServiceVersionResponseBodyConfigsMergeConfig mergeConfig;

        /**
         * <p>The recall service version configurations.</p>
         */
        @NameInMap("RecallConfigs")
        public java.util.List<GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs> recallConfigs;

        public static GetRecallManagementServiceVersionResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementServiceVersionResponseBodyConfigs self = new GetRecallManagementServiceVersionResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementServiceVersionResponseBodyConfigs setMergeConfig(GetRecallManagementServiceVersionResponseBodyConfigsMergeConfig mergeConfig) {
            this.mergeConfig = mergeConfig;
            return this;
        }
        public GetRecallManagementServiceVersionResponseBodyConfigsMergeConfig getMergeConfig() {
            return this.mergeConfig;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigs setRecallConfigs(java.util.List<GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs> recallConfigs) {
            this.recallConfigs = recallConfigs;
            return this;
        }
        public java.util.List<GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigs> getRecallConfigs() {
            return this.recallConfigs;
        }

    }

}
