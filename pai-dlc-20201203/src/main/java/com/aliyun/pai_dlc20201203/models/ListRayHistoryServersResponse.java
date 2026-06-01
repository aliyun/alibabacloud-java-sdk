// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListRayHistoryServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRayHistoryServersResponseBody body;

    public static ListRayHistoryServersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRayHistoryServersResponse self = new ListRayHistoryServersResponse();
        return TeaModel.build(map, self);
    }

    public ListRayHistoryServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRayHistoryServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRayHistoryServersResponse setBody(ListRayHistoryServersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRayHistoryServersResponseBody getBody() {
        return this.body;
    }

}
