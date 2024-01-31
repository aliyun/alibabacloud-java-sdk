// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateGadInstanceMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGadInstanceMemberResponseBody body;

    public static CreateGadInstanceMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGadInstanceMemberResponse self = new CreateGadInstanceMemberResponse();
        return TeaModel.build(map, self);
    }

    public CreateGadInstanceMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGadInstanceMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGadInstanceMemberResponse setBody(CreateGadInstanceMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGadInstanceMemberResponseBody getBody() {
        return this.body;
    }

}
