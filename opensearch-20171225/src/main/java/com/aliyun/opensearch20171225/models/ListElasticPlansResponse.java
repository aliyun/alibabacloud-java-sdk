// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListElasticPlansResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListElasticPlansResponseBody body;

    public static ListElasticPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        ListElasticPlansResponse self = new ListElasticPlansResponse();
        return TeaModel.build(map, self);
    }

    public ListElasticPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListElasticPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListElasticPlansResponse setBody(ListElasticPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public ListElasticPlansResponseBody getBody() {
        return this.body;
    }

}
