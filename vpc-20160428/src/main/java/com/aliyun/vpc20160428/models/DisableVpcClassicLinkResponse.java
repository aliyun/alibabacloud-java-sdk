// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DisableVpcClassicLinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableVpcClassicLinkResponseBody body;

    public static DisableVpcClassicLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableVpcClassicLinkResponse self = new DisableVpcClassicLinkResponse();
        return TeaModel.build(map, self);
    }

    public DisableVpcClassicLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableVpcClassicLinkResponse setBody(DisableVpcClassicLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableVpcClassicLinkResponseBody getBody() {
        return this.body;
    }

}
