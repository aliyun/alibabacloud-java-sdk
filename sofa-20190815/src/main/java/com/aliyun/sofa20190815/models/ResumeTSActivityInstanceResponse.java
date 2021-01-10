// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResumeTSActivityInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeTSActivityInstanceResponseBody body;

    public static ResumeTSActivityInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeTSActivityInstanceResponse self = new ResumeTSActivityInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ResumeTSActivityInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeTSActivityInstanceResponse setBody(ResumeTSActivityInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeTSActivityInstanceResponseBody getBody() {
        return this.body;
    }

}
