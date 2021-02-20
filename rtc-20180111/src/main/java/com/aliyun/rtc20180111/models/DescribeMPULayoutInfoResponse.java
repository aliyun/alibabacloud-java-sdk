// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeMPULayoutInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMPULayoutInfoResponseBody body;

    public static DescribeMPULayoutInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPULayoutInfoResponse self = new DescribeMPULayoutInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMPULayoutInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMPULayoutInfoResponse setBody(DescribeMPULayoutInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMPULayoutInfoResponseBody getBody() {
        return this.body;
    }

}
