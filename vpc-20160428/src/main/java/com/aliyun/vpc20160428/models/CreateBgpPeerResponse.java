// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateBgpPeerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBgpPeerResponseBody body;

    public static CreateBgpPeerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBgpPeerResponse self = new CreateBgpPeerResponse();
        return TeaModel.build(map, self);
    }

    public CreateBgpPeerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBgpPeerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBgpPeerResponse setBody(CreateBgpPeerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBgpPeerResponseBody getBody() {
        return this.body;
    }

}
