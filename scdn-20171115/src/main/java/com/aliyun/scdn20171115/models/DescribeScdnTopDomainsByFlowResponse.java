// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnTopDomainsByFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnTopDomainsByFlowResponseBody body;

    public static DescribeScdnTopDomainsByFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnTopDomainsByFlowResponse self = new DescribeScdnTopDomainsByFlowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnTopDomainsByFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnTopDomainsByFlowResponse setBody(DescribeScdnTopDomainsByFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnTopDomainsByFlowResponseBody getBody() {
        return this.body;
    }

}
