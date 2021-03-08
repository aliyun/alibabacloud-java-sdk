// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddWatermarkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddWatermarkResponseBody body;

    public static AddWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWatermarkResponse self = new AddWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public AddWatermarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWatermarkResponse setBody(AddWatermarkResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWatermarkResponseBody getBody() {
        return this.body;
    }

}
