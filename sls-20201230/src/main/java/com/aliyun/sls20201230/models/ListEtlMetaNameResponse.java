// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListEtlMetaNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListEtlMetaNameResponseBody body;

    public static ListEtlMetaNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEtlMetaNameResponse self = new ListEtlMetaNameResponse();
        return TeaModel.build(map, self);
    }

    public ListEtlMetaNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEtlMetaNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEtlMetaNameResponse setBody(ListEtlMetaNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEtlMetaNameResponseBody getBody() {
        return this.body;
    }

}
