// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UnTagVodResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnTagVodResourcesResponseBody body;

    public static UnTagVodResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UnTagVodResourcesResponse self = new UnTagVodResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UnTagVodResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnTagVodResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnTagVodResourcesResponse setBody(UnTagVodResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public UnTagVodResourcesResponseBody getBody() {
        return this.body;
    }

}
