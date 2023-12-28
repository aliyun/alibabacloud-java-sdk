// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListPublicTemplateRegistrationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPublicTemplateRegistrationsResponseBody body;

    public static ListPublicTemplateRegistrationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublicTemplateRegistrationsResponse self = new ListPublicTemplateRegistrationsResponse();
        return TeaModel.build(map, self);
    }

    public ListPublicTemplateRegistrationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublicTemplateRegistrationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublicTemplateRegistrationsResponse setBody(ListPublicTemplateRegistrationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublicTemplateRegistrationsResponseBody getBody() {
        return this.body;
    }

}
