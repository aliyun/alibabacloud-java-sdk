// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteVulWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVulWhitelistResponseBody body;

    public static DeleteVulWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVulWhitelistResponse self = new DeleteVulWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVulWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVulWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVulWhitelistResponse setBody(DeleteVulWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVulWhitelistResponseBody getBody() {
        return this.body;
    }

}
