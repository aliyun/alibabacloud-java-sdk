// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class TagResourcesForExpressConnectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TagResourcesForExpressConnectResponseBody body;

    public static TagResourcesForExpressConnectResponse build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesForExpressConnectResponse self = new TagResourcesForExpressConnectResponse();
        return TeaModel.build(map, self);
    }

    public TagResourcesForExpressConnectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TagResourcesForExpressConnectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TagResourcesForExpressConnectResponse setBody(TagResourcesForExpressConnectResponseBody body) {
        this.body = body;
        return this;
    }
    public TagResourcesForExpressConnectResponseBody getBody() {
        return this.body;
    }

}
