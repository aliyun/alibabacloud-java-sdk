// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppPublishStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppPublishStatusResponseBody body;

    public static GetAppPublishStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppPublishStatusResponse self = new GetAppPublishStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetAppPublishStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppPublishStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppPublishStatusResponse setBody(GetAppPublishStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppPublishStatusResponseBody getBody() {
        return this.body;
    }

}
