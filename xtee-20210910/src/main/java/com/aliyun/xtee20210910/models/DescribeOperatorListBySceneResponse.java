// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOperatorListBySceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOperatorListBySceneResponseBody body;

    public static DescribeOperatorListBySceneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperatorListBySceneResponse self = new DescribeOperatorListBySceneResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOperatorListBySceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOperatorListBySceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOperatorListBySceneResponse setBody(DescribeOperatorListBySceneResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOperatorListBySceneResponseBody getBody() {
        return this.body;
    }

}
