// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class UpdateMessageLanguageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMessageLanguageResponseBody body;

    public static UpdateMessageLanguageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMessageLanguageResponse self = new UpdateMessageLanguageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMessageLanguageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMessageLanguageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMessageLanguageResponse setBody(UpdateMessageLanguageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMessageLanguageResponseBody getBody() {
        return this.body;
    }

}
