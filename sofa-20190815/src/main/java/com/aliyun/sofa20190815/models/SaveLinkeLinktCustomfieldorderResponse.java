// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeLinktCustomfieldorderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveLinkeLinktCustomfieldorderResponseBody body;

    public static SaveLinkeLinktCustomfieldorderResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeLinktCustomfieldorderResponse self = new SaveLinkeLinktCustomfieldorderResponse();
        return TeaModel.build(map, self);
    }

    public SaveLinkeLinktCustomfieldorderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveLinkeLinktCustomfieldorderResponse setBody(SaveLinkeLinktCustomfieldorderResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveLinkeLinktCustomfieldorderResponseBody getBody() {
        return this.body;
    }

}
