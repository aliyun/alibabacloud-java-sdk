// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeEngineVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEngineVersionResponseBody body;

    public static DescribeEngineVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEngineVersionResponse self = new DescribeEngineVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEngineVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEngineVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEngineVersionResponse setBody(DescribeEngineVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEngineVersionResponseBody getBody() {
        return this.body;
    }

}
