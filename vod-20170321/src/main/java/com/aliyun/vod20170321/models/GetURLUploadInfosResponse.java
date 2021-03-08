// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetURLUploadInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetURLUploadInfosResponseBody body;

    public static GetURLUploadInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        GetURLUploadInfosResponse self = new GetURLUploadInfosResponse();
        return TeaModel.build(map, self);
    }

    public GetURLUploadInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetURLUploadInfosResponse setBody(GetURLUploadInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public GetURLUploadInfosResponseBody getBody() {
        return this.body;
    }

}
