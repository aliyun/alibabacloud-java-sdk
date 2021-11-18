// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcDurationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterRtcDurationResponseBody body;

    public static DescribeMeterRtcDurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcDurationResponse self = new DescribeMeterRtcDurationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcDurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterRtcDurationResponse setBody(DescribeMeterRtcDurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcDurationResponseBody getBody() {
        return this.body;
    }

}
