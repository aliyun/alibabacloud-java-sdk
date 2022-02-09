// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CheckParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckParametersResponseBody body;

    public static CheckParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckParametersResponse self = new CheckParametersResponse();
        return TeaModel.build(map, self);
    }

    public CheckParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckParametersResponse setBody(CheckParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckParametersResponseBody getBody() {
        return this.body;
    }

}
