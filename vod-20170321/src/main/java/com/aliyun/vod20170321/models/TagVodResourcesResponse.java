// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class TagVodResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public TagVodResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TagVodResourcesResponse setBody(TagVodResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public TagVodResourcesResponseBody getBody() {
        return this.body;
    }

}
