// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ModifyPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyPlanResponseBody body;

    public static ModifyPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPlanResponse self = new ModifyPlanResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPlanResponse setBody(ModifyPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPlanResponseBody getBody() {
        return this.body;
    }

}
