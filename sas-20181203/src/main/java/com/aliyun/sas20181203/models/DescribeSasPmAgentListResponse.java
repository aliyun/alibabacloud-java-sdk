// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSasPmAgentListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSasPmAgentListResponseBody body;

    public static DescribeSasPmAgentListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSasPmAgentListResponse self = new DescribeSasPmAgentListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSasPmAgentListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSasPmAgentListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSasPmAgentListResponse setBody(DescribeSasPmAgentListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSasPmAgentListResponseBody getBody() {
        return this.body;
    }

}
