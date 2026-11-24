// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineEvidenceRequestsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAiEngineEvidenceRequestsResponseBody body;

    public static DescribeAiEngineEvidenceRequestsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineEvidenceRequestsResponse self = new DescribeAiEngineEvidenceRequestsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineEvidenceRequestsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAiEngineEvidenceRequestsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAiEngineEvidenceRequestsResponse setBody(DescribeAiEngineEvidenceRequestsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAiEngineEvidenceRequestsResponseBody getBody() {
        return this.body;
    }

}
