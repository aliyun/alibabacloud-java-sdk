// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateRecallManagementServiceVersionConfigRequest extends TeaModel {
    /**
     * <p>The type of the recall management version configuration. Valid values are <code>Recall</code> for the recall configuration and <code>Merge</code> for the merge configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>Recall</p>
     */
    @NameInMap("ConfigType")
    public String configType;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-test123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The merge configuration.</p>
     */
    @NameInMap("MergeConfig")
    public UpdateRecallManagementServiceVersionConfigRequestMergeConfig mergeConfig;

    /**
     * <p>The recall configuration.</p>
     */
    @NameInMap("RecallConfig")
    public UpdateRecallManagementServiceVersionConfigRequestRecallConfig recallConfig;

    public static UpdateRecallManagementServiceVersionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecallManagementServiceVersionConfigRequest self = new UpdateRecallManagementServiceVersionConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecallManagementServiceVersionConfigRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public UpdateRecallManagementServiceVersionConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateRecallManagementServiceVersionConfigRequest setMergeConfig(UpdateRecallManagementServiceVersionConfigRequestMergeConfig mergeConfig) {
        this.mergeConfig = mergeConfig;
        return this;
    }
    public UpdateRecallManagementServiceVersionConfigRequestMergeConfig getMergeConfig() {
        return this.mergeConfig;
    }

    public UpdateRecallManagementServiceVersionConfigRequest setRecallConfig(UpdateRecallManagementServiceVersionConfigRequestRecallConfig recallConfig) {
        this.recallConfig = recallConfig;
        return this;
    }
    public UpdateRecallManagementServiceVersionConfigRequestRecallConfig getRecallConfig() {
        return this.recallConfig;
    }

    public static class UpdateRecallManagementServiceVersionConfigRequestMergeConfig extends TeaModel {
        /**
         * <p>Additional configurations for the merge. Reserved for future use.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;&quot;:&quot;&quot;}</p>
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
         * <p>A list of recall management table IDs to use for filtering.</p>
         */
        @NameInMap("FilterRecallManagementTableIds")
        public java.util.List<String> filterRecallManagementTableIds;

        /**
         * <p>The ID of the item recall management table.</p>
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
         * <p>The merge type. Valid values: <code>Weight</code> and <code>Alternate</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Weight</p>
         */
        @NameInMap("MergeType")
        public String mergeType;

        /**
         * <p>The ID of the recall management service version configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("RecallManagementServiceVersionConfigId")
        public String recallManagementServiceVersionConfigId;

        public static UpdateRecallManagementServiceVersionConfigRequestMergeConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecallManagementServiceVersionConfigRequestMergeConfig self = new UpdateRecallManagementServiceVersionConfigRequestMergeConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRecallManagementServiceVersionConfigRequestMergeConfig setExtendedConfig(String extendedConfig) {
            this.extendedConfig = extendedConfig;
            return this;
        }
        public String getExtendedConfig() {
            return this.extendedConfig;
        }

        public UpdateRecallManagementServiceVersionConfigRequestMergeConfig setFilterExpression(String filterExpression) {
            this.filterExpression = filterExpression;
            return this;
        }
        public String getFilterExpression() {
            return this.filterExpression;
        }

        public UpdateRecallManagementServiceVersionConfigRequestMergeConfig setFilterRecallManagementTableIds(java.util.List<String> filterRecallManagementTableIds) {
            this.filterRecallManagementTableIds = filterRecallManagementTableIds;
            return this;
        }
        public java.util.List<String> getFilterRecallManagementTableIds() {
            return this.filterRecallManagementTableIds;
        }

        public UpdateRecallManagementServiceVersionConfigRequestMergeConfig setItemRecallManagementTableId(String itemRecallManagementTableId) {
            this.itemRecallManagementTableId = itemRecallManagementTableId;
            return this;
        }
        public String getItemRecallManagementTableId() {
            return this.itemRecallManagementTableId;
        }

        public UpdateRecallManagementServiceVersionConfigRequestMergeConfig setItemTableFields(java.util.List<String> itemTableFields) {
            this.itemTableFields = itemTableFields;
            return this;
        }
        public java.util.List<String> getItemTableFields() {
            return this.itemTableFields;
        }

        public UpdateRecallManagementServiceVersionConfigRequestMergeConfig setMergeType(String mergeType) {
            this.mergeType = mergeType;
            return this;
        }
        public String getMergeType() {
            return this.mergeType;
        }

        public UpdateRecallManagementServiceVersionConfigRequestMergeConfig setRecallManagementServiceVersionConfigId(String recallManagementServiceVersionConfigId) {
            this.recallManagementServiceVersionConfigId = recallManagementServiceVersionConfigId;
            return this;
        }
        public String getRecallManagementServiceVersionConfigId() {
            return this.recallManagementServiceVersionConfigId;
        }

    }

    public static class UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig extends TeaModel {
        /**
         * <p>The feature expression.</p>
         * 
         * <strong>example:</strong>
         * <p>category=3</p>
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
         * <p>string</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig self = new UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFilterConfig extends TeaModel {
        /**
         * <p>The filter expression.</p>
         * 
         * <strong>example:</strong>
         * <p>age&gt;20</p>
         */
        @NameInMap("Experession")
        public String experession;

        public static UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFilterConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFilterConfig self = new UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFilterConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFilterConfig setExperession(String experession) {
            this.experession = experession;
            return this;
        }
        public String getExperession() {
            return this.experession;
        }

    }

    public static class UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig extends TeaModel {
        /**
         * <p>The join field.</p>
         * 
         * <strong>example:</strong>
         * <p>item_id</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <p>The fields to return from the join.</p>
         */
        @NameInMap("OutputFields")
        public java.util.List<String> outputFields;

        /**
         * <p>The ID of the table to join.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RecallManagementTableId")
        public String recallManagementTableId;

        public static UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig self = new UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig setOutputFields(java.util.List<String> outputFields) {
            this.outputFields = outputFields;
            return this;
        }
        public java.util.List<String> getOutputFields() {
            return this.outputFields;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig setRecallManagementTableId(String recallManagementTableId) {
            this.recallManagementTableId = recallManagementTableId;
            return this;
        }
        public String getRecallManagementTableId() {
            return this.recallManagementTableId;
        }

    }

    public static class UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig extends TeaModel {
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
         * <p>Specifies whether to perform a random sort.</p>
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

        public static UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig self = new UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig setFieldQuantityLimit(Integer fieldQuantityLimit) {
            this.fieldQuantityLimit = fieldQuantityLimit;
            return this;
        }
        public Integer getFieldQuantityLimit() {
            return this.fieldQuantityLimit;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig setIsRandSort(Boolean isRandSort) {
            this.isRandSort = isRandSort;
            return this;
        }
        public Boolean getIsRandSort() {
            return this.isRandSort;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig setSortField(String sortField) {
            this.sortField = sortField;
            return this;
        }
        public String getSortField() {
            return this.sortField;
        }

    }

    public static class UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperators extends TeaModel {
        /**
         * <p>The configuration for the <code>Feature</code> operator.</p>
         */
        @NameInMap("FeatureConfig")
        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig featureConfig;

        /**
         * <p>The configuration for the <code>Filter</code> operator.</p>
         */
        @NameInMap("FilterConfig")
        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFilterConfig filterConfig;

        /**
         * <p>The configuration for the <code>Join</code> operator.</p>
         */
        @NameInMap("JoinConfig")
        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig joinConfig;

        /**
         * <p>The operator type.</p>
         * 
         * <strong>example:</strong>
         * <p>Filter</p>
         */
        @NameInMap("OperatorType")
        public String operatorType;

        /**
         * <p>The configuration for the <code>Trigger</code> operator.</p>
         */
        @NameInMap("TriggerConfig")
        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig triggerConfig;

        public static UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperators build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperators self = new UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperators();
            return TeaModel.build(map, self);
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperators setFeatureConfig(UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig featureConfig) {
            this.featureConfig = featureConfig;
            return this;
        }
        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig getFeatureConfig() {
            return this.featureConfig;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperators setFilterConfig(UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFilterConfig filterConfig) {
            this.filterConfig = filterConfig;
            return this;
        }
        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFilterConfig getFilterConfig() {
            return this.filterConfig;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperators setJoinConfig(UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig joinConfig) {
            this.joinConfig = joinConfig;
            return this;
        }
        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig getJoinConfig() {
            return this.joinConfig;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperators setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperators setTriggerConfig(UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }
        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig getTriggerConfig() {
            return this.triggerConfig;
        }

    }

    public static class UpdateRecallManagementServiceVersionConfigRequestRecallConfig extends TeaModel {
        /**
         * <p>The recall description.</p>
         * 
         * <strong>example:</strong>
         * <p>this is etrec recall</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The extended configuration. Reserved for future use.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;&quot;:&quot;&quot;}</p>
         */
        @NameInMap("ExtendedConfig")
        public String extendedConfig;

        /**
         * <p>The data format of the item condition.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;type&quot;:&quot;equal&quot;]</p>
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
         * <p>The ID of the item vector recall management table.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>A list of operators.</p>
         */
        @NameInMap("Operators")
        public java.util.List<UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperators> operators;

        /**
         * <p>The priority. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <p>The ID of the recall management table.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The ID of the user vector recall management table.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("UserVectorRecallManagementTableId")
        public String userVectorRecallManagementTableId;

        public static UpdateRecallManagementServiceVersionConfigRequestRecallConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecallManagementServiceVersionConfigRequestRecallConfig self = new UpdateRecallManagementServiceVersionConfigRequestRecallConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfig setExtendedConfig(String extendedConfig) {
            this.extendedConfig = extendedConfig;
            return this;
        }
        public String getExtendedConfig() {
            return this.extendedConfig;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfig setItemConditionArray(String itemConditionArray) {
            this.itemConditionArray = itemConditionArray;
            return this;
        }
        public String getItemConditionArray() {
            return this.itemConditionArray;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfig setItemConditionExpression(String itemConditionExpression) {
            this.itemConditionExpression = itemConditionExpression;
            return this;
        }
        public String getItemConditionExpression() {
            return this.itemConditionExpression;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfig setItemVectorField(String itemVectorField) {
            this.itemVectorField = itemVectorField;
            return this;
        }
        public String getItemVectorField() {
            return this.itemVectorField;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfig setItemVectorRecallManagementTableId(String itemVectorRecallManagementTableId) {
            this.itemVectorRecallManagementTableId = itemVectorRecallManagementTableId;
            return this;
        }
        public String getItemVectorRecallManagementTableId() {
            return this.itemVectorRecallManagementTableId;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfig setOperators(java.util.List<UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperators> operators) {
            this.operators = operators;
            return this;
        }
        public java.util.List<UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperators> getOperators() {
            return this.operators;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfig setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfig setRecallManagementTableId(String recallManagementTableId) {
            this.recallManagementTableId = recallManagementTableId;
            return this;
        }
        public String getRecallManagementTableId() {
            return this.recallManagementTableId;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfig setRecallType(String recallType) {
            this.recallType = recallType;
            return this;
        }
        public String getRecallType() {
            return this.recallType;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfig setSortFields(String sortFields) {
            this.sortFields = sortFields;
            return this;
        }
        public String getSortFields() {
            return this.sortFields;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfig setUserVectorField(String userVectorField) {
            this.userVectorField = userVectorField;
            return this;
        }
        public String getUserVectorField() {
            return this.userVectorField;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfig setUserVectorRecallManagementTableId(String userVectorRecallManagementTableId) {
            this.userVectorRecallManagementTableId = userVectorRecallManagementTableId;
            return this;
        }
        public String getUserVectorRecallManagementTableId() {
            return this.userVectorRecallManagementTableId;
        }

    }

}
