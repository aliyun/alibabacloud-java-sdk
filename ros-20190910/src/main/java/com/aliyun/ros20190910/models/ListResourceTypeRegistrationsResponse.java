// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypeRegistrationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceTypeRegistrationsResponseBody body;

    public static ListResourceTypeRegistrationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypeRegistrationsResponse self = new ListResourceTypeRegistrationsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceTypeRegistrationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceTypeRegistrationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceTypeRegistrationsResponse setBody(ListResourceTypeRegistrationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceTypeRegistrationsResponseBody getBody() {
        return this.body;
    }

}
