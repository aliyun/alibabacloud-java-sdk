// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListPodRiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPodRiskResponseBody body;

    public static ListPodRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPodRiskResponse self = new ListPodRiskResponse();
        return TeaModel.build(map, self);
    }

    public ListPodRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPodRiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPodRiskResponse setBody(ListPodRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPodRiskResponseBody getBody() {
        return this.body;
    }

}
