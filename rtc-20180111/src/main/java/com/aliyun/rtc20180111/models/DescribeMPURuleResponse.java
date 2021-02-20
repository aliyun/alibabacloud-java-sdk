// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeMPURuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMPURuleResponseBody body;

    public static DescribeMPURuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPURuleResponse self = new DescribeMPURuleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMPURuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMPURuleResponse setBody(DescribeMPURuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMPURuleResponseBody getBody() {
        return this.body;
    }

}
