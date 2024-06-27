// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAuthSceneListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuthSceneListResponseBody body;

    public static DescribeAuthSceneListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthSceneListResponse self = new DescribeAuthSceneListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuthSceneListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuthSceneListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuthSceneListResponse setBody(DescribeAuthSceneListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuthSceneListResponseBody getBody() {
        return this.body;
    }

}
