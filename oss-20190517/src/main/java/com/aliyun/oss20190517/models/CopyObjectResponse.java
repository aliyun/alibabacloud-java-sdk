// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class CopyObjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CopyObjectResponseBody body;

    public static CopyObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyObjectResponse self = new CopyObjectResponse();
        return TeaModel.build(map, self);
    }

    public CopyObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyObjectResponse setBody(CopyObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyObjectResponseBody getBody() {
        return this.body;
    }

}
