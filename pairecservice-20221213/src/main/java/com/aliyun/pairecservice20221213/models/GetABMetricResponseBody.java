// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetABMetricResponseBody extends TeaModel {
    @NameInMap("Definition")
    public String definition;

    @NameInMap("Description")
    public String description;

    @NameInMap("LeftMetricId")
    public String leftMetricId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Realtime")
    public String realtime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultResourceId")
    public String resultResourceId;

    @NameInMap("ResultTableMetaId")
    public String resultTableMetaId;

    @NameInMap("RightMetricId")
    public String rightMetricId;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("SceneName")
    public String sceneName;

    @NameInMap("StatisticsCycle")
    public Integer statisticsCycle;

    @NameInMap("TableMetaId")
    public String tableMetaId;

    @NameInMap("Type")
    public String type;

    public static GetABMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetABMetricResponseBody self = new GetABMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public GetABMetricResponseBody setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public GetABMetricResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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
