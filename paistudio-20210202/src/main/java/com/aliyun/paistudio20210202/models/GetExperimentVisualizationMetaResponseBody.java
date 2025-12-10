// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentVisualizationMetaResponseBody extends TeaModel {
    @NameInMap("VisualizationMeta")
    public java.util.List<GetExperimentVisualizationMetaResponseBodyVisualizationMeta> visualizationMeta;

    /**
     * <strong>example:</strong>
     * <p>A84A1282-D3E7-5198-9E8E-2AD09C78C6C1</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>{
         *     &quot;locations&quot;: [{
         *         &quot;id&quot;: &quot;result_table&quot;,
         *         &quot;location&quot;: {
         *             &quot;project&quot;: &quot;mulan_test_pre_1&quot;,
         *             &quot;endpoint&quot;: &quot;<a href="http://service.cn.maxcompute.aliyun-inc.com/api">http://service.cn.maxcompute.aliyun-inc.com/api</a>&quot;,
         *             &quot;table&quot;: &quot;pai_temp_flow_qzkkjqic95olnrel1w_node_7hc1rdsa99gy2msbvc_visualizationTable&quot;
         *         },
         *         &quot;locationType&quot;: &quot;MaxComputeTable&quot;
         *     }],
         *     &quot;components&quot;: [{
         *         &quot;id&quot;: &quot;histogram-chart&quot;,
         *         &quot;dataId&quot;: &quot;histogram_result&quot;
         *     }],
         *     &quot;dataInfos&quot;: [{
         *         &quot;id&quot;: &quot;histogram_result&quot;,
         *         &quot;locationId&quot;: &quot;result_table&quot;,
         *         &quot;dataType&quot;: &quot;json&quot;
         *     }]
         * }</p>
         */
        @NameInMap("Meta")
        public String meta;

        /**
         * <strong>example:</strong>
         * <p>node_id1</p>
         */
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
