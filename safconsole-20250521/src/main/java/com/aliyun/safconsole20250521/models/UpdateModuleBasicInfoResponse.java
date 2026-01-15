// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class UpdateModuleBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateModuleBasicInfoResponseBody body;

    public static UpdateModuleBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModuleBasicInfoResponse self = new UpdateModuleBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModuleBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModuleBasicInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModuleBasicInfoResponse setBody(UpdateModuleBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModuleBasicInfoResponseBody getBody() {
        return this.body;
    }

}
