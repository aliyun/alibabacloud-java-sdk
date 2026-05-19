// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectClientEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFileProtectClientEventResponseBody body;

    public static ListFileProtectClientEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectClientEventResponse self = new ListFileProtectClientEventResponse();
        return TeaModel.build(map, self);
    }

    public ListFileProtectClientEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFileProtectClientEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFileProtectClientEventResponse setBody(ListFileProtectClientEventResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFileProtectClientEventResponseBody getBody() {
        return this.body;
    }

}
