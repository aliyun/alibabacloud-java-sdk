// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeCloudMonitorAgentStatusesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudMonitorAgentStatusesResponseBody body;

    public static DescribeCloudMonitorAgentStatusesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudMonitorAgentStatusesResponse self = new DescribeCloudMonitorAgentStatusesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudMonitorAgentStatusesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudMonitorAgentStatusesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudMonitorAgentStatusesResponse setBody(DescribeCloudMonitorAgentStatusesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudMonitorAgentStatusesResponseBody getBody() {
        return this.body;
    }

}
