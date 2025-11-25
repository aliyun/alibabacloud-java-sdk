// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class DescribeMetricListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<DescribeMetricListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>分析ID: 56dae746-ef55-4f77-8373-cb3594c41457
     * 机器i-bp164ns76pzirbwv0snt分析失败, 失败原因: Not get GPU trace data for &quot;56dae746-ef55-4f77-8373-cb3594c41457&quot; &quot;[&quot;93811&quot;]&quot;!</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DescribeMetricListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricListResponseBody self = new DescribeMetricListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMetricListResponseBody setData(java.util.List<DescribeMetricListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMetricListResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMetricListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMetricListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMetricListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{\&quot;taskExecName\&quot;: \&quot;build-and-deploy\&quot;, \&quot;pipelineName\&quot;: \&quot;pipeline-run-1722909642357\&quot;}</p>
         */
        @NameInMap("labels")
        public String labels;

        /**
         * <strong>example:</strong>
         * <p>sysom_cpu_usage_idle</p>
         */
        @NameInMap("metricName")
        public String metricName;

        @NameInMap("values")
        public java.util.List<java.util.List<String>> values;

        public static DescribeMetricListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricListResponseBodyData self = new DescribeMetricListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMetricListResponseBodyData setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public DescribeMetricListResponseBodyData setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeMetricListResponseBodyData setValues(java.util.List<java.util.List<String>> values) {
            this.values = values;
            return this;
        }
        public java.util.List<java.util.List<String>> getValues() {
            return this.values;
        }

    }

}
