// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class DeleteJobPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteJobPlanResponseBody body;

    public static DeleteJobPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobPlanResponse self = new DeleteJobPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteJobPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteJobPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteJobPlanResponse setBody(DeleteJobPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteJobPlanResponseBody getBody() {
        return this.body;
    }

}
