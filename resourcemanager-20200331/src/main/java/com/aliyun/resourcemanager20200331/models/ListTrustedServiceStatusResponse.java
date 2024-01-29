// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListTrustedServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrustedServiceStatusResponseBody body;

    public static ListTrustedServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrustedServiceStatusResponse self = new ListTrustedServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListTrustedServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrustedServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrustedServiceStatusResponse setBody(ListTrustedServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrustedServiceStatusResponseBody getBody() {
        return this.body;
    }

}
