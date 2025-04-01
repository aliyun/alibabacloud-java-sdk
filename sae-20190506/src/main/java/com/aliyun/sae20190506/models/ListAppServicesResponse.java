// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppServicesResponseBody body;

    public static ListAppServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppServicesResponse self = new ListAppServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListAppServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppServicesResponse setBody(ListAppServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppServicesResponseBody getBody() {
        return this.body;
    }

}
