// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListABMetricsResponseBody extends TeaModel {
    @NameInMap("ABMetrics")
    public java.util.List<ListABMetricsResponseBodyABMetrics> ABMetrics;

    /**
     * <strong>example:</strong>
     * <p>F7AC05FF-EDE7-5C2B-B9AE-33D6DF4178BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ABMetricId")
        public String ABMetricId;

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
         * <p>3</p>
         */
        @NameInMap("ResultResourceId")
        public String resultResourceId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>1</p>
         */
        @NameInMap("TableMetaId")
        public String tableMetaId;

        /**
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

        public ListABMetricsResponseBodyABMetrics setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public ListABMetricsResponseBodyABMetrics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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
