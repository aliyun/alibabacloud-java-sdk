// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSceneAllEventNameCodeListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSceneAllEventNameCodeListResponseBody body;

    public static DescribeSceneAllEventNameCodeListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneAllEventNameCodeListResponse self = new DescribeSceneAllEventNameCodeListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSceneAllEventNameCodeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSceneAllEventNameCodeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSceneAllEventNameCodeListResponse setBody(DescribeSceneAllEventNameCodeListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSceneAllEventNameCodeListResponseBody getBody() {
        return this.body;
    }

}
