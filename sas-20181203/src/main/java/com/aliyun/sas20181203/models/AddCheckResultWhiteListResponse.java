// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCheckResultWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCheckResultWhiteListResponseBody body;

    public static AddCheckResultWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCheckResultWhiteListResponse self = new AddCheckResultWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public AddCheckResultWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCheckResultWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCheckResultWhiteListResponse setBody(AddCheckResultWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCheckResultWhiteListResponseBody getBody() {
        return this.body;
    }

}
