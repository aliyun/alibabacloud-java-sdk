// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateRecallManagementServiceVersionRequest extends TeaModel {
    @NameInMap("Configs")
    public CreateRecallManagementServiceVersionRequestConfigs configs;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("SourceRecallManagementServiceVersionId")
    public String sourceRecallManagementServiceVersionId;

    public static CreateRecallManagementServiceVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecallManagementServiceVersionRequest self = new CreateRecallManagementServiceVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecallManagementServiceVersionRequest setConfigs(CreateRecallManagementServiceVersionRequestConfigs configs) {
        this.configs = configs;
        return this;
    }
    public CreateRecallManagementServiceVersionRequestConfigs getConfigs() {
        return this.configs;
    }

    public CreateRecallManagementServiceVersionRequest setSourceRecallManagementServiceVersionId(String sourceRecallManagementServiceVersionId) {
        this.sourceRecallManagementServiceVersionId = sourceRecallManagementServiceVersionId;
        return this;
    }
    public String getSourceRecallManagementServiceVersionId() {
        return this.sourceRecallManagementServiceVersionId;
    }

    public static class CreateRecallManagementServiceVersionRequestConfigsMergeConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;&quot;:&quot;&quot;}</p>
         */
        @NameInMap("ExtendedConfig")
        public String extendedConfig;

        /**
         * <strong>example:</strong>
         * <p>age&gt;10</p>
         */
        @NameInMap("FilterExpression")
        public String filterExpression;

        @NameInMap("FilterRecallManagementTableIds")
        public java.util.List<String> filterRecallManagementTableIds;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ItemRecallManagementTableId")
        public String itemRecallManagementTableId;

        @NameInMap("ItemTableFields")
        public java.util.List<String> itemTableFields;

        /**
         * <strong>example:</strong>
         * <p>Weight</p>
         */
        @NameInMap("MergeType")
        public String mergeType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecallManagementServiceVersionConfigId")
        public String recallManagementServiceVersionConfigId;

        public static CreateRecallManagementServiceVersionRequestConfigsMergeConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRecallManagementServiceVersionRequestConfigsMergeConfig self = new CreateRecallManagementServiceVersionRequestConfigsMergeConfig();
            return TeaModel.build(map, self);
        }

        public CreateRecallManagementServiceVersionRequestConfigsMergeConfig setExtendedConfig(String extendedConfig) {
            this.extendedConfig = extendedConfig;
            return this;
        }
        public String getExtendedConfig() {
            return this.extendedConfig;
        }

        public CreateRecallManagementServiceVersionRequestConfigsMergeConfig setFilterExpression(String filterExpression) {
            this.filterExpression = filterExpression;
            return this;
        }
        public String getFilterExpression() {
            return this.filterExpression;
        }

        public CreateRecallManagementServiceVersionRequestConfigsMergeConfig setFilterRecallManagementTableIds(java.util.List<String> filterRecallManagementTableIds) {
            this.filterRecallManagementTableIds = filterRecallManagementTableIds;
            return this;
        }
        public java.util.List<String> getFilterRecallManagementTableIds() {
            return this.filterRecallManagementTableIds;
        }

        public CreateRecallManagementServiceVersionRequestConfigsMergeConfig setItemRecallManagementTableId(String itemRecallManagementTableId) {
            this.itemRecallManagementTableId = itemRecallManagementTableId;
            return this;
        }
        public String getItemRecallManagementTableId() {
            return this.itemRecallManagementTableId;
        }

        public CreateRecallManagementServiceVersionRequestConfigsMergeConfig setItemTableFields(java.util.List<String> itemTableFields) {
            this.itemTableFields = itemTableFields;
            return this;
        }
        public java.util.List<String> getItemTableFields() {
            return this.itemTableFields;
        }

        public CreateRecallManagementServiceVersionRequestConfigsMergeConfig setMergeType(String mergeType) {
            this.mergeType = mergeType;
            return this;
        }
        public String getMergeType() {
            return this.mergeType;
        }

        public CreateRecallManagementServiceVersionRequestConfigsMergeConfig setRecallManagementServiceVersionConfigId(String recallManagementServiceVersionConfigId) {
            this.recallManagementServiceVersionConfigId = recallManagementServiceVersionConfigId;
            return this;
        }
        public String getRecallManagementServiceVersionConfigId() {
            return this.recallManagementServiceVersionConfigId;
        }

    }

    public static class CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFeatureConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>category=3</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <strong>example:</strong>
         * <p>city</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFeatureConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFeatureConfig self = new CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFeatureConfig();
            return TeaModel.build(map, self);
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFeatureConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFeatureConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFeatureConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFilterConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>age&gt;20</p>
         */
        @NameInMap("Experession")
        public String experession;

        public static CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFilterConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFilterConfig self = new CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFilterConfig();
            return TeaModel.build(map, self);
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFilterConfig setExperession(String experession) {
            this.experession = experession;
            return this;
        }
        public String getExperession() {
            return this.experession;
        }

    }

    public static class CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsJoinConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>item_id</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <strong>example:</strong>
         * <p>item_id</p>
         */
        @NameInMap("OutputFields")
        public java.util.List<String> outputFields;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("RecallManagementTableId")
        public String recallManagementTableId;

        public static CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsJoinConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsJoinConfig self = new CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsJoinConfig();
            return TeaModel.build(map, self);
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsJoinConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsJoinConfig setOutputFields(java.util.List<String> outputFields) {
            this.outputFields = outputFields;
            return this;
        }
        public java.util.List<String> getOutputFields() {
            return this.outputFields;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsJoinConfig setRecallManagementTableId(String recallManagementTableId) {
            this.recallManagementTableId = recallManagementTableId;
            return this;
        }
        public String getRecallManagementTableId() {
            return this.recallManagementTableId;
        }

    }

    public static class CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsTriggerConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>user_id</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("FieldQuantityLimit")
        public String fieldQuantityLimit;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsRandSort")
        public String isRandSort;

        /**
         * <strong>example:</strong>
         * <p>create_time</p>
         */
        @NameInMap("SortField")
        public String sortField;

        public static CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsTriggerConfig self = new CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsTriggerConfig();
            return TeaModel.build(map, self);
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsTriggerConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsTriggerConfig setFieldQuantityLimit(String fieldQuantityLimit) {
            this.fieldQuantityLimit = fieldQuantityLimit;
            return this;
        }
        public String getFieldQuantityLimit() {
            return this.fieldQuantityLimit;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsTriggerConfig setIsRandSort(String isRandSort) {
            this.isRandSort = isRandSort;
            return this;
        }
        public String getIsRandSort() {
            return this.isRandSort;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsTriggerConfig setSortField(String sortField) {
            this.sortField = sortField;
            return this;
        }
        public String getSortField() {
            return this.sortField;
        }

    }

    public static class CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperators extends TeaModel {
        @NameInMap("FeatureConfig")
        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFeatureConfig featureConfig;

        @NameInMap("FilterConfig")
        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFilterConfig filterConfig;

        @NameInMap("JoinConfig")
        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsJoinConfig joinConfig;

        /**
         * <strong>example:</strong>
         * <p>Filter</p>
         */
        @NameInMap("OperatorType")
        public String operatorType;

        @NameInMap("TriggerConfig")
        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsTriggerConfig triggerConfig;

        public static CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperators build(java.util.Map<String, ?> map) throws Exception {
            CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperators self = new CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperators();
            return TeaModel.build(map, self);
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperators setFeatureConfig(CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFeatureConfig featureConfig) {
            this.featureConfig = featureConfig;
            return this;
        }
        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFeatureConfig getFeatureConfig() {
            return this.featureConfig;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperators setFilterConfig(CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFilterConfig filterConfig) {
            this.filterConfig = filterConfig;
            return this;
        }
        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsFilterConfig getFilterConfig() {
            return this.filterConfig;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperators setJoinConfig(CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsJoinConfig joinConfig) {
            this.joinConfig = joinConfig;
            return this;
        }
        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsJoinConfig getJoinConfig() {
            return this.joinConfig;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperators setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperators setTriggerConfig(CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsTriggerConfig triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }
        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperatorsTriggerConfig getTriggerConfig() {
            return this.triggerConfig;
        }

    }

    public static class CreateRecallManagementServiceVersionRequestConfigsRecallConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>this is etrec recall</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ExtendedConfig")
        public String extendedConfig;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;option&quot;:&quot;&lt;&quot;,&quot;field&quot;:&quot;category&quot;,&quot;type&quot;:&quot;STRING&quot;,&quot;value&quot;:&quot;10&quot;}]</p>
         */
        @NameInMap("ItemConditionArray")
        public String itemConditionArray;

        /**
         * <strong>example:</strong>
         * <p>age&gt;10</p>
         */
        @NameInMap("ItemConditionExpression")
        public String itemConditionExpression;

        /**
         * <strong>example:</strong>
         * <p>item_embedding</p>
         */
        @NameInMap("ItemVectorField")
        public String itemVectorField;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ItemVectorRecallManagementTableId")
        public String itemVectorRecallManagementTableId;

        /**
         * <strong>example:</strong>
         * <p>etrec</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Operators")
        public java.util.List<CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperators> operators;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecallManagementTableId")
        public String recallManagementTableId;

        /**
         * <strong>example:</strong>
         * <p>X2I</p>
         */
        @NameInMap("RecallType")
        public String recallType;

        /**
         * <strong>example:</strong>
         * <p>user_embedding</p>
         */
        @NameInMap("UserVectorField")
        public String userVectorField;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("UserVectorRecallManagementTableId")
        public String userVectorRecallManagementTableId;

        public static CreateRecallManagementServiceVersionRequestConfigsRecallConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateRecallManagementServiceVersionRequestConfigsRecallConfigs self = new CreateRecallManagementServiceVersionRequestConfigsRecallConfigs();
            return TeaModel.build(map, self);
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigs setExtendedConfig(String extendedConfig) {
            this.extendedConfig = extendedConfig;
            return this;
        }
        public String getExtendedConfig() {
            return this.extendedConfig;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigs setItemConditionArray(String itemConditionArray) {
            this.itemConditionArray = itemConditionArray;
            return this;
        }
        public String getItemConditionArray() {
            return this.itemConditionArray;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigs setItemConditionExpression(String itemConditionExpression) {
            this.itemConditionExpression = itemConditionExpression;
            return this;
        }
        public String getItemConditionExpression() {
            return this.itemConditionExpression;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigs setItemVectorField(String itemVectorField) {
            this.itemVectorField = itemVectorField;
            return this;
        }
        public String getItemVectorField() {
            return this.itemVectorField;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigs setItemVectorRecallManagementTableId(String itemVectorRecallManagementTableId) {
            this.itemVectorRecallManagementTableId = itemVectorRecallManagementTableId;
            return this;
        }
        public String getItemVectorRecallManagementTableId() {
            return this.itemVectorRecallManagementTableId;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigs setOperators(java.util.List<CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperators> operators) {
            this.operators = operators;
            return this;
        }
        public java.util.List<CreateRecallManagementServiceVersionRequestConfigsRecallConfigsOperators> getOperators() {
            return this.operators;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigs setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigs setRecallManagementTableId(String recallManagementTableId) {
            this.recallManagementTableId = recallManagementTableId;
            return this;
        }
        public String getRecallManagementTableId() {
            return this.recallManagementTableId;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigs setRecallType(String recallType) {
            this.recallType = recallType;
            return this;
        }
        public String getRecallType() {
            return this.recallType;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigs setUserVectorField(String userVectorField) {
            this.userVectorField = userVectorField;
            return this;
        }
        public String getUserVectorField() {
            return this.userVectorField;
        }

        public CreateRecallManagementServiceVersionRequestConfigsRecallConfigs setUserVectorRecallManagementTableId(String userVectorRecallManagementTableId) {
            this.userVectorRecallManagementTableId = userVectorRecallManagementTableId;
            return this;
        }
        public String getUserVectorRecallManagementTableId() {
            return this.userVectorRecallManagementTableId;
        }

    }

    public static class CreateRecallManagementServiceVersionRequestConfigs extends TeaModel {
        @NameInMap("MergeConfig")
        public CreateRecallManagementServiceVersionRequestConfigsMergeConfig mergeConfig;

        @NameInMap("RecallConfigs")
        public java.util.List<CreateRecallManagementServiceVersionRequestConfigsRecallConfigs> recallConfigs;

        public static CreateRecallManagementServiceVersionRequestConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateRecallManagementServiceVersionRequestConfigs self = new CreateRecallManagementServiceVersionRequestConfigs();
            return TeaModel.build(map, self);
        }

        public CreateRecallManagementServiceVersionRequestConfigs setMergeConfig(CreateRecallManagementServiceVersionRequestConfigsMergeConfig mergeConfig) {
            this.mergeConfig = mergeConfig;
            return this;
        }
        public CreateRecallManagementServiceVersionRequestConfigsMergeConfig getMergeConfig() {
            return this.mergeConfig;
        }

        public CreateRecallManagementServiceVersionRequestConfigs setRecallConfigs(java.util.List<CreateRecallManagementServiceVersionRequestConfigsRecallConfigs> recallConfigs) {
            this.recallConfigs = recallConfigs;
            return this;
        }
        public java.util.List<CreateRecallManagementServiceVersionRequestConfigsRecallConfigs> getRecallConfigs() {
            return this.recallConfigs;
        }

    }

}
