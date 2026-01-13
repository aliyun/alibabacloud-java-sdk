// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateRecallManagementServiceVersionConfigRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MergeConfig")
    public UpdateRecallManagementServiceVersionConfigRequestMergeConfig mergeConfig;

    @NameInMap("RecallConfig")
    public UpdateRecallManagementServiceVersionConfigRequestRecallConfig recallConfig;

    public static UpdateRecallManagementServiceVersionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecallManagementServiceVersionConfigRequest self = new UpdateRecallManagementServiceVersionConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecallManagementServiceVersionConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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
        @NameInMap("ExtendedConfig")
        public String extendedConfig;

        @NameInMap("FilterExpression")
        public String filterExpression;

        @NameInMap("FilterRecallManagementTableIds")
        public java.util.List<String> filterRecallManagementTableIds;

        @NameInMap("ItemRecallManagementTableId")
        public String itemRecallManagementTableId;

        @NameInMap("ItemTableFields")
        public java.util.List<String> itemTableFields;

        @NameInMap("MergeType")
        public String mergeType;

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
        @NameInMap("Expression")
        public String expression;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("Field")
        public String field;

        @NameInMap("OutputFields")
        public String outputFields;

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

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig setOutputFields(String outputFields) {
            this.outputFields = outputFields;
            return this;
        }
        public String getOutputFields() {
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
        @NameInMap("Field")
        public String field;

        @NameInMap("FieldQuantityLimit")
        public String fieldQuantityLimit;

        @NameInMap("IsRandSort")
        public String isRandSort;

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

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig setFieldQuantityLimit(String fieldQuantityLimit) {
            this.fieldQuantityLimit = fieldQuantityLimit;
            return this;
        }
        public String getFieldQuantityLimit() {
            return this.fieldQuantityLimit;
        }

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsTriggerConfig setIsRandSort(String isRandSort) {
            this.isRandSort = isRandSort;
            return this;
        }
        public String getIsRandSort() {
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
        @NameInMap("FeatureConfig")
        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFeatureConfig featureConfig;

        @NameInMap("FilterConfig")
        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsFilterConfig filterConfig;

        @NameInMap("JoinConfig")
        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperatorsJoinConfig joinConfig;

        @NameInMap("OperatorsType")
        public String operatorsType;

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

        public UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperators setOperatorsType(String operatorsType) {
            this.operatorsType = operatorsType;
            return this;
        }
        public String getOperatorsType() {
            return this.operatorsType;
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
        @NameInMap("Description")
        public String description;

        @NameInMap("ExtendedConfig")
        public String extendedConfig;

        @NameInMap("ItemVectorField")
        public String itemVectorField;

        @NameInMap("ItemVectorRecallManagementTableId")
        public String itemVectorRecallManagementTableId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Operators")
        public java.util.List<UpdateRecallManagementServiceVersionConfigRequestRecallConfigOperators> operators;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("RecallManagementTableId")
        public String recallManagementTableId;

        @NameInMap("RecallType")
        public String recallType;

        @NameInMap("UserVectorField")
        public String userVectorField;

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
