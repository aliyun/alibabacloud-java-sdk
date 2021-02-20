// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcUserListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcUserListResponseBody body;

    public static DescribeRtcUserListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcUserListResponse self = new DescribeRtcUserListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcUserListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcUserListResponse setBody(DescribeRtcUserListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcUserListResponseBody getBody() {
        return this.body;
    }

}
