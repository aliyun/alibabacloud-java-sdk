// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class SaveFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveFileResponseBody body;

    public static SaveFileResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveFileResponse self = new SaveFileResponse();
        return TeaModel.build(map, self);
    }

    public SaveFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveFileResponse setBody(SaveFileResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveFileResponseBody getBody() {
        return this.body;
    }

}
