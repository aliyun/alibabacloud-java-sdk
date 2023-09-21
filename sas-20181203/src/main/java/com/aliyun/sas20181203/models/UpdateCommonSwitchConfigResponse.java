// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateCommonSwitchConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCommonSwitchConfigResponseBody body;

    public static UpdateCommonSwitchConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommonSwitchConfigResponse self = new UpdateCommonSwitchConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCommonSwitchConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCommonSwitchConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCommonSwitchConfigResponse setBody(UpdateCommonSwitchConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCommonSwitchConfigResponseBody getBody() {
        return this.body;
    }

}
