// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GetRenderingProjectInstanceStateMetricsResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StateMetrics")
    public java.util.List<GetRenderingProjectInstanceStateMetricsResponseBodyStateMetrics> stateMetrics;

    public static GetRenderingProjectInstanceStateMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRenderingProjectInstanceStateMetricsResponseBody self = new GetRenderingProjectInstanceStateMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRenderingProjectInstanceStateMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRenderingProjectInstanceStateMetricsResponseBody setStateMetrics(java.util.List<GetRenderingProjectInstanceStateMetricsResponseBodyStateMetrics> stateMetrics) {
        this.stateMetrics = stateMetrics;
        return this;
    }
    public java.util.List<GetRenderingProjectInstanceStateMetricsResponseBodyStateMetrics> getStateMetrics() {
        return this.stateMetrics;
    }

    public static class GetRenderingProjectInstanceStateMetricsResponseBodyStateMetrics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <strong>example:</strong>
         * <p>Idle</p>
         */
        @NameInMap("State")
        public String state;

        public static GetRenderingProjectInstanceStateMetricsResponseBodyStateMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetRenderingProjectInstanceStateMetricsResponseBodyStateMetrics self = new GetRenderingProjectInstanceStateMetricsResponseBodyStateMetrics();
            return TeaModel.build(map, self);
        }

        public GetRenderingProjectInstanceStateMetricsResponseBodyStateMetrics setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public GetRenderingProjectInstanceStateMetricsResponseBodyStateMetrics setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
