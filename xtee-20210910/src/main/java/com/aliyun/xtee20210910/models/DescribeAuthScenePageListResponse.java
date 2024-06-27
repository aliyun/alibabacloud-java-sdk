// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAuthScenePageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuthScenePageListResponseBody body;

    public static DescribeAuthScenePageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthScenePageListResponse self = new DescribeAuthScenePageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuthScenePageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuthScenePageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuthScenePageListResponse setBody(DescribeAuthScenePageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuthScenePageListResponseBody getBody() {
        return this.body;
    }

}
