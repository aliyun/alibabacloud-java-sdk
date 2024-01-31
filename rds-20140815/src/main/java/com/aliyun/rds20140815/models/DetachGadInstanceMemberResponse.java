// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DetachGadInstanceMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachGadInstanceMemberResponseBody body;

    public static DetachGadInstanceMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachGadInstanceMemberResponse self = new DetachGadInstanceMemberResponse();
        return TeaModel.build(map, self);
    }

    public DetachGadInstanceMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachGadInstanceMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachGadInstanceMemberResponse setBody(DetachGadInstanceMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachGadInstanceMemberResponseBody getBody() {
        return this.body;
    }

}
