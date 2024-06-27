// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeExistSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExistSceneResponseBody body;

    public static DescribeExistSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExistSceneResponse self = new DescribeExistSceneResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExistSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExistSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExistSceneResponse setBody(DescribeExistSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExistSceneResponseBody getBody() {
        return this.body;
    }

}
