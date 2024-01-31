// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteImageVulWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteImageVulWhitelistResponseBody body;

    public static DeleteImageVulWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageVulWhitelistResponse self = new DeleteImageVulWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImageVulWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteImageVulWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteImageVulWhitelistResponse setBody(DeleteImageVulWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteImageVulWhitelistResponseBody getBody() {
        return this.body;
    }

}
