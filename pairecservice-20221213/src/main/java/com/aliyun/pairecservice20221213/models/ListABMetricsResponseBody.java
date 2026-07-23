// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListABMetricsResponseBody extends TeaModel {
    /**
     * <p>The list of AB metrics.</p>
     */
    @NameInMap("ABMetrics")
    public java.util.List<ListABMetricsResponseBodyABMetrics> ABMetrics;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F7AC05FF-EDE7-5C2B-B9AE-33D6DF4178BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of AB metrics returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListABMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListABMetricsResponseBody self = new ListABMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListABMetricsResponseBody setABMetrics(java.util.List<ListABMetricsResponseBodyABMetrics> ABMetrics) {
        this.ABMetrics = ABMetrics;
        return this;
    }
    public java.util.List<ListABMetricsResponseBodyABMetrics> getABMetrics() {
        return this.ABMetrics;
    }

    public ListABMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListABMetricsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListABMetricsResponseBodyABMetrics extends TeaModel {
        /**
         * <p>The AB metric ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ABMetricId")
        public String ABMetricId;

        /**
         * <p>Indicates whether to aggregate data by user.</p>
         */
        @NameInMap("AggregationByUser")
        public Boolean aggregationByUser;

        /**
         * <p>The metric definition.</p>
         * 
         * <strong>example:</strong>
         * <p>sum(click_cnt)</p>
         */
        @NameInMap("Definition")
        public String definition;

        /**
         * <p>The denominator of the derived metric.</p>
         * 
         * <strong>example:</strong>
         * <p>pv</p>
         */
        @NameInMap("Denominator")
        public String denominator;

        /**
         * <p>The metric description.</p>
         * 
         * <strong>example:</strong>
         * <p>pv指标</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the metric follows a binomial distribution.</p>
         */
        @NameInMap("IsBinomialDistribution")
        public Boolean isBinomialDistribution;

        /**
         * <p>The ID of the left-hand metric in the formula for the derived metric.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("LeftMetricId")
        public String leftMetricId;

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>pv</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether significance calculation is required.</p>
         */
        @NameInMap("NeedSignificance")
        public Boolean needSignificance;

        /**
         * <p>The numerator of the derived metric.</p>
         * 
         * <strong>example:</strong>
         * <p>click</p>
         */
        @NameInMap("Numerator")
        public String numerator;

        /**
         * <p>The operator used to calculate the derived metric. Valid values:</p>
         * <ul>
         * <li><p><code>Plus</code>: addition</p>
         * </li>
         * <li><p><code>Minus</code>: subtraction</p>
         * </li>
         * <li><p><code>Multiplication</code>: multiplication</p>
         * </li>
         * <li><p><code>Division</code>: division</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Division</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>Indicates whether the metric is a real-time metric.</p>
         * <ul>
         * <li><p><code>true</code>: The metric is calculated in real time.</p>
         * </li>
         * <li><p><code>false</code>: The metric is not calculated in real time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Realtime")
        public String realtime;

        /**
         * <p>The ID of the data source for the data table to which the results are written.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ResultResourceId")
        public String resultResourceId;

        /**
         * <p>The ID of the data table to which the results are written.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ResultTableMetaId")
        public String resultTableMetaId;

        /**
         * <p>The ID of the right-hand metric in the formula for the derived metric.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RightMetricId")
        public String rightMetricId;

        /**
         * <p>The scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <p>The scene name.</p>
         * 
         * <strong>example:</strong>
         * <p>home_feed</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The statistical period.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StatisticsCycle")
        public Integer statisticsCycle;

        /**
         * <p>The data table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TableMetaId")
        public String tableMetaId;

        /**
         * <p>The metric type. Valid values:</p>
         * <ul>
         * <li><p><code>Single</code>: a single metric.</p>
         * </li>
         * <li><p><code>Derived</code>: a derived metric.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Single</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListABMetricsResponseBodyABMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListABMetricsResponseBodyABMetrics self = new ListABMetricsResponseBodyABMetrics();
            return TeaModel.build(map, self);
        }

        public ListABMetricsResponseBodyABMetrics setABMetricId(String ABMetricId) {
            this.ABMetricId = ABMetricId;
            return this;
        }
        public String getABMetricId() {
            return this.ABMetricId;
        }

        public ListABMetricsResponseBodyABMetrics setAggregationByUser(Boolean aggregationByUser) {
            this.aggregationByUser = aggregationByUser;
            return this;
        }
        public Boolean getAggregationByUser() {
            return this.aggregationByUser;
        }

        public ListABMetricsResponseBodyABMetrics setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public ListABMetricsResponseBodyABMetrics setDenominator(String denominator) {
            this.denominator = denominator;
            return this;
        }
        public String getDenominator() {
            return this.denominator;
        }

        public ListABMetricsResponseBodyABMetrics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListABMetricsResponseBodyABMetrics setIsBinomialDistribution(Boolean isBinomialDistribution) {
            this.isBinomialDistribution = isBinomialDistribution;
            return this;
        }
        public Boolean getIsBinomialDistribution() {
            return this.isBinomialDistribution;
        }

        public ListABMetricsResponseBodyABMetrics setLeftMetricId(String leftMetricId) {
            this.leftMetricId = leftMetricId;
            return this;
        }
        public String getLeftMetricId() {
            return this.leftMetricId;
        }

        public ListABMetricsResponseBodyABMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListABMetricsResponseBodyABMetrics setNeedSignificance(Boolean needSignificance) {
            this.needSignificance = needSignificance;
            return this;
        }
        public Boolean getNeedSignificance() {
            return this.needSignificance;
        }

        public ListABMetricsResponseBodyABMetrics setNumerator(String numerator) {
            this.numerator = numerator;
            return this;
        }
        public String getNumerator() {
            return this.numerator;
        }

        public ListABMetricsResponseBodyABMetrics setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListABMetricsResponseBodyABMetrics setRealtime(String realtime) {
            this.realtime = realtime;
            return this;
        }
        public String getRealtime() {
            return this.realtime;
        }

        public ListABMetricsResponseBodyABMetrics setResultResourceId(String resultResourceId) {
            this.resultResourceId = resultResourceId;
            return this;
        }
        public String getResultResourceId() {
            return this.resultResourceId;
        }

        public ListABMetricsResponseBodyABMetrics setResultTableMetaId(String resultTableMetaId) {
            this.resultTableMetaId = resultTableMetaId;
            return this;
        }
        public String getResultTableMetaId() {
            return this.resultTableMetaId;
        }

        public ListABMetricsResponseBodyABMetrics setRightMetricId(String rightMetricId) {
            this.rightMetricId = rightMetricId;
            return this;
        }
        public String getRightMetricId() {
            return this.rightMetricId;
        }

        public ListABMetricsResponseBodyABMetrics setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListABMetricsResponseBodyABMetrics setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListABMetricsResponseBodyABMetrics setStatisticsCycle(Integer statisticsCycle) {
            this.statisticsCycle = statisticsCycle;
            return this;
        }
        public Integer getStatisticsCycle() {
            return this.statisticsCycle;
        }

        public ListABMetricsResponseBodyABMetrics setTableMetaId(String tableMetaId) {
            this.tableMetaId = tableMetaId;
            return this;
        }
        public String getTableMetaId() {
            return this.tableMetaId;
        }

        public ListABMetricsResponseBodyABMetrics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
