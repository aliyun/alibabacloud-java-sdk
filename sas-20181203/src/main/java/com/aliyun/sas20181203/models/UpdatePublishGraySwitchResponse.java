// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdatePublishGraySwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePublishGraySwitchResponseBody body;

    public static UpdatePublishGraySwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublishGraySwitchResponse self = new UpdatePublishGraySwitchResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePublishGraySwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePublishGraySwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePublishGraySwitchResponse setBody(UpdatePublishGraySwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePublishGraySwitchResponseBody getBody() {
        return this.body;
    }

}
