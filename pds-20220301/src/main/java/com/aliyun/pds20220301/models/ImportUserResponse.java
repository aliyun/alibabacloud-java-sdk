// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ImportUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public User body;

    public static ImportUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportUserResponse self = new ImportUserResponse();
        return TeaModel.build(map, self);
    }

    public ImportUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportUserResponse setBody(User body) {
        this.body = body;
        return this;
    }
    public User getBody() {
        return this.body;
    }

}
