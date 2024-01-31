// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateImageVulWhitelistTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateImageVulWhitelistTargetResponseBody body;

    public static UpdateImageVulWhitelistTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageVulWhitelistTargetResponse self = new UpdateImageVulWhitelistTargetResponse();
        return TeaModel.build(map, self);
    }

    public UpdateImageVulWhitelistTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateImageVulWhitelistTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateImageVulWhitelistTargetResponse setBody(UpdateImageVulWhitelistTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateImageVulWhitelistTargetResponseBody getBody() {
        return this.body;
    }

}
