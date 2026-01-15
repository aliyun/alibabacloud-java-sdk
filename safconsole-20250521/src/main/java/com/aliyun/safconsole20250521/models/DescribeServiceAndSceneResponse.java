// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeServiceAndSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServiceAndSceneResponseBody body;

    public static DescribeServiceAndSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceAndSceneResponse self = new DescribeServiceAndSceneResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceAndSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceAndSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceAndSceneResponse setBody(DescribeServiceAndSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceAndSceneResponseBody getBody() {
        return this.body;
    }

}
