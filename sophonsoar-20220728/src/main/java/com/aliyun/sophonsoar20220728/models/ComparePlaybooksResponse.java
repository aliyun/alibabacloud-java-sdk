// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ComparePlaybooksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ComparePlaybooksResponseBody body;

    public static ComparePlaybooksResponse build(java.util.Map<String, ?> map) throws Exception {
        ComparePlaybooksResponse self = new ComparePlaybooksResponse();
        return TeaModel.build(map, self);
    }

    public ComparePlaybooksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ComparePlaybooksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ComparePlaybooksResponse setBody(ComparePlaybooksResponseBody body) {
        this.body = body;
        return this;
    }
    public ComparePlaybooksResponseBody getBody() {
        return this.body;
    }

}
