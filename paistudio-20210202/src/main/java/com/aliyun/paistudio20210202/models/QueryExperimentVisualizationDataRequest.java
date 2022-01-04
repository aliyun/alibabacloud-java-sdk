// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class QueryExperimentVisualizationDataRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<QueryExperimentVisualizationDataRequestBody> body;

    public static QueryExperimentVisualizationDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentVisualizationDataRequest self = new QueryExperimentVisualizationDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryExperimentVisualizationDataRequest setBody(java.util.List<QueryExperimentVisualizationDataRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<QueryExperimentVisualizationDataRequestBody> getBody() {
        return this.body;
    }

    public static class QueryExperimentVisualizationDataRequestBody extends TeaModel {
        // 结束时间，UTC 时间，日期格式 iso8601，闭区间，对流算法必填
        @NameInMap("EndTime")
        public String endTime;

        // node id
        @NameInMap("NodeId")
        public String nodeId;

        // 开始时间，UTC 时间，日期格式 iso8601，闭区间，对流算法必选
        @NameInMap("StartTime")
        public String startTime;

        // dataId列表
        @NameInMap("VisualizationDataIds")
        public java.util.List<String> visualizationDataIds;

        public static QueryExperimentVisualizationDataRequestBody build(java.util.Map<String, ?> map) throws Exception {
            QueryExperimentVisualizationDataRequestBody self = new QueryExperimentVisualizationDataRequestBody();
            return TeaModel.build(map, self);
        }

        public QueryExperimentVisualizationDataRequestBody setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryExperimentVisualizationDataRequestBody setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public QueryExperimentVisualizationDataRequestBody setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryExperimentVisualizationDataRequestBody setVisualizationDataIds(java.util.List<String> visualizationDataIds) {
            this.visualizationDataIds = visualizationDataIds;
            return this;
        }
        public java.util.List<String> getVisualizationDataIds() {
            return this.visualizationDataIds;
        }

    }

}
