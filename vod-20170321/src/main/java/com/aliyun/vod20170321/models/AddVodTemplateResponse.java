// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddVodTemplateResponseBody body;

    public static AddVodTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddVodTemplateResponse self = new AddVodTemplateResponse();
        return TeaModel.build(map, self);
    }

    public AddVodTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddVodTemplateResponse setBody(AddVodTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public AddVodTemplateResponseBody getBody() {
        return this.body;
    }

}
