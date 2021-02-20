// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ResendPromoteResourceAccountEmailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResendPromoteResourceAccountEmailResponseBody body;

    public static ResendPromoteResourceAccountEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        ResendPromoteResourceAccountEmailResponse self = new ResendPromoteResourceAccountEmailResponse();
        return TeaModel.build(map, self);
    }

    public ResendPromoteResourceAccountEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResendPromoteResourceAccountEmailResponse setBody(ResendPromoteResourceAccountEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public ResendPromoteResourceAccountEmailResponseBody getBody() {
        return this.body;
    }

}
