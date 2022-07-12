// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListEtlMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListEtlMetaResponseBody body;

    public static ListEtlMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEtlMetaResponse self = new ListEtlMetaResponse();
        return TeaModel.build(map, self);
    }

    public ListEtlMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEtlMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEtlMetaResponse setBody(ListEtlMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEtlMetaResponseBody getBody() {
        return this.body;
    }

}
