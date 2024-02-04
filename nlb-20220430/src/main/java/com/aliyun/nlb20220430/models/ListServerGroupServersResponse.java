// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListServerGroupServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServerGroupServersResponseBody body;

    public static ListServerGroupServersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupServersResponse self = new ListServerGroupServersResponse();
        return TeaModel.build(map, self);
    }

    public ListServerGroupServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServerGroupServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServerGroupServersResponse setBody(ListServerGroupServersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServerGroupServersResponseBody getBody() {
        return this.body;
    }

}
