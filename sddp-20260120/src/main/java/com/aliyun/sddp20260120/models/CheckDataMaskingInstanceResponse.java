// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class CheckDataMaskingInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDataMaskingInstanceResponseBody body;

    public static CheckDataMaskingInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDataMaskingInstanceResponse self = new CheckDataMaskingInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CheckDataMaskingInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDataMaskingInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDataMaskingInstanceResponse setBody(CheckDataMaskingInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDataMaskingInstanceResponseBody getBody() {
        return this.body;
    }

}
