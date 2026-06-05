// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SubmitAppSeoIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAppSeoIndexResponseBody body;

    public static SubmitAppSeoIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAppSeoIndexResponse self = new SubmitAppSeoIndexResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAppSeoIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAppSeoIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAppSeoIndexResponse setBody(SubmitAppSeoIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAppSeoIndexResponseBody getBody() {
        return this.body;
    }

}
