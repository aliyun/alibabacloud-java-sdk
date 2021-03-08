// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class TagVodResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TagVodResourcesResponseBody body;

    public static TagVodResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        TagVodResourcesResponse self = new TagVodResourcesResponse();
        return TeaModel.build(map, self);
    }

    public TagVodResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagVodResourcesResponse setBody(TagVodResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public TagVodResourcesResponseBody getBody() {
        return this.body;
    }

}
