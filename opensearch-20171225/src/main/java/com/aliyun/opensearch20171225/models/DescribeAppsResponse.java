// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppsResponseBody body;

    public static DescribeAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsResponse self = new DescribeAppsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppsResponse setBody(DescribeAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppsResponseBody getBody() {
        return this.body;
    }

}
