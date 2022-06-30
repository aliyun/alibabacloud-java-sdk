// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateCorpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCorpResponseBody body;

    public static UpdateCorpResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCorpResponse self = new UpdateCorpResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCorpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCorpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCorpResponse setBody(UpdateCorpResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCorpResponseBody getBody() {
        return this.body;
    }

}
