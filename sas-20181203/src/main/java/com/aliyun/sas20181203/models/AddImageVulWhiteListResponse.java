// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddImageVulWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddImageVulWhiteListResponseBody body;

    public static AddImageVulWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddImageVulWhiteListResponse self = new AddImageVulWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public AddImageVulWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddImageVulWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddImageVulWhiteListResponse setBody(AddImageVulWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public AddImageVulWhiteListResponseBody getBody() {
        return this.body;
    }

}
