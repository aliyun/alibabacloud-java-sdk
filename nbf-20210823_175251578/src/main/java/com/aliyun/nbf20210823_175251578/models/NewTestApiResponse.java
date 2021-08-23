// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210823_175251578.models;

import com.aliyun.tea.*;

public class NewTestApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public NewTestApiResponseBody body;

    public static NewTestApiResponse build(java.util.Map<String, ?> map) throws Exception {
        NewTestApiResponse self = new NewTestApiResponse();
        return TeaModel.build(map, self);
    }

    public NewTestApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NewTestApiResponse setBody(NewTestApiResponseBody body) {
        this.body = body;
        return this;
    }
    public NewTestApiResponseBody getBody() {
        return this.body;
    }

}
