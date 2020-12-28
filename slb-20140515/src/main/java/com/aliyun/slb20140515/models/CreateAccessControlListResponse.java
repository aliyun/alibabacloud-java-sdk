// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateAccessControlListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAccessControlListResponseBody body;

    public static CreateAccessControlListResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessControlListResponse self = new CreateAccessControlListResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccessControlListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccessControlListResponse setBody(CreateAccessControlListResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccessControlListResponseBody getBody() {
        return this.body;
    }

}
