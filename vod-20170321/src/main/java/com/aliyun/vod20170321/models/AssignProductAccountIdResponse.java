// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AssignProductAccountIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssignProductAccountIdResponseBody body;

    public static AssignProductAccountIdResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignProductAccountIdResponse self = new AssignProductAccountIdResponse();
        return TeaModel.build(map, self);
    }

    public AssignProductAccountIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignProductAccountIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssignProductAccountIdResponse setBody(AssignProductAccountIdResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignProductAccountIdResponseBody getBody() {
        return this.body;
    }

}
