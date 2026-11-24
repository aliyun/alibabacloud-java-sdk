// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineEvidenceRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAiEngineEvidenceRequestResponseBody body;

    public static DescribeAiEngineEvidenceRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineEvidenceRequestResponse self = new DescribeAiEngineEvidenceRequestResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineEvidenceRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAiEngineEvidenceRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAiEngineEvidenceRequestResponse setBody(DescribeAiEngineEvidenceRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAiEngineEvidenceRequestResponseBody getBody() {
        return this.body;
    }

}
