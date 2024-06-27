// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeCustVariablePageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustVariablePageResponseBody body;

    public static DescribeCustVariablePageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustVariablePageResponse self = new DescribeCustVariablePageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustVariablePageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustVariablePageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustVariablePageResponse setBody(DescribeCustVariablePageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustVariablePageResponseBody getBody() {
        return this.body;
    }

}
