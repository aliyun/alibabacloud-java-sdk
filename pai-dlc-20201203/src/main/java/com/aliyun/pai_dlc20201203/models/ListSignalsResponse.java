// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListSignalsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSignalsResponseBody body;

    public static ListSignalsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSignalsResponse self = new ListSignalsResponse();
        return TeaModel.build(map, self);
    }

    public ListSignalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSignalsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSignalsResponse setBody(ListSignalsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSignalsResponseBody getBody() {
        return this.body;
    }

}
