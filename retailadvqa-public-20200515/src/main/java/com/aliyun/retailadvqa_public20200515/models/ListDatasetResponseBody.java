// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListDatasetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorDesc")
    public String errorDesc;

    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("Data")
    public java.util.List<ListDatasetResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    public static ListDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetResponseBody self = new ListDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatasetResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public ListDatasetResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ListDatasetResponseBody setData(java.util.List<ListDatasetResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDatasetResponseBodyData> getData() {
        return this.data;
    }

    public ListDatasetResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDatasetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDatasetResponseBodyDataExtRFMFrequencyScoreConfig extends TeaModel {
        @NameInMap("Start")
        public Integer start;

        @NameInMap("End")
        public Integer end;

        @NameInMap("Score")
        public Integer score;

        public static ListDatasetResponseBodyDataExtRFMFrequencyScoreConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetResponseBodyDataExtRFMFrequencyScoreConfig self = new ListDatasetResponseBodyDataExtRFMFrequencyScoreConfig();
            return TeaModel.build(map, self);
        }

        public ListDatasetResponseBodyDataExtRFMFrequencyScoreConfig setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

        public ListDatasetResponseBodyDataExtRFMFrequencyScoreConfig setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public ListDatasetResponseBodyDataExtRFMFrequencyScoreConfig setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

    }

    public static class ListDatasetResponseBodyDataExtRFMMonetaryScoreConfig extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("End")
        public String end;

        @NameInMap("Score")
        public String score;

        public static ListDatasetResponseBodyDataExtRFMMonetaryScoreConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetResponseBodyDataExtRFMMonetaryScoreConfig self = new ListDatasetResponseBodyDataExtRFMMonetaryScoreConfig();
            return TeaModel.build(map, self);
        }

        public ListDatasetResponseBodyDataExtRFMMonetaryScoreConfig setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public ListDatasetResponseBodyDataExtRFMMonetaryScoreConfig setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public ListDatasetResponseBodyDataExtRFMMonetaryScoreConfig setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

    }

    public static class ListDatasetResponseBodyDataExtRFMRecencyScoreConfig extends TeaModel {
        @NameInMap("Start")
        public Integer start;

        @NameInMap("End")
        public Integer end;

        @NameInMap("Score")
        public Integer score;

        public static ListDatasetResponseBodyDataExtRFMRecencyScoreConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetResponseBodyDataExtRFMRecencyScoreConfig self = new ListDatasetResponseBodyDataExtRFMRecencyScoreConfig();
            return TeaModel.build(map, self);
        }

        public ListDatasetResponseBodyDataExtRFMRecencyScoreConfig setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

        public ListDatasetResponseBodyDataExtRFMRecencyScoreConfig setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public ListDatasetResponseBodyDataExtRFMRecencyScoreConfig setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

    }

    public static class ListDatasetResponseBodyDataExtRFM extends TeaModel {
        @NameInMap("TradeDateField")
        public String tradeDateField;

        @NameInMap("DataFromType")
        public String dataFromType;

        @NameInMap("TradeFrequencyField")
        public String tradeFrequencyField;

        @NameInMap("TradeMoneyUnit")
        public Integer tradeMoneyUnit;

        @NameInMap("FrequencyScoreCompareValue")
        public String frequencyScoreCompareValue;

        @NameInMap("MonetaryScoreCompareValue")
        public String monetaryScoreCompareValue;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("FrequencyScoreConfig")
        public java.util.List<ListDatasetResponseBodyDataExtRFMFrequencyScoreConfig> frequencyScoreConfig;

        @NameInMap("TradeMoneyField")
        public String tradeMoneyField;

        @NameInMap("MonetaryScoreConfig")
        public java.util.List<ListDatasetResponseBodyDataExtRFMMonetaryScoreConfig> monetaryScoreConfig;

        @NameInMap("RecencyScoreConfig")
        public java.util.List<ListDatasetResponseBodyDataExtRFMRecencyScoreConfig> recencyScoreConfig;

        @NameInMap("ComparisonCalculateType")
        public Integer comparisonCalculateType;

        @NameInMap("RecencyScoreCompareValue")
        public String recencyScoreCompareValue;

        public static ListDatasetResponseBodyDataExtRFM build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetResponseBodyDataExtRFM self = new ListDatasetResponseBodyDataExtRFM();
            return TeaModel.build(map, self);
        }

        public ListDatasetResponseBodyDataExtRFM setTradeDateField(String tradeDateField) {
            this.tradeDateField = tradeDateField;
            return this;
        }
        public String getTradeDateField() {
            return this.tradeDateField;
        }

        public ListDatasetResponseBodyDataExtRFM setDataFromType(String dataFromType) {
            this.dataFromType = dataFromType;
            return this;
        }
        public String getDataFromType() {
            return this.dataFromType;
        }

        public ListDatasetResponseBodyDataExtRFM setTradeFrequencyField(String tradeFrequencyField) {
            this.tradeFrequencyField = tradeFrequencyField;
            return this;
        }
        public String getTradeFrequencyField() {
            return this.tradeFrequencyField;
        }

        public ListDatasetResponseBodyDataExtRFM setTradeMoneyUnit(Integer tradeMoneyUnit) {
            this.tradeMoneyUnit = tradeMoneyUnit;
            return this;
        }
        public Integer getTradeMoneyUnit() {
            return this.tradeMoneyUnit;
        }

        public ListDatasetResponseBodyDataExtRFM setFrequencyScoreCompareValue(String frequencyScoreCompareValue) {
            this.frequencyScoreCompareValue = frequencyScoreCompareValue;
            return this;
        }
        public String getFrequencyScoreCompareValue() {
            return this.frequencyScoreCompareValue;
        }

        public ListDatasetResponseBodyDataExtRFM setMonetaryScoreCompareValue(String monetaryScoreCompareValue) {
            this.monetaryScoreCompareValue = monetaryScoreCompareValue;
            return this;
        }
        public String getMonetaryScoreCompareValue() {
            return this.monetaryScoreCompareValue;
        }

        public ListDatasetResponseBodyDataExtRFM setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public ListDatasetResponseBodyDataExtRFM setFrequencyScoreConfig(java.util.List<ListDatasetResponseBodyDataExtRFMFrequencyScoreConfig> frequencyScoreConfig) {
            this.frequencyScoreConfig = frequencyScoreConfig;
            return this;
        }
        public java.util.List<ListDatasetResponseBodyDataExtRFMFrequencyScoreConfig> getFrequencyScoreConfig() {
            return this.frequencyScoreConfig;
        }

        public ListDatasetResponseBodyDataExtRFM setTradeMoneyField(String tradeMoneyField) {
            this.tradeMoneyField = tradeMoneyField;
            return this;
        }
        public String getTradeMoneyField() {
            return this.tradeMoneyField;
        }

        public ListDatasetResponseBodyDataExtRFM setMonetaryScoreConfig(java.util.List<ListDatasetResponseBodyDataExtRFMMonetaryScoreConfig> monetaryScoreConfig) {
            this.monetaryScoreConfig = monetaryScoreConfig;
            return this;
        }
        public java.util.List<ListDatasetResponseBodyDataExtRFMMonetaryScoreConfig> getMonetaryScoreConfig() {
            return this.monetaryScoreConfig;
        }

        public ListDatasetResponseBodyDataExtRFM setRecencyScoreConfig(java.util.List<ListDatasetResponseBodyDataExtRFMRecencyScoreConfig> recencyScoreConfig) {
            this.recencyScoreConfig = recencyScoreConfig;
            return this;
        }
        public java.util.List<ListDatasetResponseBodyDataExtRFMRecencyScoreConfig> getRecencyScoreConfig() {
            return this.recencyScoreConfig;
        }

        public ListDatasetResponseBodyDataExtRFM setComparisonCalculateType(Integer comparisonCalculateType) {
            this.comparisonCalculateType = comparisonCalculateType;
            return this;
        }
        public Integer getComparisonCalculateType() {
            return this.comparisonCalculateType;
        }

        public ListDatasetResponseBodyDataExtRFM setRecencyScoreCompareValue(String recencyScoreCompareValue) {
            this.recencyScoreCompareValue = recencyScoreCompareValue;
            return this;
        }
        public String getRecencyScoreCompareValue() {
            return this.recencyScoreCompareValue;
        }

    }

    public static class ListDatasetResponseBodyDataExtLabelDatasetLabelList extends TeaModel {
        @NameInMap("ColumnAlias")
        public String columnAlias;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("ColType")
        public String colType;

        @NameInMap("LabelSeparator")
        public String labelSeparator;

        @NameInMap("Remark")
        public String remark;

        public static ListDatasetResponseBodyDataExtLabelDatasetLabelList build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetResponseBodyDataExtLabelDatasetLabelList self = new ListDatasetResponseBodyDataExtLabelDatasetLabelList();
            return TeaModel.build(map, self);
        }

        public ListDatasetResponseBodyDataExtLabelDatasetLabelList setColumnAlias(String columnAlias) {
            this.columnAlias = columnAlias;
            return this;
        }
        public String getColumnAlias() {
            return this.columnAlias;
        }

        public ListDatasetResponseBodyDataExtLabelDatasetLabelList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListDatasetResponseBodyDataExtLabelDatasetLabelList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListDatasetResponseBodyDataExtLabelDatasetLabelList setColType(String colType) {
            this.colType = colType;
            return this;
        }
        public String getColType() {
            return this.colType;
        }

        public ListDatasetResponseBodyDataExtLabelDatasetLabelList setLabelSeparator(String labelSeparator) {
            this.labelSeparator = labelSeparator;
            return this;
        }
        public String getLabelSeparator() {
            return this.labelSeparator;
        }

        public ListDatasetResponseBodyDataExtLabelDatasetLabelList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class ListDatasetResponseBodyDataExtLabel extends TeaModel {
        @NameInMap("DatasetLabelList")
        public java.util.List<ListDatasetResponseBodyDataExtLabelDatasetLabelList> datasetLabelList;

        public static ListDatasetResponseBodyDataExtLabel build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetResponseBodyDataExtLabel self = new ListDatasetResponseBodyDataExtLabel();
            return TeaModel.build(map, self);
        }

        public ListDatasetResponseBodyDataExtLabel setDatasetLabelList(java.util.List<ListDatasetResponseBodyDataExtLabelDatasetLabelList> datasetLabelList) {
            this.datasetLabelList = datasetLabelList;
            return this;
        }
        public java.util.List<ListDatasetResponseBodyDataExtLabelDatasetLabelList> getDatasetLabelList() {
            return this.datasetLabelList;
        }

    }

    public static class ListDatasetResponseBodyDataExtBehavior extends TeaModel {
        @NameInMap("BehaviorObjectTypeField")
        public String behaviorObjectTypeField;

        @NameInMap("BehaviorDateField")
        public String behaviorDateField;

        @NameInMap("TypeField")
        public String typeField;

        @NameInMap("BehaviorChannelField")
        public String behaviorChannelField;

        @NameInMap("BehaviorTypeField")
        public String behaviorTypeField;

        @NameInMap("ChannelDimTableName")
        public String channelDimTableName;

        @NameInMap("BehaviorCountsField")
        public String behaviorCountsField;

        @NameInMap("TypeDimTableName")
        public String typeDimTableName;

        @NameInMap("BehaviorObjectValueField")
        public String behaviorObjectValueField;

        @NameInMap("ChannelField")
        public String channelField;

        @NameInMap("ObjectTypeContext")
        public java.util.Map<String, ?> objectTypeContext;

        @NameInMap("BehaviorAmountsField")
        public String behaviorAmountsField;

        public static ListDatasetResponseBodyDataExtBehavior build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetResponseBodyDataExtBehavior self = new ListDatasetResponseBodyDataExtBehavior();
            return TeaModel.build(map, self);
        }

        public ListDatasetResponseBodyDataExtBehavior setBehaviorObjectTypeField(String behaviorObjectTypeField) {
            this.behaviorObjectTypeField = behaviorObjectTypeField;
            return this;
        }
        public String getBehaviorObjectTypeField() {
            return this.behaviorObjectTypeField;
        }

        public ListDatasetResponseBodyDataExtBehavior setBehaviorDateField(String behaviorDateField) {
            this.behaviorDateField = behaviorDateField;
            return this;
        }
        public String getBehaviorDateField() {
            return this.behaviorDateField;
        }

        public ListDatasetResponseBodyDataExtBehavior setTypeField(String typeField) {
            this.typeField = typeField;
            return this;
        }
        public String getTypeField() {
            return this.typeField;
        }

        public ListDatasetResponseBodyDataExtBehavior setBehaviorChannelField(String behaviorChannelField) {
            this.behaviorChannelField = behaviorChannelField;
            return this;
        }
        public String getBehaviorChannelField() {
            return this.behaviorChannelField;
        }

        public ListDatasetResponseBodyDataExtBehavior setBehaviorTypeField(String behaviorTypeField) {
            this.behaviorTypeField = behaviorTypeField;
            return this;
        }
        public String getBehaviorTypeField() {
            return this.behaviorTypeField;
        }

        public ListDatasetResponseBodyDataExtBehavior setChannelDimTableName(String channelDimTableName) {
            this.channelDimTableName = channelDimTableName;
            return this;
        }
        public String getChannelDimTableName() {
            return this.channelDimTableName;
        }

        public ListDatasetResponseBodyDataExtBehavior setBehaviorCountsField(String behaviorCountsField) {
            this.behaviorCountsField = behaviorCountsField;
            return this;
        }
        public String getBehaviorCountsField() {
            return this.behaviorCountsField;
        }

        public ListDatasetResponseBodyDataExtBehavior setTypeDimTableName(String typeDimTableName) {
            this.typeDimTableName = typeDimTableName;
            return this;
        }
        public String getTypeDimTableName() {
            return this.typeDimTableName;
        }

        public ListDatasetResponseBodyDataExtBehavior setBehaviorObjectValueField(String behaviorObjectValueField) {
            this.behaviorObjectValueField = behaviorObjectValueField;
            return this;
        }
        public String getBehaviorObjectValueField() {
            return this.behaviorObjectValueField;
        }

        public ListDatasetResponseBodyDataExtBehavior setChannelField(String channelField) {
            this.channelField = channelField;
            return this;
        }
        public String getChannelField() {
            return this.channelField;
        }

        public ListDatasetResponseBodyDataExtBehavior setObjectTypeContext(java.util.Map<String, ?> objectTypeContext) {
            this.objectTypeContext = objectTypeContext;
            return this;
        }
        public java.util.Map<String, ?> getObjectTypeContext() {
            return this.objectTypeContext;
        }

        public ListDatasetResponseBodyDataExtBehavior setBehaviorAmountsField(String behaviorAmountsField) {
            this.behaviorAmountsField = behaviorAmountsField;
            return this;
        }
        public String getBehaviorAmountsField() {
            return this.behaviorAmountsField;
        }

    }

    public static class ListDatasetResponseBodyData extends TeaModel {
        @NameInMap("ExtRFM")
        public ListDatasetResponseBodyDataExtRFM extRFM;

        @NameInMap("ExtMappingTypes")
        public java.util.Map<String, ?> extMappingTypes;

        @NameInMap("UniqueFieldName")
        public String uniqueFieldName;

        @NameInMap("ExtLabel")
        public ListDatasetResponseBodyDataExtLabel extLabel;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ExtBehavior")
        public ListDatasetResponseBodyDataExtBehavior extBehavior;

        @NameInMap("UniqueMappingType")
        public String uniqueMappingType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("FactTable")
        public String factTable;

        @NameInMap("Name")
        public String name;

        @NameInMap("DataSetType")
        public Integer dataSetType;

        @NameInMap("Id")
        public String id;

        public static ListDatasetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDatasetResponseBodyData self = new ListDatasetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDatasetResponseBodyData setExtRFM(ListDatasetResponseBodyDataExtRFM extRFM) {
            this.extRFM = extRFM;
            return this;
        }
        public ListDatasetResponseBodyDataExtRFM getExtRFM() {
            return this.extRFM;
        }

        public ListDatasetResponseBodyData setExtMappingTypes(java.util.Map<String, ?> extMappingTypes) {
            this.extMappingTypes = extMappingTypes;
            return this;
        }
        public java.util.Map<String, ?> getExtMappingTypes() {
            return this.extMappingTypes;
        }

        public ListDatasetResponseBodyData setUniqueFieldName(String uniqueFieldName) {
            this.uniqueFieldName = uniqueFieldName;
            return this;
        }
        public String getUniqueFieldName() {
            return this.uniqueFieldName;
        }

        public ListDatasetResponseBodyData setExtLabel(ListDatasetResponseBodyDataExtLabel extLabel) {
            this.extLabel = extLabel;
            return this;
        }
        public ListDatasetResponseBodyDataExtLabel getExtLabel() {
            return this.extLabel;
        }

        public ListDatasetResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDatasetResponseBodyData setExtBehavior(ListDatasetResponseBodyDataExtBehavior extBehavior) {
            this.extBehavior = extBehavior;
            return this;
        }
        public ListDatasetResponseBodyDataExtBehavior getExtBehavior() {
            return this.extBehavior;
        }

        public ListDatasetResponseBodyData setUniqueMappingType(String uniqueMappingType) {
            this.uniqueMappingType = uniqueMappingType;
            return this;
        }
        public String getUniqueMappingType() {
            return this.uniqueMappingType;
        }

        public ListDatasetResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDatasetResponseBodyData setFactTable(String factTable) {
            this.factTable = factTable;
            return this;
        }
        public String getFactTable() {
            return this.factTable;
        }

        public ListDatasetResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDatasetResponseBodyData setDataSetType(Integer dataSetType) {
            this.dataSetType = dataSetType;
            return this;
        }
        public Integer getDataSetType() {
            return this.dataSetType;
        }

        public ListDatasetResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
