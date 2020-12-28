// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRoleResponseBody body;

    public static GetRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoleResponse self = new GetRoleResponse();
        return TeaModel.build(map, self);
    }

    public GetRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoleResponse setBody(GetRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoleResponseBody getBody() {
        return this.body;
    }

}
