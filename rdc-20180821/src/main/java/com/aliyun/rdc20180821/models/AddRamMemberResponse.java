// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class AddRamMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddRamMemberResponseBody body;

    public static AddRamMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRamMemberResponse self = new AddRamMemberResponse();
        return TeaModel.build(map, self);
    }

    public AddRamMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRamMemberResponse setBody(AddRamMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRamMemberResponseBody getBody() {
        return this.body;
    }

}
