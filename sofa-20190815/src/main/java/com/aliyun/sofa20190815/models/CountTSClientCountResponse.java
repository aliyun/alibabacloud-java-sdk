// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountTSClientCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountTSClientCountResponseBody body;

    public static CountTSClientCountResponse build(java.util.Map<String, ?> map) throws Exception {
        CountTSClientCountResponse self = new CountTSClientCountResponse();
        return TeaModel.build(map, self);
    }

    public CountTSClientCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountTSClientCountResponse setBody(CountTSClientCountResponseBody body) {
        this.body = body;
        return this;
    }
    public CountTSClientCountResponseBody getBody() {
        return this.body;
    }

}
