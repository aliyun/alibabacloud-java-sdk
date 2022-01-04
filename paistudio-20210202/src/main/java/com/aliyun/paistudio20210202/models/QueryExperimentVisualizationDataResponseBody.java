// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class QueryExperimentVisualizationDataResponseBody extends TeaModel {
    @NameInMap("VisualizationData")
    public java.util.List<QueryExperimentVisualizationDataResponseBodyVisualizationData> visualizationData;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static QueryExperimentVisualizationDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentVisualizationDataResponseBody self = new QueryExperimentVisualizationDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryExperimentVisualizationDataResponseBody setVisualizationData(java.util.List<QueryExperimentVisualizationDataResponseBodyVisualizationData> visualizationData) {
        this.visualizationData = visualizationData;
        return this;
    }
    public java.util.List<QueryExperimentVisualizationDataResponseBodyVisualizationData> getVisualizationData() {
        return this.visualizationData;
    }

    public QueryExperimentVisualizationDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryExperimentVisualizationDataResponseBodyVisualizationData extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Data")
        public String data;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("NodeId")
        public String nodeId;

        public static QueryExperimentVisualizationDataResponseBodyVisualizationData build(java.util.Map<String, ?> map) throws Exception {
            QueryExperimentVisualizationDataResponseBodyVisualizationData self = new QueryExperimentVisualizationDataResponseBodyVisualizationData();
            return TeaModel.build(map, self);
        }

        public QueryExperimentVisualizationDataResponseBodyVisualizationData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryExperimentVisualizationDataResponseBodyVisualizationData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryExperimentVisualizationDataResponseBodyVisualizationData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryExperimentVisualizationDataResponseBodyVisualizationData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

}
