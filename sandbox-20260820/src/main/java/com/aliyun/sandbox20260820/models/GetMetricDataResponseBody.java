// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class GetMetricDataResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates success. If the request fails, the corresponding error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The description of the request result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The query results of each metric, along with the corresponding time and grouping information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;period&quot;:60,&quot;startTime&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;endTime&quot;:&quot;2026-11-05T00:02:00Z&quot;,&quot;groupBy&quot;:[&quot;teamID&quot;],&quot;results&quot;:[{&quot;metricName&quot;:&quot;cpuUsedCores&quot;,&quot;unit&quot;:&quot;Core&quot;,&quot;series&quot;:[{&quot;dimensions&quot;:{&quot;teamID&quot;:&quot;70d1c834-0333-58d8-97ac-5336eb9179eb&quot;},&quot;points&quot;:[{&quot;timestamp&quot;:&quot;2026-11-05T00:00:00Z&quot;,&quot;value&quot;:0.25},{&quot;timestamp&quot;:&quot;2026-11-05T00:01:00Z&quot;,&quot;value&quot;:0.5}]}]}]}</p>
     */
    @NameInMap("metricData")
    public MetricData metricData;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-5678-9abc-123456789abc</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetricDataResponseBody self = new GetMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetricDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMetricDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMetricDataResponseBody setMetricData(MetricData metricData) {
        this.metricData = metricData;
        return this;
    }
    public MetricData getMetricData() {
        return this.metricData;
    }

    public GetMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
