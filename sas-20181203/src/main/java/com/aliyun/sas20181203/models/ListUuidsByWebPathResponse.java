// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUuidsByWebPathResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUuidsByWebPathResponseBody body;

    public static ListUuidsByWebPathResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUuidsByWebPathResponse self = new ListUuidsByWebPathResponse();
        return TeaModel.build(map, self);
    }

    public ListUuidsByWebPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUuidsByWebPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUuidsByWebPathResponse setBody(ListUuidsByWebPathResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUuidsByWebPathResponseBody getBody() {
        return this.body;
    }

}
