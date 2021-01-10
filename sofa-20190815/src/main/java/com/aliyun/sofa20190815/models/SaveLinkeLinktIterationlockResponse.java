// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeLinktIterationlockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveLinkeLinktIterationlockResponseBody body;

    public static SaveLinkeLinktIterationlockResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeLinktIterationlockResponse self = new SaveLinkeLinktIterationlockResponse();
        return TeaModel.build(map, self);
    }

    public SaveLinkeLinktIterationlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveLinkeLinktIterationlockResponse setBody(SaveLinkeLinktIterationlockResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveLinkeLinktIterationlockResponseBody getBody() {
        return this.body;
    }

}
