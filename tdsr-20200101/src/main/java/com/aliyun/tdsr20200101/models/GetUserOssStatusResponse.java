// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetUserOssStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserOssStatusResponseBody body;

    public static GetUserOssStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserOssStatusResponse self = new GetUserOssStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetUserOssStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserOssStatusResponse setBody(GetUserOssStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserOssStatusResponseBody getBody() {
        return this.body;
    }

}
