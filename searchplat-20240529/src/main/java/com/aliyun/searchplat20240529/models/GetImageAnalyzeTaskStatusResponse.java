// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetImageAnalyzeTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageAnalyzeTaskStatusResponseBody body;

    public static GetImageAnalyzeTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageAnalyzeTaskStatusResponse self = new GetImageAnalyzeTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetImageAnalyzeTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageAnalyzeTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageAnalyzeTaskStatusResponse setBody(GetImageAnalyzeTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageAnalyzeTaskStatusResponseBody getBody() {
        return this.body;
    }

}
