// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DisableVpcClassicLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DisableVpcClassicLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableVpcClassicLinkResponse setBody(DisableVpcClassicLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableVpcClassicLinkResponseBody getBody() {
        return this.body;
    }

}
