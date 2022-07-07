// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeInterventionDictionaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInterventionDictionaryResponseBody body;

    public static DescribeInterventionDictionaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInterventionDictionaryResponse self = new DescribeInterventionDictionaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInterventionDictionaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInterventionDictionaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInterventionDictionaryResponse setBody(DescribeInterventionDictionaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInterventionDictionaryResponseBody getBody() {
        return this.body;
    }

}
