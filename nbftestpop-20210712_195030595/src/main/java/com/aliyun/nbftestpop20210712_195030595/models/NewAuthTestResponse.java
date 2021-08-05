// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210712_195030595.models;

import com.aliyun.tea.*;

public class NewAuthTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public NewAuthTestResponseBody body;

    public static NewAuthTestResponse build(java.util.Map<String, ?> map) throws Exception {
        NewAuthTestResponse self = new NewAuthTestResponse();
        return TeaModel.build(map, self);
    }

    public NewAuthTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NewAuthTestResponse setBody(NewAuthTestResponseBody body) {
        this.body = body;
        return this;
    }
    public NewAuthTestResponseBody getBody() {
        return this.body;
    }

}
