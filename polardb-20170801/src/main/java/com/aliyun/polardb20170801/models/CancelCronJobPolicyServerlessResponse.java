// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CancelCronJobPolicyServerlessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelCronJobPolicyServerlessResponseBody body;

    public static CancelCronJobPolicyServerlessResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelCronJobPolicyServerlessResponse self = new CancelCronJobPolicyServerlessResponse();
        return TeaModel.build(map, self);
    }

    public CancelCronJobPolicyServerlessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelCronJobPolicyServerlessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelCronJobPolicyServerlessResponse setBody(CancelCronJobPolicyServerlessResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelCronJobPolicyServerlessResponseBody getBody() {
        return this.body;
    }

}
