// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DisableInstancePublicAccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableInstancePublicAccessResponseBody body;

    public static DisableInstancePublicAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableInstancePublicAccessResponse self = new DisableInstancePublicAccessResponse();
        return TeaModel.build(map, self);
    }

    public DisableInstancePublicAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableInstancePublicAccessResponse setBody(DisableInstancePublicAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableInstancePublicAccessResponseBody getBody() {
        return this.body;
    }

}
