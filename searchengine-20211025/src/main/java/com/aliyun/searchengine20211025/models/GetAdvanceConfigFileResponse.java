// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetAdvanceConfigFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAdvanceConfigFileResponseBody body;

    public static GetAdvanceConfigFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAdvanceConfigFileResponse self = new GetAdvanceConfigFileResponse();
        return TeaModel.build(map, self);
    }

    public GetAdvanceConfigFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAdvanceConfigFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAdvanceConfigFileResponse setBody(GetAdvanceConfigFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAdvanceConfigFileResponseBody getBody() {
        return this.body;
    }

}
