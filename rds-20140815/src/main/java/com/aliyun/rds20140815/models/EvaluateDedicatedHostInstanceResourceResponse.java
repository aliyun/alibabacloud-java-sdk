// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class EvaluateDedicatedHostInstanceResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EvaluateDedicatedHostInstanceResourceResponseBody body;

    public static EvaluateDedicatedHostInstanceResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        EvaluateDedicatedHostInstanceResourceResponse self = new EvaluateDedicatedHostInstanceResourceResponse();
        return TeaModel.build(map, self);
    }

    public EvaluateDedicatedHostInstanceResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EvaluateDedicatedHostInstanceResourceResponse setBody(EvaluateDedicatedHostInstanceResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public EvaluateDedicatedHostInstanceResourceResponseBody getBody() {
        return this.body;
    }

}
