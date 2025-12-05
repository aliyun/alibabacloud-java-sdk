// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterSampleMetricsResponseBody extends TeaModel {
    /**
     * <p>The system status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message. If the request was successful, this parameter is left empty.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A8E16480-15C1-555A-922F-B736A005E52D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The metrics of the samplers.</p>
     */
    @NameInMap("SampleMetricList")
    public java.util.List<String> sampleMetricList;

    /**
     * <p>The sampler list. You can find the sampler to be queried based on this list.</p>
     * 
     * <strong>example:</strong>
     * <p>{0:&quot;Http Request&quot;}</p>
     */
    @NameInMap("SamplerMap")
    public java.util.Map<String, ?> samplerMap;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
