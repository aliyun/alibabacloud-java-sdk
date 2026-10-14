// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetGpuClusterTopologyResponseBody extends TeaModel {
    /**
     * <p>The result code. Valid values: Success, Sysom.ServerError, Sysom.InvalidParameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Fail/Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The data returned by the operation.</p>
     */
    @NameInMap("data")
    public GetGpuClusterTopologyResponseBodyData data;

    /**
     * <p>The error message returned when the code is not Success.</p>
     * 
     * <strong>example:</strong>
     * <p>some error msg if not success，“” if success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>return real request ID</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetGpuClusterTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGpuClusterTopologyResponseBody self = new GetGpuClusterTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGpuClusterTopologyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGpuClusterTopologyResponseBody setData(GetGpuClusterTopologyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGpuClusterTopologyResponseBodyData getData() {
        return this.data;
    }

    public GetGpuClusterTopologyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGpuClusterTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGpuClusterTopologyResponseBodyDataData extends TeaModel {
        /**
         * <p>The edge data in the topology structure.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;edges&quot;: [
         *         {
         *           &quot;type&quot;: &quot;GPU&quot;,
         *           &quot;src_id&quot;: &quot;00534a88&quot;,
         *           &quot;dst_id&quot;: &quot;260525e9&quot;,
         *           &quot;values&quot;: {
         *             &quot;Exception&quot;: [
         *               {
         *                 &quot;key&quot;: &quot;NCCL HANG&quot;,
         *                 &quot;value&quot;: &quot;error0&quot;
         *               }
         *             ],
         *             &quot;Metric&quot;: [
         *               {
         *                 &quot;key&quot;: &quot;a&quot;,
         *                 &quot;value&quot;: &quot;372201199012283428&quot;
         *               }
         *             ],
         *             &quot;Basic&quot;: [
         *               {
         *                 &quot;key&quot;: &quot;NCCL Version&quot;,
         *                 &quot;value&quot;: &quot;v2.22.3&quot;
         *               }
         *             ]
         *           },
         *           &quot;style&quot;: {
         *             &quot;lineWidth&quot;: &quot;0.01&quot;,
         *             &quot;opacity&quot;: &quot;1&quot;,
         *             &quot;selectedStyle&quot;: &quot;\&quot;{\\\&quot;opacity\\\&quot;: 1, \\\&quot;lineWidth\\\&quot;: 1}\&quot;&quot;,
         *             &quot;stroke&quot;: &quot;#e94242\n&quot;
         *           }
         *         }
         *       ]</p>
         */
        @NameInMap("edges")
        public Object edges;

        /**
         * <p>The node data in the topology structure.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;nodes&quot;: [
         *         {
         *           &quot;id&quot;: &quot;i-xxxxxx&quot;,
         *           &quot;name&quot;: &quot;i-xxxxxx&quot;,
         *           &quot;gpu_list&quot;: [
         *             {
         *               &quot;id&quot;: &quot;6cc37fbc&quot;,
         *               &quot;name&quot;: &quot;GPU0&quot;,
         *               &quot;style&quot;: {
         *                 &quot;fill&quot;: &quot;#e94242&quot;,
         *                 &quot;opacity&quot;: &quot;0.1&quot;
         *               },
         *               &quot;values&quot;: {
         *                 &quot;Metric&quot;: [
         *                   {
         *                     &quot;key&quot;: &quot;0&quot;,
         *                     &quot;value&quot;: &quot;gpu_util(%)&quot;
         *                   }
         *                 ],
         *                 &quot;Basic&quot;: [
         *                   {
         *                     &quot;key&quot;: &quot;1&quot;,
         *                     &quot;value&quot;: &quot;Gpu Number&quot;
         *                   }
         *                 ],
         *                 &quot;Exception&quot;: [
         *                   {
         *                     &quot;key&quot;: &quot;NCCL HANG&quot;,
         *                     &quot;value&quot;: &quot;error0&quot;
         *                   }
         *                 ]
         *               }
         *             }
         *           ],
         *           &quot;style&quot;: {
         *             &quot;fillOpacity&quot;: &quot;0.5&quot;,
         *             &quot;fill&quot;: &quot;#e94242&quot;
         *           },
         *           &quot;values&quot;: {
         *             &quot;Exception&quot;: [
         *               {
         *                 &quot;key&quot;: &quot;NCCL HANG&quot;,
         *                 &quot;value&quot;: &quot;error0&quot;
         *               }
         *             ],
         *             &quot;Basic&quot;: [
         *               {
         *                 &quot;key&quot;: &quot;podList&quot;,
         *                 &quot;value&quot;: &quot;podname1&quot;
         *               }
         *             ],
         *             &quot;Metric&quot;: [
         *               {
         *                 &quot;key&quot;: &quot;instance&quot;,
         *                 &quot;value&quot;: &quot;i-xxxxxx&quot;
         *               }
         *             ]
         *           }
         *         }
         *       ],</p>
         */
        @NameInMap("nodes")
        public Object nodes;

        public static GetGpuClusterTopologyResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            GetGpuClusterTopologyResponseBodyDataData self = new GetGpuClusterTopologyResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public GetGpuClusterTopologyResponseBodyDataData setEdges(Object edges) {
            this.edges = edges;
            return this;
        }
        public Object getEdges() {
            return this.edges;
        }

        public GetGpuClusterTopologyResponseBodyDataData setNodes(Object nodes) {
            this.nodes = nodes;
            return this;
        }
        public Object getNodes() {
            return this.nodes;
        }

    }

    public static class GetGpuClusterTopologyResponseBodyData extends TeaModel {
        /**
         * <p>The cluster topology data structure.</p>
         */
        @NameInMap("data")
        public GetGpuClusterTopologyResponseBodyDataData data;

        /**
         * <p>The number of GPU cards returned.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("total")
        public Integer total;

        public static GetGpuClusterTopologyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGpuClusterTopologyResponseBodyData self = new GetGpuClusterTopologyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGpuClusterTopologyResponseBodyData setData(GetGpuClusterTopologyResponseBodyDataData data) {
            this.data = data;
            return this;
        }
        public GetGpuClusterTopologyResponseBodyDataData getData() {
            return this.data;
        }

        public GetGpuClusterTopologyResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
