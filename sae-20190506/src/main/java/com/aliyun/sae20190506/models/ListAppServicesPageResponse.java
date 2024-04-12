// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppServicesPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppServicesPageResponseBody body;

    public static ListAppServicesPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppServicesPageResponse self = new ListAppServicesPageResponse();
        return TeaModel.build(map, self);
    }

    public ListAppServicesPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppServicesPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppServicesPageResponse setBody(ListAppServicesPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppServicesPageResponseBody getBody() {
        return this.body;
    }

}
