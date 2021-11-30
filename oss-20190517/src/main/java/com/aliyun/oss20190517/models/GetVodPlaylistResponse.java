// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetVodPlaylistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public java.io.InputStream body;

    public static GetVodPlaylistResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVodPlaylistResponse self = new GetVodPlaylistResponse();
        return TeaModel.build(map, self);
    }

    public GetVodPlaylistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVodPlaylistResponse setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
