// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetInstanceMetricsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PodMetrics")
    public java.util.List<GetInstanceMetricsResponseBodyPodMetrics> podMetrics;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceMetricsResponseBody self = new GetInstanceMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceMetricsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceMetricsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceMetricsResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceMetricsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceMetricsResponseBody setPodMetrics(java.util.List<GetInstanceMetricsResponseBodyPodMetrics> podMetrics) {
        this.podMetrics = podMetrics;
        return this;
    }
    public java.util.List<GetInstanceMetricsResponseBodyPodMetrics> getPodMetrics() {
        return this.podMetrics;
    }

    public GetInstanceMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceMetricsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceMetricsResponseBodyPodMetricsMetrics extends TeaModel {
        @NameInMap("Time")
        public Long time;

        @NameInMap("Value")
        public Float value;

        public static GetInstanceMetricsResponseBodyPodMetricsMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceMetricsResponseBodyPodMetricsMetrics self = new GetInstanceMetricsResponseBodyPodMetricsMetrics();
            return TeaModel.build(map, self);
        }

        public GetInstanceMetricsResponseBodyPodMetricsMetrics setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public GetInstanceMetricsResponseBodyPodMetricsMetrics setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class GetInstanceMetricsResponseBodyPodMetrics extends TeaModel {
        @NameInMap("Metrics")
        public java.util.List<GetInstanceMetricsResponseBodyPodMetricsMetrics> metrics;

        @NameInMap("PodId")
        public String podId;

        public static GetInstanceMetricsResponseBodyPodMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceMetricsResponseBodyPodMetrics self = new GetInstanceMetricsResponseBodyPodMetrics();
            return TeaModel.build(map, self);
        }

        public GetInstanceMetricsResponseBodyPodMetrics setMetrics(java.util.List<GetInstanceMetricsResponseBodyPodMetricsMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<GetInstanceMetricsResponseBodyPodMetricsMetrics> getMetrics() {
            return this.metrics;
        }

        public GetInstanceMetricsResponseBodyPodMetrics setPodId(String podId) {
            this.podId = podId;
            return this;
        }
        public String getPodId() {
            return this.podId;
        }

    }

}
