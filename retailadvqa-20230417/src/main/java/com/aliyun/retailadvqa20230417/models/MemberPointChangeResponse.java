// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class MemberPointChangeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MemberPointChangeResponseBody body;

    public static MemberPointChangeResponse build(java.util.Map<String, ?> map) throws Exception {
        MemberPointChangeResponse self = new MemberPointChangeResponse();
        return TeaModel.build(map, self);
    }

    public MemberPointChangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MemberPointChangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MemberPointChangeResponse setBody(MemberPointChangeResponseBody body) {
        this.body = body;
        return this;
    }
    public MemberPointChangeResponseBody getBody() {
        return this.body;
    }

}
