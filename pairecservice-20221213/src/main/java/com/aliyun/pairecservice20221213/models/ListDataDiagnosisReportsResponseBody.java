// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListDataDiagnosisReportsResponseBody extends TeaModel {
    @NameInMap("ExceptionRate")
    public java.util.List<ListDataDiagnosisReportsResponseBodyExceptionRate> exceptionRate;

    @NameInMap("ReportsOfAbnormalBehavior")
    public java.util.List<java.util.List<ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior>> reportsOfAbnormalBehavior;

    @NameInMap("ReportsOfBaseStatistics")
    public java.util.List<java.util.List<ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics>> reportsOfBaseStatistics;

    @NameInMap("ReportsOfChangeRateData")
    public java.util.List<java.util.List<ListDataDiagnosisReportsResponseBodyReportsOfChangeRateData>> reportsOfChangeRateData;

    @NameInMap("ReportsOfJoinTables")
    public java.util.List<java.util.List<ListDataDiagnosisReportsResponseBodyReportsOfJoinTables>> reportsOfJoinTables;

    @NameInMap("ReportsOfPreferenceStatisticsCycle")
    public java.util.List<java.util.List<ListDataDiagnosisReportsResponseBodyReportsOfPreferenceStatisticsCycle>> reportsOfPreferenceStatisticsCycle;

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ChangeRate</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListDataDiagnosisReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataDiagnosisReportsResponseBody self = new ListDataDiagnosisReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataDiagnosisReportsResponseBody setExceptionRate(java.util.List<ListDataDiagnosisReportsResponseBodyExceptionRate> exceptionRate) {
        this.exceptionRate = exceptionRate;
        return this;
    }
    public java.util.List<ListDataDiagnosisReportsResponseBodyExceptionRate> getExceptionRate() {
        return this.exceptionRate;
    }

    public ListDataDiagnosisReportsResponseBody setReportsOfAbnormalBehavior(java.util.List<java.util.List<ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior>> reportsOfAbnormalBehavior) {
        this.reportsOfAbnormalBehavior = reportsOfAbnormalBehavior;
        return this;
    }
    public java.util.List<java.util.List<ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior>> getReportsOfAbnormalBehavior() {
        return this.reportsOfAbnormalBehavior;
    }

    public ListDataDiagnosisReportsResponseBody setReportsOfBaseStatistics(java.util.List<java.util.List<ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics>> reportsOfBaseStatistics) {
        this.reportsOfBaseStatistics = reportsOfBaseStatistics;
        return this;
    }
    public java.util.List<java.util.List<ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics>> getReportsOfBaseStatistics() {
        return this.reportsOfBaseStatistics;
    }

    public ListDataDiagnosisReportsResponseBody setReportsOfChangeRateData(java.util.List<java.util.List<ListDataDiagnosisReportsResponseBodyReportsOfChangeRateData>> reportsOfChangeRateData) {
        this.reportsOfChangeRateData = reportsOfChangeRateData;
        return this;
    }
    public java.util.List<java.util.List<ListDataDiagnosisReportsResponseBodyReportsOfChangeRateData>> getReportsOfChangeRateData() {
        return this.reportsOfChangeRateData;
    }

    public ListDataDiagnosisReportsResponseBody setReportsOfJoinTables(java.util.List<java.util.List<ListDataDiagnosisReportsResponseBodyReportsOfJoinTables>> reportsOfJoinTables) {
        this.reportsOfJoinTables = reportsOfJoinTables;
        return this;
    }
    public java.util.List<java.util.List<ListDataDiagnosisReportsResponseBodyReportsOfJoinTables>> getReportsOfJoinTables() {
        return this.reportsOfJoinTables;
    }

    public ListDataDiagnosisReportsResponseBody setReportsOfPreferenceStatisticsCycle(java.util.List<java.util.List<ListDataDiagnosisReportsResponseBodyReportsOfPreferenceStatisticsCycle>> reportsOfPreferenceStatisticsCycle) {
        this.reportsOfPreferenceStatisticsCycle = reportsOfPreferenceStatisticsCycle;
        return this;
    }
    public java.util.List<java.util.List<ListDataDiagnosisReportsResponseBodyReportsOfPreferenceStatisticsCycle>> getReportsOfPreferenceStatisticsCycle() {
        return this.reportsOfPreferenceStatisticsCycle;
    }

    public ListDataDiagnosisReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataDiagnosisReportsResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListDataDiagnosisReportsResponseBodyExceptionRate extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Group")
        public String group;

        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>WARN</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataDiagnosisReportsResponseBodyExceptionRate build(java.util.Map<String, ?> map) throws Exception {
            ListDataDiagnosisReportsResponseBodyExceptionRate self = new ListDataDiagnosisReportsResponseBodyExceptionRate();
            return TeaModel.build(map, self);
        }

        public ListDataDiagnosisReportsResponseBodyExceptionRate setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListDataDiagnosisReportsResponseBodyExceptionRate setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListDataDiagnosisReportsResponseBodyExceptionRate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20250114</p>
         */
        @NameInMap("Ds")
        public String ds;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RankId")
        public String rankId;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("ConversionRate")
        public String conversionRate;

        /**
         * <strong>example:</strong>
         * <p>100010050+259203779</p>
         */
        @NameInMap("ConversionRateIds")
        public String conversionRateIds;

        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("DownStreamCount")
        public String downStreamCount;

        /**
         * <strong>example:</strong>
         * <p>189814043+272292277</p>
         */
        @NameInMap("DownStreamCountIds")
        public String downStreamCountIds;

        /**
         * <strong>example:</strong>
         * <p>pair</p>
         */
        @NameInMap("Granularity")
        public String granularity;

        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("UpStreamCount")
        public String upStreamCount;

        /**
         * <strong>example:</strong>
         * <p>104684044+249445882</p>
         */
        @NameInMap("UpStreamCountIds")
        public String upStreamCountIds;

        /**
         * <strong>example:</strong>
         * <p>{678.8225: 91, 5270.4675: 95}</p>
         */
        @NameInMap("Distribution")
        public String distribution;

        /**
         * <strong>example:</strong>
         * <p>conversion_rate</p>
         */
        @NameInMap("IndicatorName")
        public String indicatorName;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("ExceptionRate")
        public String exceptionRate;

        public static ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior build(java.util.Map<String, ?> map) throws Exception {
            ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior self = new ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior();
            return TeaModel.build(map, self);
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior setDs(String ds) {
            this.ds = ds;
            return this;
        }
        public String getDs() {
            return this.ds;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior setRankId(String rankId) {
            this.rankId = rankId;
            return this;
        }
        public String getRankId() {
            return this.rankId;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior setConversionRate(String conversionRate) {
            this.conversionRate = conversionRate;
            return this;
        }
        public String getConversionRate() {
            return this.conversionRate;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior setConversionRateIds(String conversionRateIds) {
            this.conversionRateIds = conversionRateIds;
            return this;
        }
        public String getConversionRateIds() {
            return this.conversionRateIds;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior setDownStreamCount(String downStreamCount) {
            this.downStreamCount = downStreamCount;
            return this;
        }
        public String getDownStreamCount() {
            return this.downStreamCount;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior setDownStreamCountIds(String downStreamCountIds) {
            this.downStreamCountIds = downStreamCountIds;
            return this;
        }
        public String getDownStreamCountIds() {
            return this.downStreamCountIds;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior setGranularity(String granularity) {
            this.granularity = granularity;
            return this;
        }
        public String getGranularity() {
            return this.granularity;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior setUpStreamCount(String upStreamCount) {
            this.upStreamCount = upStreamCount;
            return this;
        }
        public String getUpStreamCount() {
            return this.upStreamCount;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior setUpStreamCountIds(String upStreamCountIds) {
            this.upStreamCountIds = upStreamCountIds;
            return this;
        }
        public String getUpStreamCountIds() {
            return this.upStreamCountIds;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior setDistribution(String distribution) {
            this.distribution = distribution;
            return this;
        }
        public String getDistribution() {
            return this.distribution;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior setIndicatorName(String indicatorName) {
            this.indicatorName = indicatorName;
            return this;
        }
        public String getIndicatorName() {
            return this.indicatorName;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfAbnormalBehavior setExceptionRate(String exceptionRate) {
            this.exceptionRate = exceptionRate;
            return this;
        }
        public String getExceptionRate() {
            return this.exceptionRate;
        }

    }

    public static class ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>\\N</p>
         */
        @NameInMap("DefaultNullCount")
        public String defaultNullCount;

        /**
         * <strong>example:</strong>
         * <p>\\N</p>
         */
        @NameInMap("DefaultNullRate")
        public String defaultNullRate;

        /**
         * <strong>example:</strong>
         * <p>20230509</p>
         */
        @NameInMap("Ds")
        public String ds;

        /**
         * <strong>example:</strong>
         * <p>register_time</p>
         */
        @NameInMap("FeatureName")
        public String featureName;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("FeatureType")
        public String featureType;

        /**
         * <strong>example:</strong>
         * <p>55095</p>
         */
        @NameInMap("NullCount")
        public String nullCount;

        /**
         * <strong>example:</strong>
         * <p>0.5580879448141732</p>
         */
        @NameInMap("NullRate")
        public String nullRate;

        /**
         * <strong>example:</strong>
         * <p>98721</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        /**
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("UniqueCount")
        public String uniqueCount;

        /**
         * <strong>example:</strong>
         * <p>52.0</p>
         */
        @NameInMap("ValueMax")
        public String valueMax;

        /**
         * <strong>example:</strong>
         * <p>35.0</p>
         */
        @NameInMap("ValueMedian")
        public String valueMedian;

        /**
         * <strong>example:</strong>
         * <p>18.0</p>
         */
        @NameInMap("ValueMin")
        public String valueMin;

        /**
         * <strong>example:</strong>
         * <p>18.0</p>
         */
        @NameInMap("ValueQuantile1")
        public String valueQuantile1;

        /**
         * <strong>example:</strong>
         * <p>18.0</p>
         */
        @NameInMap("ValueQuantile5")
        public String valueQuantile5;

        /**
         * <strong>example:</strong>
         * <p>18.0</p>
         */
        @NameInMap("ValueQuantile25")
        public String valueQuantile25;

        /**
         * <strong>example:</strong>
         * <p>18.0</p>
         */
        @NameInMap("ValueQuantile75")
        public String valueQuantile75;

        /**
         * <strong>example:</strong>
         * <p>18.0</p>
         */
        @NameInMap("ValueQuantile95")
        public String valueQuantile95;

        /**
         * <strong>example:</strong>
         * <p>18.0</p>
         */
        @NameInMap("ValueQuantile99")
        public String valueQuantile99;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Rn")
        public String rn;

        /**
         * <strong>example:</strong>
         * <p>91149.0</p>
         */
        @NameInMap("FrequencyMax")
        public String frequencyMax;

        /**
         * <strong>example:</strong>
         * <p>1349.0</p>
         */
        @NameInMap("FrequencyMedian")
        public String frequencyMedian;

        /**
         * <strong>example:</strong>
         * <p>289.0</p>
         */
        @NameInMap("FrequencyMin")
        public String frequencyMin;

        /**
         * <strong>example:</strong>
         * <p>289.0</p>
         */
        @NameInMap("FrequencyQuantile1")
        public String frequencyQuantile1;

        /**
         * <strong>example:</strong>
         * <p>289.0</p>
         */
        @NameInMap("FrequencyQuantile5")
        public String frequencyQuantile5;

        /**
         * <strong>example:</strong>
         * <p>289.0</p>
         */
        @NameInMap("FrequencyQuantile25")
        public String frequencyQuantile25;

        /**
         * <strong>example:</strong>
         * <p>289.0</p>
         */
        @NameInMap("FrequencyQuantile75")
        public String frequencyQuantile75;

        /**
         * <strong>example:</strong>
         * <p>289.0</p>
         */
        @NameInMap("FrequencyQuantile95")
        public String frequencyQuantile95;

        /**
         * <strong>example:</strong>
         * <p>289.0</p>
         */
        @NameInMap("FrequencyQuantile99")
        public String frequencyQuantile99;

        /**
         * <strong>example:</strong>
         * <p>{678.8225: 91, 5270.4675: 95}</p>
         */
        @NameInMap("Distribution")
        public String distribution;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RankId")
        public String rankId;

        /**
         * <strong>example:</strong>
         * <p>1683562246</p>
         */
        @NameInMap("FeatureValue")
        public String featureValue;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ValueCount")
        public String valueCount;

        /**
         * <strong>example:</strong>
         * <p>0.000019996000799840032</p>
         */
        @NameInMap("ValuePercent")
        public String valuePercent;

        /**
         * <strong>example:</strong>
         * <p>0.7261657444926671</p>
         */
        @NameInMap("ValueQuantile")
        public String valueQuantile;

        /**
         * <strong>example:</strong>
         * <p>427</p>
         */
        @NameInMap("FeatureFrequency")
        public String featureFrequency;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FrequencyCount")
        public String frequencyCount;

        /**
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("FrequencyPercent")
        public String frequencyPercent;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("FrequencyQuantile")
        public String frequencyQuantile;

        public static ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics self = new ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics();
            return TeaModel.build(map, self);
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setDefaultNullCount(String defaultNullCount) {
            this.defaultNullCount = defaultNullCount;
            return this;
        }
        public String getDefaultNullCount() {
            return this.defaultNullCount;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setDefaultNullRate(String defaultNullRate) {
            this.defaultNullRate = defaultNullRate;
            return this;
        }
        public String getDefaultNullRate() {
            return this.defaultNullRate;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setDs(String ds) {
            this.ds = ds;
            return this;
        }
        public String getDs() {
            return this.ds;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setFeatureType(String featureType) {
            this.featureType = featureType;
            return this;
        }
        public String getFeatureType() {
            return this.featureType;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setNullCount(String nullCount) {
            this.nullCount = nullCount;
            return this;
        }
        public String getNullCount() {
            return this.nullCount;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setNullRate(String nullRate) {
            this.nullRate = nullRate;
            return this;
        }
        public String getNullRate() {
            return this.nullRate;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setUniqueCount(String uniqueCount) {
            this.uniqueCount = uniqueCount;
            return this;
        }
        public String getUniqueCount() {
            return this.uniqueCount;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setValueMax(String valueMax) {
            this.valueMax = valueMax;
            return this;
        }
        public String getValueMax() {
            return this.valueMax;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setValueMedian(String valueMedian) {
            this.valueMedian = valueMedian;
            return this;
        }
        public String getValueMedian() {
            return this.valueMedian;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setValueMin(String valueMin) {
            this.valueMin = valueMin;
            return this;
        }
        public String getValueMin() {
            return this.valueMin;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setValueQuantile1(String valueQuantile1) {
            this.valueQuantile1 = valueQuantile1;
            return this;
        }
        public String getValueQuantile1() {
            return this.valueQuantile1;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setValueQuantile5(String valueQuantile5) {
            this.valueQuantile5 = valueQuantile5;
            return this;
        }
        public String getValueQuantile5() {
            return this.valueQuantile5;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setValueQuantile25(String valueQuantile25) {
            this.valueQuantile25 = valueQuantile25;
            return this;
        }
        public String getValueQuantile25() {
            return this.valueQuantile25;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setValueQuantile75(String valueQuantile75) {
            this.valueQuantile75 = valueQuantile75;
            return this;
        }
        public String getValueQuantile75() {
            return this.valueQuantile75;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setValueQuantile95(String valueQuantile95) {
            this.valueQuantile95 = valueQuantile95;
            return this;
        }
        public String getValueQuantile95() {
            return this.valueQuantile95;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setValueQuantile99(String valueQuantile99) {
            this.valueQuantile99 = valueQuantile99;
            return this;
        }
        public String getValueQuantile99() {
            return this.valueQuantile99;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setRn(String rn) {
            this.rn = rn;
            return this;
        }
        public String getRn() {
            return this.rn;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setFrequencyMax(String frequencyMax) {
            this.frequencyMax = frequencyMax;
            return this;
        }
        public String getFrequencyMax() {
            return this.frequencyMax;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setFrequencyMedian(String frequencyMedian) {
            this.frequencyMedian = frequencyMedian;
            return this;
        }
        public String getFrequencyMedian() {
            return this.frequencyMedian;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setFrequencyMin(String frequencyMin) {
            this.frequencyMin = frequencyMin;
            return this;
        }
        public String getFrequencyMin() {
            return this.frequencyMin;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setFrequencyQuantile1(String frequencyQuantile1) {
            this.frequencyQuantile1 = frequencyQuantile1;
            return this;
        }
        public String getFrequencyQuantile1() {
            return this.frequencyQuantile1;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setFrequencyQuantile5(String frequencyQuantile5) {
            this.frequencyQuantile5 = frequencyQuantile5;
            return this;
        }
        public String getFrequencyQuantile5() {
            return this.frequencyQuantile5;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setFrequencyQuantile25(String frequencyQuantile25) {
            this.frequencyQuantile25 = frequencyQuantile25;
            return this;
        }
        public String getFrequencyQuantile25() {
            return this.frequencyQuantile25;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setFrequencyQuantile75(String frequencyQuantile75) {
            this.frequencyQuantile75 = frequencyQuantile75;
            return this;
        }
        public String getFrequencyQuantile75() {
            return this.frequencyQuantile75;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setFrequencyQuantile95(String frequencyQuantile95) {
            this.frequencyQuantile95 = frequencyQuantile95;
            return this;
        }
        public String getFrequencyQuantile95() {
            return this.frequencyQuantile95;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setFrequencyQuantile99(String frequencyQuantile99) {
            this.frequencyQuantile99 = frequencyQuantile99;
            return this;
        }
        public String getFrequencyQuantile99() {
            return this.frequencyQuantile99;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setDistribution(String distribution) {
            this.distribution = distribution;
            return this;
        }
        public String getDistribution() {
            return this.distribution;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setRankId(String rankId) {
            this.rankId = rankId;
            return this;
        }
        public String getRankId() {
            return this.rankId;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setFeatureValue(String featureValue) {
            this.featureValue = featureValue;
            return this;
        }
        public String getFeatureValue() {
            return this.featureValue;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setValueCount(String valueCount) {
            this.valueCount = valueCount;
            return this;
        }
        public String getValueCount() {
            return this.valueCount;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setValuePercent(String valuePercent) {
            this.valuePercent = valuePercent;
            return this;
        }
        public String getValuePercent() {
            return this.valuePercent;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setValueQuantile(String valueQuantile) {
            this.valueQuantile = valueQuantile;
            return this;
        }
        public String getValueQuantile() {
            return this.valueQuantile;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setFeatureFrequency(String featureFrequency) {
            this.featureFrequency = featureFrequency;
            return this;
        }
        public String getFeatureFrequency() {
            return this.featureFrequency;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setFrequencyCount(String frequencyCount) {
            this.frequencyCount = frequencyCount;
            return this;
        }
        public String getFrequencyCount() {
            return this.frequencyCount;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setFrequencyPercent(String frequencyPercent) {
            this.frequencyPercent = frequencyPercent;
            return this;
        }
        public String getFrequencyPercent() {
            return this.frequencyPercent;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfBaseStatistics setFrequencyQuantile(String frequencyQuantile) {
            this.frequencyQuantile = frequencyQuantile;
            return this;
        }
        public String getFrequencyQuantile() {
            return this.frequencyQuantile;
        }

    }

    public static class ListDataDiagnosisReportsResponseBodyReportsOfChangeRateData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20230509</p>
         */
        @NameInMap("Ds")
        public String ds;

        /**
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Flag")
        public String flag;

        /**
         * <strong>example:</strong>
         * <p>1231</p>
         */
        @NameInMap("ChangeCount")
        public String changeCount;

        /**
         * <strong>example:</strong>
         * <p>0.1231</p>
         */
        @NameInMap("ChangeRate")
        public String changeRate;

        public static ListDataDiagnosisReportsResponseBodyReportsOfChangeRateData build(java.util.Map<String, ?> map) throws Exception {
            ListDataDiagnosisReportsResponseBodyReportsOfChangeRateData self = new ListDataDiagnosisReportsResponseBodyReportsOfChangeRateData();
            return TeaModel.build(map, self);
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfChangeRateData setDs(String ds) {
            this.ds = ds;
            return this;
        }
        public String getDs() {
            return this.ds;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfChangeRateData setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfChangeRateData setChangeCount(String changeCount) {
            this.changeCount = changeCount;
            return this;
        }
        public String getChangeCount() {
            return this.changeCount;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfChangeRateData setChangeRate(String changeRate) {
            this.changeRate = changeRate;
            return this;
        }
        public String getChangeRate() {
            return this.changeRate;
        }

    }

    public static class ListDataDiagnosisReportsResponseBodyReportsOfJoinTables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20230509</p>
         */
        @NameInMap("Ds")
        public String ds;

        /**
         * <strong>example:</strong>
         * <p>user_id</p>
         */
        @NameInMap("JoinField")
        public String joinField;

        /**
         * <strong>example:</strong>
         * <p>0.53</p>
         */
        @NameInMap("LeftExceptRate")
        public String leftExceptRate;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("RightExceptRate")
        public String rightExceptRate;

        /**
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("Flag")
        public String flag;

        /**
         * <strong>example:</strong>
         * <p>register_time</p>
         */
        @NameInMap("FeatureName")
        public String featureName;

        /**
         * <strong>example:</strong>
         * <p>1683562246</p>
         */
        @NameInMap("FeatureValue")
        public String featureValue;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Percent")
        public String percent;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Quantile")
        public String quantile;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ValueCount")
        public String valueCount;

        /**
         * <strong>example:</strong>
         * <p>0.019996000799</p>
         */
        @NameInMap("ValuePercent")
        public String valuePercent;

        /**
         * <strong>example:</strong>
         * <p>0.72616</p>
         */
        @NameInMap("ValueQuantile")
        public String valueQuantile;

        public static ListDataDiagnosisReportsResponseBodyReportsOfJoinTables build(java.util.Map<String, ?> map) throws Exception {
            ListDataDiagnosisReportsResponseBodyReportsOfJoinTables self = new ListDataDiagnosisReportsResponseBodyReportsOfJoinTables();
            return TeaModel.build(map, self);
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfJoinTables setDs(String ds) {
            this.ds = ds;
            return this;
        }
        public String getDs() {
            return this.ds;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfJoinTables setJoinField(String joinField) {
            this.joinField = joinField;
            return this;
        }
        public String getJoinField() {
            return this.joinField;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfJoinTables setLeftExceptRate(String leftExceptRate) {
            this.leftExceptRate = leftExceptRate;
            return this;
        }
        public String getLeftExceptRate() {
            return this.leftExceptRate;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfJoinTables setRightExceptRate(String rightExceptRate) {
            this.rightExceptRate = rightExceptRate;
            return this;
        }
        public String getRightExceptRate() {
            return this.rightExceptRate;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfJoinTables setFlag(String flag) {
            this.flag = flag;
            return this;
        }
        public String getFlag() {
            return this.flag;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfJoinTables setFeatureName(String featureName) {
            this.featureName = featureName;
            return this;
        }
        public String getFeatureName() {
            return this.featureName;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfJoinTables setFeatureValue(String featureValue) {
            this.featureValue = featureValue;
            return this;
        }
        public String getFeatureValue() {
            return this.featureValue;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfJoinTables setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfJoinTables setQuantile(String quantile) {
            this.quantile = quantile;
            return this;
        }
        public String getQuantile() {
            return this.quantile;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfJoinTables setValueCount(String valueCount) {
            this.valueCount = valueCount;
            return this;
        }
        public String getValueCount() {
            return this.valueCount;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfJoinTables setValuePercent(String valuePercent) {
            this.valuePercent = valuePercent;
            return this;
        }
        public String getValuePercent() {
            return this.valuePercent;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfJoinTables setValueQuantile(String valueQuantile) {
            this.valueQuantile = valueQuantile;
            return this;
        }
        public String getValueQuantile() {
            return this.valueQuantile;
        }

    }

    public static class ListDataDiagnosisReportsResponseBodyReportsOfPreferenceStatisticsCycle extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.73</p>
         */
        @NameInMap("CycleRemainRate")
        public String cycleRemainRate;

        /**
         * <strong>example:</strong>
         * <p>0.52</p>
         */
        @NameInMap("SingleRemainRate")
        public String singleRemainRate;

        /**
         * <strong>example:</strong>
         * <p>20230509</p>
         */
        @NameInMap("Ds")
        public String ds;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Days")
        public String days;

        /**
         * <strong>example:</strong>
         * <p>0.67</p>
         */
        @NameInMap("EverAppearedRate")
        public String everAppearedRate;

        /**
         * <strong>example:</strong>
         * <p>week</p>
         */
        @NameInMap("Period")
        public String period;

        /**
         * <strong>example:</strong>
         * <p>0.33</p>
         */
        @NameInMap("PeriodRemainRate")
        public String periodRemainRate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodRemainCount")
        public Long periodRemainCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PeriodInternal")
        public Long periodInternal;

        public static ListDataDiagnosisReportsResponseBodyReportsOfPreferenceStatisticsCycle build(java.util.Map<String, ?> map) throws Exception {
            ListDataDiagnosisReportsResponseBodyReportsOfPreferenceStatisticsCycle self = new ListDataDiagnosisReportsResponseBodyReportsOfPreferenceStatisticsCycle();
            return TeaModel.build(map, self);
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfPreferenceStatisticsCycle setCycleRemainRate(String cycleRemainRate) {
            this.cycleRemainRate = cycleRemainRate;
            return this;
        }
        public String getCycleRemainRate() {
            return this.cycleRemainRate;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfPreferenceStatisticsCycle setSingleRemainRate(String singleRemainRate) {
            this.singleRemainRate = singleRemainRate;
            return this;
        }
        public String getSingleRemainRate() {
            return this.singleRemainRate;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfPreferenceStatisticsCycle setDs(String ds) {
            this.ds = ds;
            return this;
        }
        public String getDs() {
            return this.ds;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfPreferenceStatisticsCycle setDays(String days) {
            this.days = days;
            return this;
        }
        public String getDays() {
            return this.days;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfPreferenceStatisticsCycle setEverAppearedRate(String everAppearedRate) {
            this.everAppearedRate = everAppearedRate;
            return this;
        }
        public String getEverAppearedRate() {
            return this.everAppearedRate;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfPreferenceStatisticsCycle setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfPreferenceStatisticsCycle setPeriodRemainRate(String periodRemainRate) {
            this.periodRemainRate = periodRemainRate;
            return this;
        }
        public String getPeriodRemainRate() {
            return this.periodRemainRate;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfPreferenceStatisticsCycle setPeriodRemainCount(Long periodRemainCount) {
            this.periodRemainCount = periodRemainCount;
            return this;
        }
        public Long getPeriodRemainCount() {
            return this.periodRemainCount;
        }

        public ListDataDiagnosisReportsResponseBodyReportsOfPreferenceStatisticsCycle setPeriodInternal(Long periodInternal) {
            this.periodInternal = periodInternal;
            return this;
        }
        public Long getPeriodInternal() {
            return this.periodInternal;
        }

    }

}
