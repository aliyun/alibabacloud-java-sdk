// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PublishHotspotConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishHotspotConfigResponseBody body;

    public static PublishHotspotConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishHotspotConfigResponse self = new PublishHotspotConfigResponse();
        return TeaModel.build(map, self);
    }

    public PublishHotspotConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishHotspotConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishHotspotConfigResponse setBody(PublishHotspotConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishHotspotConfigResponseBody getBody() {
        return this.body;
    }

}
