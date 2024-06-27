// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeCustVariableDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustVariableDetailResponseBody body;

    public static DescribeCustVariableDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustVariableDetailResponse self = new DescribeCustVariableDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustVariableDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustVariableDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustVariableDetailResponse setBody(DescribeCustVariableDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustVariableDetailResponseBody getBody() {
        return this.body;
    }

}
