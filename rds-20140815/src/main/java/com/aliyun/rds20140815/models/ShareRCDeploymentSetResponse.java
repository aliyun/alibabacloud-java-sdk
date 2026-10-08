// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ShareRCDeploymentSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ShareRCDeploymentSetResponseBody body;

    public static ShareRCDeploymentSetResponse build(java.util.Map<String, ?> map) throws Exception {
        ShareRCDeploymentSetResponse self = new ShareRCDeploymentSetResponse();
        return TeaModel.build(map, self);
    }

    public ShareRCDeploymentSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ShareRCDeploymentSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ShareRCDeploymentSetResponse setBody(ShareRCDeploymentSetResponseBody body) {
        this.body = body;
        return this;
    }
    public ShareRCDeploymentSetResponseBody getBody() {
        return this.body;
    }

}
