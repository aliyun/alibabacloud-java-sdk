// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentVisualizationMetaResponseBody extends TeaModel {
    @NameInMap("VisualizationMeta")
    public java.util.List<GetExperimentVisualizationMetaResponseBodyVisualizationMeta> visualizationMeta;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetExperimentVisualizationMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentVisualizationMetaResponseBody self = new GetExperimentVisualizationMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentVisualizationMetaResponseBody setVisualizationMeta(java.util.List<GetExperimentVisualizationMetaResponseBodyVisualizationMeta> visualizationMeta) {
        this.visualizationMeta = visualizationMeta;
        return this;
    }
    public java.util.List<GetExperimentVisualizationMetaResponseBodyVisualizationMeta> getVisualizationMeta() {
        return this.visualizationMeta;
    }

    public GetExperimentVisualizationMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetExperimentVisualizationMetaResponseBodyVisualizationMeta extends TeaModel {
        @NameInMap("Meta")
        public String meta;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        public static GetExperimentVisualizationMetaResponseBodyVisualizationMeta build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentVisualizationMetaResponseBodyVisualizationMeta self = new GetExperimentVisualizationMetaResponseBodyVisualizationMeta();
            return TeaModel.build(map, self);
        }

        public GetExperimentVisualizationMetaResponseBodyVisualizationMeta setMeta(String meta) {
            this.meta = meta;
            return this;
        }
        public String getMeta() {
            return this.meta;
        }

        public GetExperimentVisualizationMetaResponseBodyVisualizationMeta setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetExperimentVisualizationMetaResponseBodyVisualizationMeta setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

}
