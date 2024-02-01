// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class EnableVpcClassicLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableVpcClassicLinkResponseBody body;

    public static EnableVpcClassicLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableVpcClassicLinkResponse self = new EnableVpcClassicLinkResponse();
        return TeaModel.build(map, self);
    }

    public EnableVpcClassicLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableVpcClassicLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableVpcClassicLinkResponse setBody(EnableVpcClassicLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableVpcClassicLinkResponseBody getBody() {
        return this.body;
    }

}
