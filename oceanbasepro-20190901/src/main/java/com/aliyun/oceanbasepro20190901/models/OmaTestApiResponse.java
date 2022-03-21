// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class OmaTestApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OmaTestApiResponseBody body;

    public static OmaTestApiResponse build(java.util.Map<String, ?> map) throws Exception {
        OmaTestApiResponse self = new OmaTestApiResponse();
        return TeaModel.build(map, self);
    }

    public OmaTestApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OmaTestApiResponse setBody(OmaTestApiResponseBody body) {
        this.body = body;
        return this;
    }
    public OmaTestApiResponseBody getBody() {
        return this.body;
    }

}
