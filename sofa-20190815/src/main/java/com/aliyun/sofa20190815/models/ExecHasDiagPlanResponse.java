// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasDiagPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasDiagPlanResponseBody body;

    public static ExecHasDiagPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasDiagPlanResponse self = new ExecHasDiagPlanResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasDiagPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasDiagPlanResponse setBody(ExecHasDiagPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasDiagPlanResponseBody getBody() {
        return this.body;
    }

}
