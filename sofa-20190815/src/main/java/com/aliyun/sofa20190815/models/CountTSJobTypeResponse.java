// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountTSJobTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountTSJobTypeResponseBody body;

    public static CountTSJobTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        CountTSJobTypeResponse self = new CountTSJobTypeResponse();
        return TeaModel.build(map, self);
    }

    public CountTSJobTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountTSJobTypeResponse setBody(CountTSJobTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public CountTSJobTypeResponseBody getBody() {
        return this.body;
    }

}
