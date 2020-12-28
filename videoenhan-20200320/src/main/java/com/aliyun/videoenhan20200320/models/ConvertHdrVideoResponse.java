// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ConvertHdrVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConvertHdrVideoResponseBody body;

    public static ConvertHdrVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertHdrVideoResponse self = new ConvertHdrVideoResponse();
        return TeaModel.build(map, self);
    }

    public ConvertHdrVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertHdrVideoResponse setBody(ConvertHdrVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertHdrVideoResponseBody getBody() {
        return this.body;
    }

}
