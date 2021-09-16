// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetCrossdomainContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetCrossdomainContentResponse setBody(SetCrossdomainContentResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCrossdomainContentResponseBody getBody() {
        return this.body;
    }

}
