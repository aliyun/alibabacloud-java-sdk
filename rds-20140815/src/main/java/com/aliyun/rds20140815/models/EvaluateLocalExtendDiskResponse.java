// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class EvaluateLocalExtendDiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EvaluateLocalExtendDiskResponseBody body;

    public static EvaluateLocalExtendDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        EvaluateLocalExtendDiskResponse self = new EvaluateLocalExtendDiskResponse();
        return TeaModel.build(map, self);
    }

    public EvaluateLocalExtendDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EvaluateLocalExtendDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EvaluateLocalExtendDiskResponse setBody(EvaluateLocalExtendDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public EvaluateLocalExtendDiskResponseBody getBody() {
        return this.body;
    }

}
