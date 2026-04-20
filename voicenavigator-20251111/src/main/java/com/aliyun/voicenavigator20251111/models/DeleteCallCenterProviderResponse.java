// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class DeleteCallCenterProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCallCenterProviderResponseBody body;

    public static DeleteCallCenterProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCallCenterProviderResponse self = new DeleteCallCenterProviderResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCallCenterProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCallCenterProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCallCenterProviderResponse setBody(DeleteCallCenterProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCallCenterProviderResponseBody getBody() {
        return this.body;
    }

}
