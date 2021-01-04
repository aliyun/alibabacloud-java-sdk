// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class OrchestrateSagECRouteBackupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OrchestrateSagECRouteBackupResponseBody body;

    public static OrchestrateSagECRouteBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        OrchestrateSagECRouteBackupResponse self = new OrchestrateSagECRouteBackupResponse();
        return TeaModel.build(map, self);
    }

    public OrchestrateSagECRouteBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrchestrateSagECRouteBackupResponse setBody(OrchestrateSagECRouteBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public OrchestrateSagECRouteBackupResponseBody getBody() {
        return this.body;
    }

}
