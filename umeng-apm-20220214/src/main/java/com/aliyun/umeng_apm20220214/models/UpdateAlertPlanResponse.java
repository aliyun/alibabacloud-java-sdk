// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class UpdateAlertPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAlertPlanResponseBody body;

    public static UpdateAlertPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertPlanResponse self = new UpdateAlertPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlertPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlertPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlertPlanResponse setBody(UpdateAlertPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlertPlanResponseBody getBody() {
        return this.body;
    }

}
