// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetImageObjectDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageObjectDetectionResponseBody body;

    public static GetImageObjectDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageObjectDetectionResponse self = new GetImageObjectDetectionResponse();
        return TeaModel.build(map, self);
    }

    public GetImageObjectDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageObjectDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageObjectDetectionResponse setBody(GetImageObjectDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageObjectDetectionResponseBody getBody() {
        return this.body;
    }

}
