// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeConferenceAuthInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConferenceAuthInfoResponseBody body;

    public static DescribeConferenceAuthInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConferenceAuthInfoResponse self = new DescribeConferenceAuthInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConferenceAuthInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConferenceAuthInfoResponse setBody(DescribeConferenceAuthInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConferenceAuthInfoResponseBody getBody() {
        return this.body;
    }

}
