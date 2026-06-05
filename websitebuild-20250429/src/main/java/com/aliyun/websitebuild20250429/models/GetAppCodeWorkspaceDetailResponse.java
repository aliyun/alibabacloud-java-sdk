// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppCodeWorkspaceDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppCodeWorkspaceDetailResponseBody body;

    public static GetAppCodeWorkspaceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppCodeWorkspaceDetailResponse self = new GetAppCodeWorkspaceDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetAppCodeWorkspaceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppCodeWorkspaceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppCodeWorkspaceDetailResponse setBody(GetAppCodeWorkspaceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppCodeWorkspaceDetailResponseBody getBody() {
        return this.body;
    }

}
