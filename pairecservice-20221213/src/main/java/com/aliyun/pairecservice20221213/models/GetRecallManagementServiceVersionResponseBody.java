// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetRecallManagementServiceVersionResponseBody extends TeaModel {
    @NameInMap("Configs")
    public GetRecallManagementServiceVersionResponseBodyConfigs configs;

    /**
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2021-12-15T23:24:33.132+08:00</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDefault")
    public String isDefault;

    @NameInMap("IsEffective")
    public Boolean isEffective;

    /**
     * <strong>example:</strong>
     * <p>V1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RecallManagementServiceVersionId")
    public String recallManagementServiceVersionId;

    /**
     * <p>Id of the request</p>
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

    public GetRecallManagementServiceVersionResponseBody setIsDefault(String isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public String getIsDefault() {
        return this.isDefault;
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
         * <strong>example:</strong>
         * <p>city = \&quot;hangzhou\&quot;</p>
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

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsTriggerConfig setFieldQuantityLimit(String fieldQuantityLimit) {
            this.fieldQuantityLimit = fieldQuantityLimit;
            return this;
        }
        public String getFieldQuantityLimit() {
            return this.fieldQuantityLimit;
        }

        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsTriggerConfig setIsRandSort(String isRandSort) {
            this.isRandSort = isRandSort;
            return this;
        }
        public String getIsRandSort() {
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
        @NameInMap("FeatureConfig")
        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFeatureConfig featureConfig;

        @NameInMap("FilterConfig")
        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsFilterConfig filterConfig;

        @NameInMap("JoinConfig")
        public GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperatorsJoinConfig joinConfig;

        /**
         * <strong>example:</strong>
         * <p>Filter</p>
         */
        @NameInMap("OperatorType")
        public String operatorType;

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
        public java.util.List<GetRecallManagementServiceVersionResponseBodyConfigsRecallConfigsOperators> operators;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RecallManagementServiceVersionConfigId")
        public String recallManagementServiceVersionConfigId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
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
        @NameInMap("MergeConfig")
        public GetRecallManagementServiceVersionResponseBodyConfigsMergeConfig mergeConfig;

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
