// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetUploadDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetUploadDetailsResponse setBody(GetUploadDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUploadDetailsResponseBody getBody() {
        return this.body;
    }

}
