// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class TranslateChannelDraftResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TranslateChannelDraftResponseBody body;

    public static TranslateChannelDraftResponse build(java.util.Map<String, ?> map) throws Exception {
        TranslateChannelDraftResponse self = new TranslateChannelDraftResponse();
        return TeaModel.build(map, self);
    }

    public TranslateChannelDraftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TranslateChannelDraftResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TranslateChannelDraftResponse setBody(TranslateChannelDraftResponseBody body) {
        this.body = body;
        return this;
    }
    public TranslateChannelDraftResponseBody getBody() {
        return this.body;
    }

}
