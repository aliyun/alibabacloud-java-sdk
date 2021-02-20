// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcUserEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcUserEventsResponseBody body;

    public static DescribeRtcUserEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcUserEventsResponse self = new DescribeRtcUserEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcUserEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcUserEventsResponse setBody(DescribeRtcUserEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcUserEventsResponseBody getBody() {
        return this.body;
    }

}
