// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdatePublishAutoUpgradeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePublishAutoUpgradeResponseBody body;

    public static UpdatePublishAutoUpgradeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublishAutoUpgradeResponse self = new UpdatePublishAutoUpgradeResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePublishAutoUpgradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePublishAutoUpgradeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePublishAutoUpgradeResponse setBody(UpdatePublishAutoUpgradeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePublishAutoUpgradeResponseBody getBody() {
        return this.body;
    }

}
