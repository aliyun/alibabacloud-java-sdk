// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcDurationByAppIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterRtcDurationByAppIdResponseBody body;

    public static DescribeMeterRtcDurationByAppIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcDurationByAppIdResponse self = new DescribeMeterRtcDurationByAppIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcDurationByAppIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterRtcDurationByAppIdResponse setBody(DescribeMeterRtcDurationByAppIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcDurationByAppIdResponseBody getBody() {
        return this.body;
    }

}
