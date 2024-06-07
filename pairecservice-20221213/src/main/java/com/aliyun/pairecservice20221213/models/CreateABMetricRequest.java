// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateABMetricRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LeftMetricId")
    public String leftMetricId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Operator")
    public String operator;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Realtime")
    public Boolean realtime;

    @NameInMap("ResultResourceId")
    public String resultResourceId;

    @NameInMap("RightMetricId")
    public String rightMetricId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("StatisticsCycle")
    public Integer statisticsCycle;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableMetaId")
    public String tableMetaId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateABMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateABMetricRequest self = new CreateABMetricRequest();
        return TeaModel.build(map, self);
    }

    public CreateABMetricRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
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
