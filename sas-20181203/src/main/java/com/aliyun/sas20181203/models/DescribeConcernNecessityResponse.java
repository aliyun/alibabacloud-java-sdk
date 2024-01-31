// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeConcernNecessityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConcernNecessityResponseBody body;

    public static DescribeConcernNecessityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConcernNecessityResponse self = new DescribeConcernNecessityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConcernNecessityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConcernNecessityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConcernNecessityResponse setBody(DescribeConcernNecessityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConcernNecessityResponseBody getBody() {
        return this.body;
    }

}
