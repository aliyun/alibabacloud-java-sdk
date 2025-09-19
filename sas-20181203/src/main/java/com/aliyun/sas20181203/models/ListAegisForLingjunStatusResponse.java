// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAegisForLingjunStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAegisForLingjunStatusResponseBody body;

    public static ListAegisForLingjunStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAegisForLingjunStatusResponse self = new ListAegisForLingjunStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListAegisForLingjunStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAegisForLingjunStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAegisForLingjunStatusResponse setBody(ListAegisForLingjunStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAegisForLingjunStatusResponseBody getBody() {
        return this.body;
    }

}
