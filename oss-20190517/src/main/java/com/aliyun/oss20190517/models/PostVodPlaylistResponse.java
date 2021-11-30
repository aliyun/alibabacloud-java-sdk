// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class PostVodPlaylistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static PostVodPlaylistResponse build(java.util.Map<String, ?> map) throws Exception {
        PostVodPlaylistResponse self = new PostVodPlaylistResponse();
        return TeaModel.build(map, self);
    }

    public PostVodPlaylistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
