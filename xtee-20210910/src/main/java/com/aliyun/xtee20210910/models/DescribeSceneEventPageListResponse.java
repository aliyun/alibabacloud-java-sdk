// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSceneEventPageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSceneEventPageListResponseBody body;

    public static DescribeSceneEventPageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneEventPageListResponse self = new DescribeSceneEventPageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSceneEventPageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSceneEventPageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSceneEventPageListResponse setBody(DescribeSceneEventPageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSceneEventPageListResponseBody getBody() {
        return this.body;
    }

}
