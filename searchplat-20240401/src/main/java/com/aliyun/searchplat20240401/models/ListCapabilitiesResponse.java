// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class ListCapabilitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCapabilitiesResponseBody body;

    public static ListCapabilitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCapabilitiesResponse self = new ListCapabilitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListCapabilitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCapabilitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCapabilitiesResponse setBody(ListCapabilitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCapabilitiesResponseBody getBody() {
        return this.body;
    }

}
