// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckDuplicateClassificationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDuplicateClassificationResponseBody body;

    public static CheckDuplicateClassificationResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDuplicateClassificationResponse self = new CheckDuplicateClassificationResponse();
        return TeaModel.build(map, self);
    }

    public CheckDuplicateClassificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDuplicateClassificationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDuplicateClassificationResponse setBody(CheckDuplicateClassificationResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDuplicateClassificationResponseBody getBody() {
        return this.body;
    }

}
