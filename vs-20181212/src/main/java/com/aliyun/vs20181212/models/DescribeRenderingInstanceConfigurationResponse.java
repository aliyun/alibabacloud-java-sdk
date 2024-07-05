// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRenderingInstanceConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRenderingInstanceConfigurationResponseBody body;

    public static DescribeRenderingInstanceConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenderingInstanceConfigurationResponse self = new DescribeRenderingInstanceConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRenderingInstanceConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRenderingInstanceConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRenderingInstanceConfigurationResponse setBody(DescribeRenderingInstanceConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRenderingInstanceConfigurationResponseBody getBody() {
        return this.body;
    }

}
