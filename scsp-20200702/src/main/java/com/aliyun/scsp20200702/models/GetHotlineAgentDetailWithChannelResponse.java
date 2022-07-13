// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetHotlineAgentDetailWithChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHotlineAgentDetailWithChannelResponseBody body;

    public static GetHotlineAgentDetailWithChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineAgentDetailWithChannelResponse self = new GetHotlineAgentDetailWithChannelResponse();
        return TeaModel.build(map, self);
    }

    public GetHotlineAgentDetailWithChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotlineAgentDetailWithChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotlineAgentDetailWithChannelResponse setBody(GetHotlineAgentDetailWithChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotlineAgentDetailWithChannelResponseBody getBody() {
        return this.body;
    }

}
