// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class CreatePtsSceneBaseLineFromReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePtsSceneBaseLineFromReportResponseBody body;

    public static CreatePtsSceneBaseLineFromReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePtsSceneBaseLineFromReportResponse self = new CreatePtsSceneBaseLineFromReportResponse();
        return TeaModel.build(map, self);
    }

    public CreatePtsSceneBaseLineFromReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePtsSceneBaseLineFromReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePtsSceneBaseLineFromReportResponse setBody(CreatePtsSceneBaseLineFromReportResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePtsSceneBaseLineFromReportResponseBody getBody() {
        return this.body;
    }

}
