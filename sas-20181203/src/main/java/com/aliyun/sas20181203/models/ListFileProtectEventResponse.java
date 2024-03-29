// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFileProtectEventResponseBody body;

    public static ListFileProtectEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectEventResponse self = new ListFileProtectEventResponse();
        return TeaModel.build(map, self);
    }

    public ListFileProtectEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFileProtectEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFileProtectEventResponse setBody(ListFileProtectEventResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFileProtectEventResponseBody getBody() {
        return this.body;
    }

}
