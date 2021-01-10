// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushDTXWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PushDTXWhitelistResponseBody body;

    public static PushDTXWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        PushDTXWhitelistResponse self = new PushDTXWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public PushDTXWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushDTXWhitelistResponse setBody(PushDTXWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public PushDTXWhitelistResponseBody getBody() {
        return this.body;
    }

}
