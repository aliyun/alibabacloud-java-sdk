// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUuidsByAppIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUuidsByAppIdResponseBody body;

    public static ListUuidsByAppIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUuidsByAppIdResponse self = new ListUuidsByAppIdResponse();
        return TeaModel.build(map, self);
    }

    public ListUuidsByAppIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUuidsByAppIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUuidsByAppIdResponse setBody(ListUuidsByAppIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUuidsByAppIdResponseBody getBody() {
        return this.body;
    }

}
