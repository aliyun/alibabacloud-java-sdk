// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateABMetricRequest extends TeaModel {
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
     * <p>pv指标</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID. Call the <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a> operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-test1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsBinomialDistribution")
    public Boolean isBinomialDistribution;

    /**
     * <p>The ID of the left metric used to calculate the derived metric.</p>
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

    @NameInMap("NeedSignificance")
    public Boolean needSignificance;

    /**
     * <strong>example:</strong>
     * <p>click</p>
     */
    @NameInMap("Numerator")
    public String numerator;

    /**
     * <p>The operator used to calculate the derived metric. Valid values:</p>
     * <ul>
     * <li><p><code>Plus</code>: Addition</p>
     * </li>
     * <li><p><code>Minus</code>: Subtraction</p>
     * </li>
     * <li><p><code>Multiplication</code>: Multiplication</p>
     * </li>
     * <li><p><code>Division</code>: Division</p>
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
     * <li><p><code>true</code>: The metric is real-time.</p>
     * </li>
     * <li><p><code>false</code>: The metric is not real-time.</p>
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
     * <p>The data source ID to which the results are written back. Call the ListInstanceResources operation to obtain this ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ResultResourceId")
    public String resultResourceId;

    /**
     * <p>The ID of the right metric used to calculate the derived metric.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RightMetricId")
    public String rightMetricId;

    /**
     * <p>The scene ID. Call the <a href="https://help.aliyun.com/document_detail/2402581.html">ListScenes</a> operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>The statistics cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StatisticsCycle")
    public Integer statisticsCycle;

    /**
     * <p>The data table ID. Call the ListTableMetas operation to obtain this ID.</p>
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
     * <li><p><code>Single</code>: A single metric.</p>
     * </li>
     * <li><p><code>Derived</code>: A derived metric.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Single</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateABMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateABMetricRequest self = new CreateABMetricRequest();
        return TeaModel.build(map, self);
    }

    public CreateABMetricRequest setAggregationByUser(Boolean aggregationByUser) {
        this.aggregationByUser = aggregationByUser;
        return this;
    }
    public Boolean getAggregationByUser() {
        return this.aggregationByUser;
    }

    public CreateABMetricRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public CreateABMetricRequest setDenominator(String denominator) {
        this.denominator = denominator;
        return this;
    }
    public String getDenominator() {
        return this.denominator;
    }

    public CreateABMetricRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateABMetricRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateABMetricRequest setIsBinomialDistribution(Boolean isBinomialDistribution) {
        this.isBinomialDistribution = isBinomialDistribution;
        return this;
    }
    public Boolean getIsBinomialDistribution() {
        return this.isBinomialDistribution;
    }

    public CreateABMetricRequest setLeftMetricId(String leftMetricId) {
        this.leftMetricId = leftMetricId;
        return this;
    }
    public String getLeftMetricId() {
        return this.leftMetricId;
    }

    public CreateABMetricRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateABMetricRequest setNeedSignificance(Boolean needSignificance) {
        this.needSignificance = needSignificance;
        return this;
    }
    public Boolean getNeedSignificance() {
        return this.needSignificance;
    }

    public CreateABMetricRequest setNumerator(String numerator) {
        this.numerator = numerator;
        return this;
    }
    public String getNumerator() {
        return this.numerator;
    }

    public CreateABMetricRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CreateABMetricRequest setRealtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }
    public Boolean getRealtime() {
        return this.realtime;
    }

    public CreateABMetricRequest setResultResourceId(String resultResourceId) {
        this.resultResourceId = resultResourceId;
        return this;
    }
    public String getResultResourceId() {
        return this.resultResourceId;
    }

    public CreateABMetricRequest setRightMetricId(String rightMetricId) {
        this.rightMetricId = rightMetricId;
        return this;
    }
    public String getRightMetricId() {
        return this.rightMetricId;
    }

    public CreateABMetricRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public CreateABMetricRequest setStatisticsCycle(Integer statisticsCycle) {
        this.statisticsCycle = statisticsCycle;
        return this;
    }
    public Integer getStatisticsCycle() {
        return this.statisticsCycle;
    }

    public CreateABMetricRequest setTableMetaId(String tableMetaId) {
        this.tableMetaId = tableMetaId;
        return this;
    }
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    public CreateABMetricRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
