// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qktest20210908.models;

import com.aliyun.tea.*;

public class MapTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MapTestResponseBody body;

    public static MapTestResponse build(java.util.Map<String, ?> map) throws Exception {
        MapTestResponse self = new MapTestResponse();
        return TeaModel.build(map, self);
    }

    public MapTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MapTestResponse setBody(MapTestResponseBody body) {
        this.body = body;
        return this;
    }
    public MapTestResponseBody getBody() {
        return this.body;
    }

}
