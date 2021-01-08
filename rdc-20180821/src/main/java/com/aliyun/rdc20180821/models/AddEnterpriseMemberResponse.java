// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class AddEnterpriseMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddEnterpriseMemberResponseBody body;

    public static AddEnterpriseMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEnterpriseMemberResponse self = new AddEnterpriseMemberResponse();
        return TeaModel.build(map, self);
    }

    public AddEnterpriseMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddEnterpriseMemberResponse setBody(AddEnterpriseMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddEnterpriseMemberResponseBody getBody() {
        return this.body;
    }

}
