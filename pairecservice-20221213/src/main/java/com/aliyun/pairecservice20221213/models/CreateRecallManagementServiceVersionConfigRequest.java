// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateRecallManagementServiceVersionConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Recall</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <strong>example:</strong>
     * <p>pai-teest-1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MergeConfig")
    public CreateRecallManagementServiceVersionConfigRequestMergeConfig mergeConfig;

    @NameInMap("RecallConfig")
    public CreateRecallManagementServiceVersionConfigRequestRecallConfig recallConfig;

    public static CreateRecallManagementServiceVersionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecallManagementServiceVersionConfigRequest self = new CreateRecallManagementServiceVersionConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecallManagementServiceVersionConfigRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public CreateRecallManagementServiceVersionConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRecallManagementServiceVersionConfigRequest setMergeConfig(CreateRecallManagementServiceVersionConfigRequestMergeConfig mergeConfig) {
        this.mergeConfig = mergeConfig;
        return this;
    }
    public CreateRecallManagementServiceVersionConfigRequestMergeConfig getMergeConfig() {
        return this.mergeConfig;
    }

    public CreateRecallManagementServiceVersionConfigRequest setRecallConfig(CreateRecallManagementServiceVersionConfigRequestRecallConfig recallConfig) {
        this.recallConfig = recallConfig;
        return this;
    }
    public CreateRecallManagementServiceVersionConfigRequestRecallConfig getRecallConfig() {
        return this.recallConfig;
    }

    public static class CreateRecallManagementServiceVersionConfigRequestMergeConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ExtendedConfig")
        public String extendedConfig;

        /**
         * <strong>example:</strong>
         * <p>age&gt;20</p>
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

        public static CreateRecallManagementServiceVersionConfigRequestMergeConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRecallManagementServiceVersionConfigRequestMergeConfig self = new CreateRecallManagementServiceVersionConfigRequestMergeConfig();
            return TeaModel.build(map, self);
        }

        public CreateRecallManagementServiceVersionConfigRequestMergeConfig setExtendedConfig(String extendedConfig) {
            this.extendedConfig = extendedConfig;
            return this;
        }
        public String getExtendedConfig() {
            return this.extendedConfig;
        }

        public CreateRecallManagementServiceVersionConfigRequestMergeConfig setFilterExpression(String filterExpression) {
            this.filterExpression = filterExpression;
            return this;
        }
        public String getFilterExpression() {
            return this.filterExpression;
        }

        public CreateRecallManagementServiceVersionConfigRequestMergeConfig setFilterRecallManagementTableIds(java.util.List<String> filterRecallManagementTableIds) {
            this.filterRecallManagementTableIds = filterRecallManagementTableIds;
            return this;
        }
        public java.util.List<String> getFilterRecallManagementTableIds() {
            return this.filterRecallManagementTableIds;
        }

        public CreateRecallManagementServiceVersionConfigRequestMergeConfig setItemRecallManagementTableId(String itemRecallManagementTableId) {
            this.itemRecallManagementTableId = itemRecallManagementTableId;
            return this;
        }
        public String getItemRecallManagementTableId() {
            return this.itemRecallManagementTableId;
        }

        public CreateRecallManagementServiceVersionConfigRequestMergeConfig setItemTableFields(java.util.List<String> itemTableFields) {
            this.itemTableFields = itemTableFields;
            return this;
        }
        public java.util.List<String> getItemTableFields() {
            return this.itemTableFields;
        }

        public CreateRecallManagementServiceVersionConfigRequestMergeConfig setMergeType(String mergeType) {
            this.mergeType = mergeType;
            return this;
        }
        public String getMergeType() {
            return this.mergeType;
        }

        public CreateRecallManagementServiceVersionConfigRequestMergeConfig setRecallManagementServiceVersionConfigId(String recallManagementServiceVersionConfigId) {
            this.recallManagementServiceVersionConfigId = recallManagementServiceVersionConfigId;
            return this;
        }
        public String getRecallManagementServiceVersionConfigId() {
            return this.recallManagementServiceVersionConfigId;
        }

    }

    public static class CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig extends TeaModel {
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

        public static CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig self = new CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig();
            return TeaModel.build(map, self);
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFilterConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>age&gt;20</p>
         */
        @NameInMap("Experession")
        public String experession;

        public static CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFilterConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFilterConfig self = new CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFilterConfig();
            return TeaModel.build(map, self);
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFilterConfig setExperession(String experession) {
            this.experession = experession;
            return this;
        }
        public String getExperession() {
            return this.experession;
        }

    }

    public static class CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>item_id</p>
         */
        @NameInMap("Field")
        public String field;

        @NameInMap("OutputFields")
        public java.util.List<String> outputFields;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RecallManagementTableId")
        public String recallManagementTableId;

        public static CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig self = new CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig();
            return TeaModel.build(map, self);
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig setOutputFields(java.util.List<String> outputFields) {
            this.outputFields = outputFields;
            return this;
        }
        public java.util.List<String> getOutputFields() {
            return this.outputFields;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig setRecallManagementTableId(String recallManagementTableId) {
            this.recallManagementTableId = recallManagementTableId;
            return this;
        }
        public String getRecallManagementTableId() {
            return this.recallManagementTableId;
        }

    }

    public static class CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig extends TeaModel {
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

        public static CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig self = new CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig();
            return TeaModel.build(map, self);
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig setFieldQuantityLimit(String fieldQuantityLimit) {
            this.fieldQuantityLimit = fieldQuantityLimit;
            return this;
        }
        public String getFieldQuantityLimit() {
            return this.fieldQuantityLimit;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig setIsRandSort(String isRandSort) {
            this.isRandSort = isRandSort;
            return this;
        }
        public String getIsRandSort() {
            return this.isRandSort;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig setSortField(String sortField) {
            this.sortField = sortField;
            return this;
        }
        public String getSortField() {
            return this.sortField;
        }

    }

    public static class CreateRecallManagementServiceVersionConfigRequestRecallConfigOperators extends TeaModel {
        @NameInMap("FeatureConfig")
        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig featureConfig;

        @NameInMap("FilterConfig")
        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFilterConfig filterConfig;

        @NameInMap("JoinConfig")
        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig joinConfig;

        /**
         * <strong>example:</strong>
         * <p>Filter</p>
         */
        @NameInMap("OperatorType")
        public String operatorType;

        @NameInMap("TriggerConfig")
        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig triggerConfig;

        public static CreateRecallManagementServiceVersionConfigRequestRecallConfigOperators build(java.util.Map<String, ?> map) throws Exception {
            CreateRecallManagementServiceVersionConfigRequestRecallConfigOperators self = new CreateRecallManagementServiceVersionConfigRequestRecallConfigOperators();
            return TeaModel.build(map, self);
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperators setFeatureConfig(CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig featureConfig) {
            this.featureConfig = featureConfig;
            return this;
        }
        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig getFeatureConfig() {
            return this.featureConfig;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperators setFilterConfig(CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFilterConfig filterConfig) {
            this.filterConfig = filterConfig;
            return this;
        }
        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFilterConfig getFilterConfig() {
            return this.filterConfig;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperators setJoinConfig(CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig joinConfig) {
            this.joinConfig = joinConfig;
            return this;
        }
        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig getJoinConfig() {
            return this.joinConfig;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperators setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperators setTriggerConfig(CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }
        public CreateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig getTriggerConfig() {
            return this.triggerConfig;
        }

    }

    public static class CreateRecallManagementServiceVersionConfigRequestRecallConfig extends TeaModel {
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
         * <p>age&gt;20</p>
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
         * <p>5</p>
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
        public java.util.List<CreateRecallManagementServiceVersionConfigRequestRecallConfigOperators> operators;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>4</p>
         */
        @NameInMap("UserVectorRecallManagementTableId")
        public String userVectorRecallManagementTableId;

        public static CreateRecallManagementServiceVersionConfigRequestRecallConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRecallManagementServiceVersionConfigRequestRecallConfig self = new CreateRecallManagementServiceVersionConfigRequestRecallConfig();
            return TeaModel.build(map, self);
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfig setExtendedConfig(String extendedConfig) {
            this.extendedConfig = extendedConfig;
            return this;
        }
        public String getExtendedConfig() {
            return this.extendedConfig;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfig setItemConditionArray(String itemConditionArray) {
            this.itemConditionArray = itemConditionArray;
            return this;
        }
        public String getItemConditionArray() {
            return this.itemConditionArray;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfig setItemConditionExpression(String itemConditionExpression) {
            this.itemConditionExpression = itemConditionExpression;
            return this;
        }
        public String getItemConditionExpression() {
            return this.itemConditionExpression;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfig setItemVectorField(String itemVectorField) {
            this.itemVectorField = itemVectorField;
            return this;
        }
        public String getItemVectorField() {
            return this.itemVectorField;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfig setItemVectorRecallManagementTableId(String itemVectorRecallManagementTableId) {
            this.itemVectorRecallManagementTableId = itemVectorRecallManagementTableId;
            return this;
        }
        public String getItemVectorRecallManagementTableId() {
            return this.itemVectorRecallManagementTableId;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfig setOperators(java.util.List<CreateRecallManagementServiceVersionConfigRequestRecallConfigOperators> operators) {
            this.operators = operators;
            return this;
        }
        public java.util.List<CreateRecallManagementServiceVersionConfigRequestRecallConfigOperators> getOperators() {
            return this.operators;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfig setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfig setRecallManagementTableId(String recallManagementTableId) {
            this.recallManagementTableId = recallManagementTableId;
            return this;
        }
        public String getRecallManagementTableId() {
            return this.recallManagementTableId;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfig setRecallType(String recallType) {
            this.recallType = recallType;
            return this;
        }
        public String getRecallType() {
            return this.recallType;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfig setUserVectorField(String userVectorField) {
            this.userVectorField = userVectorField;
            return this;
        }
        public String getUserVectorField() {
            return this.userVectorField;
        }

        public CreateRecallManagementServiceVersionConfigRequestRecallConfig setUserVectorRecallManagementTableId(String userVectorRecallManagementTableId) {
            this.userVectorRecallManagementTableId = userVectorRecallManagementTableId;
            return this;
        }
        public String getUserVectorRecallManagementTableId() {
            return this.userVectorRecallManagementTableId;
        }

    }

}
