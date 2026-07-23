// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetABMetricResponseBody extends TeaModel {
    /**
     * <p>Specifies whether to aggregate metrics by user.</p>
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
     * <p>The denominator of the derived metric formula.</p>
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
     * <p>页面访问次数</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the metric follows a binomial distribution. This affects how significance is calculated.</p>
     */
    @NameInMap("IsBinomialDistribution")
    public Boolean isBinomialDistribution;

    /**
     * <p>The ID of the left operand metric for a derived metric.</p>
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
     * <p>Specifies whether significance testing is required for this metric.</p>
     */
    @NameInMap("NeedSignificance")
    public Boolean needSignificance;

    /**
     * <p>The numerator of the derived metric formula.</p>
     * 
     * <strong>example:</strong>
     * <p>click</p>
     */
    @NameInMap("Numerator")
    public String numerator;

    /**
     * <p>The operator for the derived metric. Valid values:</p>
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
     * <p>Specifies whether the metric is real-time. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The metric is real-time.</p>
     * </li>
     * <li><p><code>false</code>: The metric is not real-time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Realtime")
    public String realtime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the data source for the results table.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ResultResourceId")
    public String resultResourceId;

    /**
     * <p>The ID of the results table.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ResultTableMetaId")
    public String resultTableMetaId;

    /**
     * <p>The ID of the right operand metric for a derived metric.</p>
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
     * <p>The statistics cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StatisticsCycle")
    public Integer statisticsCycle;

    /**
     * <p>The ID of the source table.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TableMetaId")
    public String tableMetaId;

    /**
     * <p>The type of the metric. Valid values:</p>
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

    public static GetABMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetABMetricResponseBody self = new GetABMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public GetABMetricResponseBody setAggregationByUser(Boolean aggregationByUser) {
        this.aggregationByUser = aggregationByUser;
        return this;
    }
    public Boolean getAggregationByUser() {
        return this.aggregationByUser;
    }

    public GetABMetricResponseBody setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public GetABMetricResponseBody setDenominator(String denominator) {
        this.denominator = denominator;
        return this;
    }
    public String getDenominator() {
        return this.denominator;
    }

    public GetABMetricResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetABMetricResponseBody setIsBinomialDistribution(Boolean isBinomialDistribution) {
        this.isBinomialDistribution = isBinomialDistribution;
        return this;
    }
    public Boolean getIsBinomialDistribution() {
        return this.isBinomialDistribution;
    }

    public GetABMetricResponseBody setLeftMetricId(String leftMetricId) {
        this.leftMetricId = leftMetricId;
        return this;
    }
    public String getLeftMetricId() {
        return this.leftMetricId;
    }

    public GetABMetricResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetABMetricResponseBody setNeedSignificance(Boolean needSignificance) {
        this.needSignificance = needSignificance;
        return this;
    }
    public Boolean getNeedSignificance() {
        return this.needSignificance;
    }

    public GetABMetricResponseBody setNumerator(String numerator) {
        this.numerator = numerator;
        return this;
    }
    public String getNumerator() {
        return this.numerator;
    }

    public GetABMetricResponseBody setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public GetABMetricResponseBody setRealtime(String realtime) {
        this.realtime = realtime;
        return this;
    }
    public String getRealtime() {
        return this.realtime;
    }

    public GetABMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetABMetricResponseBody setResultResourceId(String resultResourceId) {
        this.resultResourceId = resultResourceId;
        return this;
    }
    public String getResultResourceId() {
        return this.resultResourceId;
    }

    public GetABMetricResponseBody setResultTableMetaId(String resultTableMetaId) {
        this.resultTableMetaId = resultTableMetaId;
        return this;
    }
    public String getResultTableMetaId() {
        return this.resultTableMetaId;
    }

    public GetABMetricResponseBody setRightMetricId(String rightMetricId) {
        this.rightMetricId = rightMetricId;
        return this;
    }
    public String getRightMetricId() {
        return this.rightMetricId;
    }

    public GetABMetricResponseBody setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public GetABMetricResponseBody setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public GetABMetricResponseBody setStatisticsCycle(Integer statisticsCycle) {
        this.statisticsCycle = statisticsCycle;
        return this;
    }
    public Integer getStatisticsCycle() {
        return this.statisticsCycle;
    }

    public GetABMetricResponseBody setTableMetaId(String tableMetaId) {
        this.tableMetaId = tableMetaId;
        return this;
    }
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    public GetABMetricResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
