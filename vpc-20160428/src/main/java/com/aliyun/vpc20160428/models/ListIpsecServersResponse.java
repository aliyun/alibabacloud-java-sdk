// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListIpsecServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListIpsecServersResponseBody body;

    public static ListIpsecServersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpsecServersResponse self = new ListIpsecServersResponse();
        return TeaModel.build(map, self);
    }

    public ListIpsecServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpsecServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIpsecServersResponse setBody(ListIpsecServersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpsecServersResponseBody getBody() {
        return this.body;
    }

}
