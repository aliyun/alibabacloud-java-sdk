// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterSampleMetricsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SampleMetricList")
    public java.util.List<String> sampleMetricList;

    @NameInMap("SamplerMap")
    public java.util.Map<String, ?> samplerMap;

    @NameInMap("Success")
    public Boolean success;

    public static GetJMeterSampleMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJMeterSampleMetricsResponseBody self = new GetJMeterSampleMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJMeterSampleMetricsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetJMeterSampleMetricsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJMeterSampleMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJMeterSampleMetricsResponseBody setSampleMetricList(java.util.List<String> sampleMetricList) {
        this.sampleMetricList = sampleMetricList;
        return this;
    }
    public java.util.List<String> getSampleMetricList() {
        return this.sampleMetricList;
    }

    public GetJMeterSampleMetricsResponseBody setSamplerMap(java.util.Map<String, ?> samplerMap) {
        this.samplerMap = samplerMap;
        return this;
    }
    public java.util.Map<String, ?> getSamplerMap() {
        return this.samplerMap;
    }

    public GetJMeterSampleMetricsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
