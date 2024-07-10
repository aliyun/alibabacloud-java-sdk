// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeWebInstanceLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebApplicationInstanceLogsBody body;

    public static DescribeWebInstanceLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebInstanceLogsResponse self = new DescribeWebInstanceLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebInstanceLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebInstanceLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebInstanceLogsResponse setBody(WebApplicationInstanceLogsBody body) {
        this.body = body;
        return this;
    }
    public WebApplicationInstanceLogsBody getBody() {
        return this.body;
    }

}
