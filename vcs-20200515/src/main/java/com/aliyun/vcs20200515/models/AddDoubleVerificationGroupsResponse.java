// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddDoubleVerificationGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDoubleVerificationGroupsResponseBody body;

    public static AddDoubleVerificationGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDoubleVerificationGroupsResponse self = new AddDoubleVerificationGroupsResponse();
        return TeaModel.build(map, self);
    }

    public AddDoubleVerificationGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDoubleVerificationGroupsResponse setBody(AddDoubleVerificationGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDoubleVerificationGroupsResponseBody getBody() {
        return this.body;
    }

}
