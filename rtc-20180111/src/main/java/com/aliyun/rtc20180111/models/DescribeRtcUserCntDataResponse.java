// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcUserCntDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRtcUserCntDataResponseBody body;

    public static DescribeRtcUserCntDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcUserCntDataResponse self = new DescribeRtcUserCntDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcUserCntDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcUserCntDataResponse setBody(DescribeRtcUserCntDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcUserCntDataResponseBody getBody() {
        return this.body;
    }

}
