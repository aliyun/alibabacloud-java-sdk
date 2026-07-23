// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateABMetricRequest extends TeaModel {
    /**
     * <p>Specifies whether to aggregate by user dimension when calculating significance. Two aggregation methods are supported: by user and by sample.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("AggregationByUser")
    public Boolean aggregationByUser;

    /**
     * <p>The metric definition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sum(click_cnt)</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>The denominator used in significance calculation.</p>
     * 
     * <strong>example:</strong>
     * <p>pv</p>
     */
    @NameInMap("Denominator")
    public String denominator;

    /**
     * <p>The metric description.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pv 指标</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID. You can obtain it by calling the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-test123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether the current metric follows a binomial distribution when the metric type is a derived metric. If set to true, the mean and variance of the metric are calculated based on the binomial distribution.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IsBinomialDistribution")
    public Boolean isBinomialDistribution;

    /**
     * <p>The left metric ID of the derived metric.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LeftMetricId")
    public String leftMetricId;

    /**
     * <p>The metric name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pv</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to calculate significance.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("NeedSignificance")
    public Boolean needSignificance;

    /**
     * <p>The numerator used in significance calculation.</p>
     * 
     * <strong>example:</strong>
     * <p>click</p>
     */
    @NameInMap("Numerator")
    public String numerator;

    /**
     * <p>The operator for derived metric calculation. Valid values:</p>
     * <ul>
     * <li><p>Plus: addition</p>
     * </li>
     * <li><p>Minus: subtraction</p>
     * </li>
     * <li><p>Multiplication: multiplication</p>
     * </li>
     * <li><p>Division: division</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Division</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>Specifies whether the metric is a real-time metric. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Realtime")
    public Boolean realtime;

    /**
     * <p>The ID of the data source for the write-back data table. You can obtain it by calling the ListInstanceResources operation.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ResultResourceId")
    public String resultResourceId;

    /**
     * <p>The right metric ID of the derived metric.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RightMetricId")
    public String rightMetricId;

    /**
     * <p>The scene ID. You can obtain it by calling the <a href="https://help.aliyun.com/document_detail/2402581.html">ListScenes</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>The statistical period.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StatisticsCycle")
    public Integer statisticsCycle;

    /**
     * <p>The data table ID. You can obtain it by calling the ListTableMetas operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TableMetaId")
    public String tableMetaId;

    /**
     * <p>The metric type. Valid values:</p>
     * <ul>
     * <li><p>Single: single metric.</p>
     * </li>
     * <li><p>Derived: derived metric.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Single</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateABMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateABMetricRequest self = new UpdateABMetricRequest();
        return TeaModel.build(map, self);
    }

    public UpdateABMetricRequest setAggregationByUser(Boolean aggregationByUser) {
        this.aggregationByUser = aggregationByUser;
        return this;
    }
    public Boolean getAggregationByUser() {
        return this.aggregationByUser;
    }

    public UpdateABMetricRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public UpdateABMetricRequest setDenominator(String denominator) {
        this.denominator = denominator;
        return this;
    }
    public String getDenominator() {
        return this.denominator;
    }

    public UpdateABMetricRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateABMetricRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateABMetricRequest setIsBinomialDistribution(Boolean isBinomialDistribution) {
        this.isBinomialDistribution = isBinomialDistribution;
        return this;
    }
    public Boolean getIsBinomialDistribution() {
        return this.isBinomialDistribution;
    }

    public UpdateABMetricRequest setLeftMetricId(String leftMetricId) {
        this.leftMetricId = leftMetricId;
        return this;
    }
    public String getLeftMetricId() {
        return this.leftMetricId;
    }

    public UpdateABMetricRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateABMetricRequest setNeedSignificance(Boolean needSignificance) {
        this.needSignificance = needSignificance;
        return this;
    }
    public Boolean getNeedSignificance() {
        return this.needSignificance;
    }

    public UpdateABMetricRequest setNumerator(String numerator) {
        this.numerator = numerator;
        return this;
    }
    public String getNumerator() {
        return this.numerator;
    }

    public UpdateABMetricRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateABMetricRequest setRealtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }
    public Boolean getRealtime() {
        return this.realtime;
    }

    public UpdateABMetricRequest setResultResourceId(String resultResourceId) {
        this.resultResourceId = resultResourceId;
        return this;
    }
    public String getResultResourceId() {
        return this.resultResourceId;
    }

    public UpdateABMetricRequest setRightMetricId(String rightMetricId) {
        this.rightMetricId = rightMetricId;
        return this;
    }
    public String getRightMetricId() {
        return this.rightMetricId;
    }

    public UpdateABMetricRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public UpdateABMetricRequest setStatisticsCycle(Integer statisticsCycle) {
        this.statisticsCycle = statisticsCycle;
        return this;
    }
    public Integer getStatisticsCycle() {
        return this.statisticsCycle;
    }

    public UpdateABMetricRequest setTableMetaId(String tableMetaId) {
        this.tableMetaId = tableMetaId;
        return this;
    }
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    public UpdateABMetricRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
