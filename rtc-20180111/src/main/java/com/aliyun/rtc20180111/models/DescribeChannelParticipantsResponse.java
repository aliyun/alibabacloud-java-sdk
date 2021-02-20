// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelParticipantsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeChannelParticipantsResponseBody body;

    public static DescribeChannelParticipantsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelParticipantsResponse self = new DescribeChannelParticipantsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChannelParticipantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChannelParticipantsResponse setBody(DescribeChannelParticipantsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChannelParticipantsResponseBody getBody() {
        return this.body;
    }

}
