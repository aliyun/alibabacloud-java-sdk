// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ComAlibabaTccResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ComAlibabaTccResponseBody body;

    public static ComAlibabaTccResponse build(java.util.Map<String, ?> map) throws Exception {
        ComAlibabaTccResponse self = new ComAlibabaTccResponse();
        return TeaModel.build(map, self);
    }

    public ComAlibabaTccResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ComAlibabaTccResponse setBody(ComAlibabaTccResponseBody body) {
        this.body = body;
        return this;
    }
    public ComAlibabaTccResponseBody getBody() {
        return this.body;
    }

}
