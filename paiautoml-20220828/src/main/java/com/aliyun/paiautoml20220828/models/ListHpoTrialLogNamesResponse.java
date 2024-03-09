// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class ListHpoTrialLogNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHpoTrialLogNamesResponseBody body;

    public static ListHpoTrialLogNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHpoTrialLogNamesResponse self = new ListHpoTrialLogNamesResponse();
        return TeaModel.build(map, self);
    }

    public ListHpoTrialLogNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHpoTrialLogNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHpoTrialLogNamesResponse setBody(ListHpoTrialLogNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHpoTrialLogNamesResponseBody getBody() {
        return this.body;
    }

}
