// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeSecurityAgentStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSecurityAgentStatusResponseBody body;

    public static DescribeSecurityAgentStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityAgentStatusResponse self = new DescribeSecurityAgentStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityAgentStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityAgentStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityAgentStatusResponse setBody(DescribeSecurityAgentStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityAgentStatusResponseBody getBody() {
        return this.body;
    }

}
