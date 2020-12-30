// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class UnSubscribeRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnSubscribeRegionResponseBody body;

    public static UnSubscribeRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        UnSubscribeRegionResponse self = new UnSubscribeRegionResponse();
        return TeaModel.build(map, self);
    }

    public UnSubscribeRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnSubscribeRegionResponse setBody(UnSubscribeRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public UnSubscribeRegionResponseBody getBody() {
        return this.body;
    }

}
