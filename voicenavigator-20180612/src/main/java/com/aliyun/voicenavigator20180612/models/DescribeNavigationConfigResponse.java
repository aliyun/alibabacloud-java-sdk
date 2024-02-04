// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeNavigationConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNavigationConfigResponseBody body;

    public static DescribeNavigationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNavigationConfigResponse self = new DescribeNavigationConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNavigationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNavigationConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNavigationConfigResponse setBody(DescribeNavigationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNavigationConfigResponseBody getBody() {
        return this.body;
    }

}
