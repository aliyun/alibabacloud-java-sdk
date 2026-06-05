// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppSandboxPreviewUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppSandboxPreviewUrlResponseBody body;

    public static GetAppSandboxPreviewUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppSandboxPreviewUrlResponse self = new GetAppSandboxPreviewUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAppSandboxPreviewUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppSandboxPreviewUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppSandboxPreviewUrlResponse setBody(GetAppSandboxPreviewUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppSandboxPreviewUrlResponseBody getBody() {
        return this.body;
    }

}
