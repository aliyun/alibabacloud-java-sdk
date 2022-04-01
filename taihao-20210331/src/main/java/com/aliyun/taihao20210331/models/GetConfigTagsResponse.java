// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetConfigTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetConfigTagsResponseBody body;

    public static GetConfigTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigTagsResponse self = new GetConfigTagsResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigTagsResponse setBody(GetConfigTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigTagsResponseBody getBody() {
        return this.body;
    }

}
