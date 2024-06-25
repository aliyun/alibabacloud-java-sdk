// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetABMetricResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sum(click_cnt)</p>
     */
    @NameInMap("Definition")
    public String definition;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("LeftMetricId")
    public String leftMetricId;

    /**
     * <strong>example:</strong>
     * <p>pv</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>Division</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Realtime")
    public String realtime;

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ResultResourceId")
    public String resultResourceId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ResultTableMetaId")
    public String resultTableMetaId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RightMetricId")
    public String rightMetricId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <strong>example:</strong>
     * <p>home_feed</p>
     */
    @NameInMap("SceneName")
    public String sceneName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StatisticsCycle")
    public Integer statisticsCycle;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TableMetaId")
    public String tableMetaId;

    /**
     * <strong>example:</strong>
     * <p>Single</p>
     */
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
