// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetRecallManagementServiceVersionConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Recall</p>
     */
    @NameInMap("ConfigType")
    public String configType;

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

    @NameInMap("MergeConfig")
    public GetRecallManagementServiceVersionConfigResponseBodyMergeConfig mergeConfig;

    @NameInMap("RecallConfig")
    public GetRecallManagementServiceVersionConfigResponseBodyRecallConfig recallConfig;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RecallManagementServiceId")
    public String recallManagementServiceId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RecallManagementServiceVersionConfigId")
    public String recallManagementServiceVersionConfigId;

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
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRecallManagementServiceVersionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecallManagementServiceVersionConfigResponseBody self = new GetRecallManagementServiceVersionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecallManagementServiceVersionConfigResponseBody setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public GetRecallManagementServiceVersionConfigResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetRecallManagementServiceVersionConfigResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetRecallManagementServiceVersionConfigResponseBody setMergeConfig(GetRecallManagementServiceVersionConfigResponseBodyMergeConfig mergeConfig) {
        this.mergeConfig = mergeConfig;
        return this;
    }
    public GetRecallManagementServiceVersionConfigResponseBodyMergeConfig getMergeConfig() {
        return this.mergeConfig;
    }

    public GetRecallManagementServiceVersionConfigResponseBody setRecallConfig(GetRecallManagementServiceVersionConfigResponseBodyRecallConfig recallConfig) {
        this.recallConfig = recallConfig;
        return this;
    }
    public GetRecallManagementServiceVersionConfigResponseBodyRecallConfig getRecallConfig() {
        return this.recallConfig;
    }

    public GetRecallManagementServiceVersionConfigResponseBody setRecallManagementServiceId(String recallManagementServiceId) {
        this.recallManagementServiceId = recallManagementServiceId;
        return this;
    }
    public String getRecallManagementServiceId() {
        return this.recallManagementServiceId;
    }

    public GetRecallManagementServiceVersionConfigResponseBody setRecallManagementServiceVersionConfigId(String recallManagementServiceVersionConfigId) {
        this.recallManagementServiceVersionConfigId = recallManagementServiceVersionConfigId;
        return this;
    }
    public String getRecallManagementServiceVersionConfigId() {
        return this.recallManagementServiceVersionConfigId;
    }

    public GetRecallManagementServiceVersionConfigResponseBody setRecallManagementServiceVersionId(String recallManagementServiceVersionId) {
        this.recallManagementServiceVersionId = recallManagementServiceVersionId;
        return this;
    }
    public String getRecallManagementServiceVersionId() {
        return this.recallManagementServiceVersionId;
    }

    public GetRecallManagementServiceVersionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRecallManagementServiceVersionConfigResponseBodyMergeConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;&quot;:&quot;&quot;}</p>
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

        public static GetRecallManagementServiceVersionConfigResponseBodyMergeConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementServiceVersionConfigResponseBodyMergeConfig self = new GetRecallManagementServiceVersionConfigResponseBodyMergeConfig();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementServiceVersionConfigResponseBodyMergeConfig setExtendedConfig(String extendedConfig) {
            this.extendedConfig = extendedConfig;
            return this;
        }
        public String getExtendedConfig() {
            return this.extendedConfig;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyMergeConfig setFilterExpression(String filterExpression) {
            this.filterExpression = filterExpression;
            return this;
        }
        public String getFilterExpression() {
            return this.filterExpression;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyMergeConfig setFilterRecallManagementTableIds(java.util.List<String> filterRecallManagementTableIds) {
            this.filterRecallManagementTableIds = filterRecallManagementTableIds;
            return this;
        }
        public java.util.List<String> getFilterRecallManagementTableIds() {
            return this.filterRecallManagementTableIds;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyMergeConfig setItemRecallManagementTableId(String itemRecallManagementTableId) {
            this.itemRecallManagementTableId = itemRecallManagementTableId;
            return this;
        }
        public String getItemRecallManagementTableId() {
            return this.itemRecallManagementTableId;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyMergeConfig setItemTableFields(java.util.List<String> itemTableFields) {
            this.itemTableFields = itemTableFields;
            return this;
        }
        public java.util.List<String> getItemTableFields() {
            return this.itemTableFields;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyMergeConfig setMergeType(String mergeType) {
            this.mergeType = mergeType;
            return this;
        }
        public String getMergeType() {
            return this.mergeType;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyMergeConfig setRecallManagementServiceVersionConfigId(String recallManagementServiceVersionConfigId) {
            this.recallManagementServiceVersionConfigId = recallManagementServiceVersionConfigId;
            return this;
        }
        public String getRecallManagementServiceVersionConfigId() {
            return this.recallManagementServiceVersionConfigId;
        }

    }

    public static class GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFeatureConfig extends TeaModel {
        @NameInMap("Expression")
        public String expression;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFeatureConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFeatureConfig self = new GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFeatureConfig();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFeatureConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFeatureConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFeatureConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFilterConfig extends TeaModel {
        @NameInMap("Expression")
        public String expression;

        public static GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFilterConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFilterConfig self = new GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFilterConfig();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFilterConfig setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

    }

    public static class GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsJoinConfig extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("OutputFields")
        public java.util.List<String> outputFields;

        @NameInMap("RecallManagementTableId")
        public String recallManagementTableId;

        public static GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsJoinConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsJoinConfig self = new GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsJoinConfig();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsJoinConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsJoinConfig setOutputFields(java.util.List<String> outputFields) {
            this.outputFields = outputFields;
            return this;
        }
        public java.util.List<String> getOutputFields() {
            return this.outputFields;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsJoinConfig setRecallManagementTableId(String recallManagementTableId) {
            this.recallManagementTableId = recallManagementTableId;
            return this;
        }
        public String getRecallManagementTableId() {
            return this.recallManagementTableId;
        }

    }

    public static class GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsTriggerConfig extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("FieldQuantityLimit")
        public Integer fieldQuantityLimit;

        @NameInMap("IsRandSort")
        public Boolean isRandSort;

        @NameInMap("SortField")
        public String sortField;

        public static GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsTriggerConfig self = new GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsTriggerConfig();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsTriggerConfig setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsTriggerConfig setFieldQuantityLimit(Integer fieldQuantityLimit) {
            this.fieldQuantityLimit = fieldQuantityLimit;
            return this;
        }
        public Integer getFieldQuantityLimit() {
            return this.fieldQuantityLimit;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsTriggerConfig setIsRandSort(Boolean isRandSort) {
            this.isRandSort = isRandSort;
            return this;
        }
        public Boolean getIsRandSort() {
            return this.isRandSort;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsTriggerConfig setSortField(String sortField) {
            this.sortField = sortField;
            return this;
        }
        public String getSortField() {
            return this.sortField;
        }

    }

    public static class GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperators extends TeaModel {
        @NameInMap("FeatureConfig")
        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFeatureConfig featureConfig;

        @NameInMap("FilterConfig")
        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFilterConfig filterConfig;

        @NameInMap("JoinConfig")
        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsJoinConfig joinConfig;

        @NameInMap("OperatorType")
        public String operatorType;

        @NameInMap("TriggerConfig")
        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsTriggerConfig triggerConfig;

        public static GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperators build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperators self = new GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperators();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperators setFeatureConfig(GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFeatureConfig featureConfig) {
            this.featureConfig = featureConfig;
            return this;
        }
        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFeatureConfig getFeatureConfig() {
            return this.featureConfig;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperators setFilterConfig(GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFilterConfig filterConfig) {
            this.filterConfig = filterConfig;
            return this;
        }
        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsFilterConfig getFilterConfig() {
            return this.filterConfig;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperators setJoinConfig(GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsJoinConfig joinConfig) {
            this.joinConfig = joinConfig;
            return this;
        }
        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsJoinConfig getJoinConfig() {
            return this.joinConfig;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperators setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperators setTriggerConfig(GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsTriggerConfig triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }
        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperatorsTriggerConfig getTriggerConfig() {
            return this.triggerConfig;
        }

    }

    public static class GetRecallManagementServiceVersionConfigResponseBodyRecallConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>this is etrec recall</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>{&quot;&quot;:&quot;&quot;}</p>
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
         * <p>item_embedding</p>
         */
        @NameInMap("ItemVectorField")
        public String itemVectorField;

        /**
         * <strong>example:</strong>
         * <p>2</p>
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
        public java.util.List<GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperators> operators;

        /**
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>2</p>
         */
        @NameInMap("UserVectorRecallManagementTableId")
        public String userVectorRecallManagementTableId;

        public static GetRecallManagementServiceVersionConfigResponseBodyRecallConfig build(java.util.Map<String, ?> map) throws Exception {
            GetRecallManagementServiceVersionConfigResponseBodyRecallConfig self = new GetRecallManagementServiceVersionConfigResponseBodyRecallConfig();
            return TeaModel.build(map, self);
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfig setExtendedConfig(String extendedConfig) {
            this.extendedConfig = extendedConfig;
            return this;
        }
        public String getExtendedConfig() {
            return this.extendedConfig;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfig setItemConditionArray(String itemConditionArray) {
            this.itemConditionArray = itemConditionArray;
            return this;
        }
        public String getItemConditionArray() {
            return this.itemConditionArray;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfig setItemVectorField(String itemVectorField) {
            this.itemVectorField = itemVectorField;
            return this;
        }
        public String getItemVectorField() {
            return this.itemVectorField;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfig setItemVectorRecallManagementTableId(String itemVectorRecallManagementTableId) {
            this.itemVectorRecallManagementTableId = itemVectorRecallManagementTableId;
            return this;
        }
        public String getItemVectorRecallManagementTableId() {
            return this.itemVectorRecallManagementTableId;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfig setOperators(java.util.List<GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperators> operators) {
            this.operators = operators;
            return this;
        }
        public java.util.List<GetRecallManagementServiceVersionConfigResponseBodyRecallConfigOperators> getOperators() {
            return this.operators;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfig setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfig setRecallManagementTableId(String recallManagementTableId) {
            this.recallManagementTableId = recallManagementTableId;
            return this;
        }
        public String getRecallManagementTableId() {
            return this.recallManagementTableId;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfig setRecallType(String recallType) {
            this.recallType = recallType;
            return this;
        }
        public String getRecallType() {
            return this.recallType;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfig setUserVectorField(String userVectorField) {
            this.userVectorField = userVectorField;
            return this;
        }
        public String getUserVectorField() {
            return this.userVectorField;
        }

        public GetRecallManagementServiceVersionConfigResponseBodyRecallConfig setUserVectorRecallManagementTableId(String userVectorRecallManagementTableId) {
            this.userVectorRecallManagementTableId = userVectorRecallManagementTableId;
            return this;
        }
        public String getUserVectorRecallManagementTableId() {
            return this.userVectorRecallManagementTableId;
        }

    }

}
