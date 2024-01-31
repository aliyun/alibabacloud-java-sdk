// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCriteriaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCriteriaResponseBody body;

    public static DescribeCriteriaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCriteriaResponse self = new DescribeCriteriaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCriteriaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCriteriaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCriteriaResponse setBody(DescribeCriteriaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCriteriaResponseBody getBody() {
        return this.body;
    }

}
