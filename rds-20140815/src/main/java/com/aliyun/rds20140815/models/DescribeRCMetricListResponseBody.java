// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCMetricListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The monitoring data.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;timestamp\&quot;:1722909960000,\&quot;instanceId\&quot;:\&quot;rc-dh2jf9n6j4s14926****\&quot;,\&quot;userId\&quot;:\&quot;1695619988087373\&quot;,\&quot;Minimum\&quot;:0.097,\&quot;Maximum\&quot;:0.097,\&quot;Average\&quot;:0.097},{\&quot;timestamp\&quot;:1722910020000,\&quot;instanceId\&quot;:\&quot;rc-dh2jf9n6j4s14926****\&quot;,\&quot;userId\&quot;:\&quot;1695619988087373\&quot;,\&quot;Minimum\&quot;:0.093,\&quot;Maximum\&quot;:0.093,\&quot;Average\&quot;:0.093}]</p>
     */
    @NameInMap("Datapoints")
    public String datapoints;

    /**
     * <p>The message that is returned for the request.</p>
     * <blockquote>
     * <p> If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message that contains information such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>6178f1825f9fb76ce0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The statistical period of the monitoring data.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EA2D4F34-01A7-46EB-A339-D80882135206</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeRCMetricListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCMetricListResponseBody self = new DescribeRCMetricListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCMetricListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRCMetricListResponseBody setDatapoints(String datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public String getDatapoints() {
        return this.datapoints;
    }

    public DescribeRCMetricListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRCMetricListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRCMetricListResponseBody setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeRCMetricListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRCMetricListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
