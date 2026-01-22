// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarAgentChatRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarAgentChatRecordsResponseBody body;

    public static DescribePolarAgentChatRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarAgentChatRecordsResponse self = new DescribePolarAgentChatRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarAgentChatRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarAgentChatRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarAgentChatRecordsResponse setBody(DescribePolarAgentChatRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarAgentChatRecordsResponseBody getBody() {
        return this.body;
    }

}
