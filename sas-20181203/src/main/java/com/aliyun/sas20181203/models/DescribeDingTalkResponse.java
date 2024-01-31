// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDingTalkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDingTalkResponseBody body;

    public static DescribeDingTalkResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDingTalkResponse self = new DescribeDingTalkResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDingTalkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDingTalkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDingTalkResponse setBody(DescribeDingTalkResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDingTalkResponseBody getBody() {
        return this.body;
    }

}
