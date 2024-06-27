// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeCustVariableConfigListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustVariableConfigListResponseBody body;

    public static DescribeCustVariableConfigListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustVariableConfigListResponse self = new DescribeCustVariableConfigListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustVariableConfigListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustVariableConfigListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustVariableConfigListResponse setBody(DescribeCustVariableConfigListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustVariableConfigListResponseBody getBody() {
        return this.body;
    }

}
