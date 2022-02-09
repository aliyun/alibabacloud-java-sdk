// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class OmadsqlfilesumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OmadsqlfilesumResponseBody body;

    public static OmadsqlfilesumResponse build(java.util.Map<String, ?> map) throws Exception {
        OmadsqlfilesumResponse self = new OmadsqlfilesumResponse();
        return TeaModel.build(map, self);
    }

    public OmadsqlfilesumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OmadsqlfilesumResponse setBody(OmadsqlfilesumResponseBody body) {
        this.body = body;
        return this;
    }
    public OmadsqlfilesumResponseBody getBody() {
        return this.body;
    }

}
