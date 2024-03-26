// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetUploadDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUploadDetailsResponseBody body;

    public static GetUploadDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadDetailsResponse self = new GetUploadDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetUploadDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUploadDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUploadDetailsResponse setBody(GetUploadDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUploadDetailsResponseBody getBody() {
        return this.body;
    }

}
