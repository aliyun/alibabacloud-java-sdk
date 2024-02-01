// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListTrafficMirrorSessionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTrafficMirrorSessionsResponseBody body;

    public static ListTrafficMirrorSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficMirrorSessionsResponse self = new ListTrafficMirrorSessionsResponse();
        return TeaModel.build(map, self);
    }

    public ListTrafficMirrorSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrafficMirrorSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrafficMirrorSessionsResponse setBody(ListTrafficMirrorSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrafficMirrorSessionsResponseBody getBody() {
        return this.body;
    }

}
