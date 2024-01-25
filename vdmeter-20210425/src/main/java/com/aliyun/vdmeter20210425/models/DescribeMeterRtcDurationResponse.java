// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcDurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeMeterRtcDurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterRtcDurationResponse setBody(DescribeMeterRtcDurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcDurationResponseBody getBody() {
        return this.body;
    }

}
