// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.realtranslationagent20260622.models;

import com.aliyun.tea.*;

public class GetTranslatedFileUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTranslatedFileUrlResponseBody body;

    public static GetTranslatedFileUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTranslatedFileUrlResponse self = new GetTranslatedFileUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetTranslatedFileUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTranslatedFileUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTranslatedFileUrlResponse setBody(GetTranslatedFileUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTranslatedFileUrlResponseBody getBody() {
        return this.body;
    }

}
