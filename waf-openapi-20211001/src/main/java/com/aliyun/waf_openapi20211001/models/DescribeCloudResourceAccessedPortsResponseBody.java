// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCloudResourceAccessedPortsResponseBody extends TeaModel {
    /**
     * <p>The HTTP ports.</p>
     */
    @NameInMap("Http")
    public java.util.List<Integer> http;

    /**
     * <p>The HTTPS ports.</p>
     */
    @NameInMap("Https")
    public java.util.List<Integer> https;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C1823E96-EF4B-5BD2-9E02-1D18****3ED8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCloudResourceAccessedPortsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudResourceAccessedPortsResponseBody self = new DescribeCloudResourceAccessedPortsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudResourceAccessedPortsResponseBody setHttp(java.util.List<Integer> http) {
        this.http = http;
        return this;
    }
    public java.util.List<Integer> getHttp() {
        return this.http;
    }

    public DescribeCloudResourceAccessedPortsResponseBody setHttps(java.util.List<Integer> https) {
        this.https = https;
        return this;
    }
    public java.util.List<Integer> getHttps() {
        return this.https;
    }

    public DescribeCloudResourceAccessedPortsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
