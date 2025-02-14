// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUserVpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserVpcResponseBody body;

    public static ListUserVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserVpcResponse self = new ListUserVpcResponse();
        return TeaModel.build(map, self);
    }

    public ListUserVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserVpcResponse setBody(ListUserVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserVpcResponseBody getBody() {
        return this.body;
    }

}
