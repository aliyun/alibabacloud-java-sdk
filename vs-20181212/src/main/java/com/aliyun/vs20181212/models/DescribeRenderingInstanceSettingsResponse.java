// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeRenderingInstanceSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRenderingInstanceSettingsResponseBody body;

    public static DescribeRenderingInstanceSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRenderingInstanceSettingsResponse self = new DescribeRenderingInstanceSettingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRenderingInstanceSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRenderingInstanceSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRenderingInstanceSettingsResponse setBody(DescribeRenderingInstanceSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRenderingInstanceSettingsResponseBody getBody() {
        return this.body;
    }

}
