// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListPackageKnowledgesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPackageKnowledgesResponseBody body;

    public static ListPackageKnowledgesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPackageKnowledgesResponse self = new ListPackageKnowledgesResponse();
        return TeaModel.build(map, self);
    }

    public ListPackageKnowledgesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPackageKnowledgesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPackageKnowledgesResponse setBody(ListPackageKnowledgesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPackageKnowledgesResponseBody getBody() {
        return this.body;
    }

}
