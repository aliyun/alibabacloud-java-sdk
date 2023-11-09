// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMemberResponseBody body;

    public static UpdateMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemberResponse self = new UpdateMemberResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMemberResponse setBody(UpdateMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMemberResponseBody getBody() {
        return this.body;
    }

}
