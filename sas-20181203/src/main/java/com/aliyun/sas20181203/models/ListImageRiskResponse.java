// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListImageRiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListImageRiskResponseBody body;

    public static ListImageRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageRiskResponse self = new ListImageRiskResponse();
        return TeaModel.build(map, self);
    }

    public ListImageRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageRiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImageRiskResponse setBody(ListImageRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageRiskResponseBody getBody() {
        return this.body;
    }

}
