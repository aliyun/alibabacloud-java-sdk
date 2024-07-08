// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetMetricsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;timestamp&quot;:1548777660000,&quot;userId&quot;:&quot;120886317861****&quot;,&quot;instanceId&quot;:&quot;i-abc****&quot;,&quot;Minimum&quot;:9.92,&quot;Average&quot;:9.92,&quot;Maximum&quot;:9.92}]</p>
     */
    @NameInMap("DataPoints")
    public String dataPoints;

    /**
     * <strong>example:</strong>
     * <p>Succeed</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>15761485350009dd70bb64cff1f0fff750b08ffff073be5fb1e785e2b020f1a949d5ea14aea7fed82f01dd8****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetricsResponseBody self = new GetMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetricsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMetricsResponseBody setDataPoints(String dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }
    public String getDataPoints() {
        return this.dataPoints;
    }

    public GetMetricsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMetricsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetMetricsResponseBody setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public GetMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetricsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
