// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetCrossdomainContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetCrossdomainContentResponseBody body;

    public static SetCrossdomainContentResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCrossdomainContentResponse self = new SetCrossdomainContentResponse();
        return TeaModel.build(map, self);
    }

    public SetCrossdomainContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCrossdomainContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCrossdomainContentResponse setBody(SetCrossdomainContentResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCrossdomainContentResponseBody getBody() {
        return this.body;
    }

}
