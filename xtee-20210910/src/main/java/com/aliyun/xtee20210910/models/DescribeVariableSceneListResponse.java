// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeVariableSceneListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVariableSceneListResponseBody body;

    public static DescribeVariableSceneListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVariableSceneListResponse self = new DescribeVariableSceneListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVariableSceneListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVariableSceneListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVariableSceneListResponse setBody(DescribeVariableSceneListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVariableSceneListResponseBody getBody() {
        return this.body;
    }

}
