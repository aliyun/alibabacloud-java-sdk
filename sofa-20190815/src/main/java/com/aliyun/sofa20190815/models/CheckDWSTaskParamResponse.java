// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckDWSTaskParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckDWSTaskParamResponseBody body;

    public static CheckDWSTaskParamResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDWSTaskParamResponse self = new CheckDWSTaskParamResponse();
        return TeaModel.build(map, self);
    }

    public CheckDWSTaskParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDWSTaskParamResponse setBody(CheckDWSTaskParamResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDWSTaskParamResponseBody getBody() {
        return this.body;
    }

}
