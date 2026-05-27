// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAIStaffPreviewUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAIStaffPreviewUrlResponseBody body;

    public static GetAIStaffPreviewUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIStaffPreviewUrlResponse self = new GetAIStaffPreviewUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAIStaffPreviewUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAIStaffPreviewUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAIStaffPreviewUrlResponse setBody(GetAIStaffPreviewUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIStaffPreviewUrlResponseBody getBody() {
        return this.body;
    }

}
