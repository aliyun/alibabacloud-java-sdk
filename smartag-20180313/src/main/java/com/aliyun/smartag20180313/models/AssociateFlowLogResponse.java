// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AssociateFlowLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateFlowLogResponseBody body;

    public static AssociateFlowLogResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateFlowLogResponse self = new AssociateFlowLogResponse();
        return TeaModel.build(map, self);
    }

    public AssociateFlowLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateFlowLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateFlowLogResponse setBody(AssociateFlowLogResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateFlowLogResponseBody getBody() {
        return this.body;
    }

}
