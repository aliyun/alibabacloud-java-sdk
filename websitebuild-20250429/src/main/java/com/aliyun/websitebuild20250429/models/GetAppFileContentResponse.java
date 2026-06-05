// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppFileContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppFileContentResponseBody body;

    public static GetAppFileContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppFileContentResponse self = new GetAppFileContentResponse();
        return TeaModel.build(map, self);
    }

    public GetAppFileContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppFileContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppFileContentResponse setBody(GetAppFileContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppFileContentResponseBody getBody() {
        return this.body;
    }

}
