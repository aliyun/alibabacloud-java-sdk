// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePreviewDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetScenePreviewDataResponseBody body;

    public static GetScenePreviewDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScenePreviewDataResponse self = new GetScenePreviewDataResponse();
        return TeaModel.build(map, self);
    }

    public GetScenePreviewDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScenePreviewDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScenePreviewDataResponse setBody(GetScenePreviewDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScenePreviewDataResponseBody getBody() {
        return this.body;
    }

}
