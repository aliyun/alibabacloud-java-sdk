// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListQueryRaspAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListQueryRaspAppInfoResponseBody body;

    public static ListQueryRaspAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQueryRaspAppInfoResponse self = new ListQueryRaspAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListQueryRaspAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQueryRaspAppInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListQueryRaspAppInfoResponse setBody(ListQueryRaspAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQueryRaspAppInfoResponseBody getBody() {
        return this.body;
    }

}
