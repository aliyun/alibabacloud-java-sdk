// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateABMetricRequest extends TeaModel {
    @NameInMap("AggregationByUser")
    public Boolean aggregationByUser;

    /**
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
     * <p>This parameter is required.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-test123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsBinomialDistribution")
    public Boolean isBinomialDistribution;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("LeftMetricId")
    public String leftMetricId;

    /**
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
     * <strong>example:</strong>
     * <p>Division</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Realtime")
    public Boolean realtime;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ResultResourceId")
    public String resultResourceId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RightMetricId")
    public String rightMetricId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StatisticsCycle")
    public Integer statisticsCycle;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TableMetaId")
    public String tableMetaId;

    /**
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
