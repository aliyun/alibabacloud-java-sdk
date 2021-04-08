// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVideoIPCObjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectVideoIPCObjectResponseBody body;

    public static DetectVideoIPCObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoIPCObjectResponse self = new DetectVideoIPCObjectResponse();
        return TeaModel.build(map, self);
    }

    public DetectVideoIPCObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectVideoIPCObjectResponse setBody(DetectVideoIPCObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectVideoIPCObjectResponseBody getBody() {
        return this.body;
    }

}
