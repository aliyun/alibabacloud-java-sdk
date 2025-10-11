// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateCronJobPolicyServerlessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCronJobPolicyServerlessResponseBody body;

    public static CreateCronJobPolicyServerlessResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCronJobPolicyServerlessResponse self = new CreateCronJobPolicyServerlessResponse();
        return TeaModel.build(map, self);
    }

    public CreateCronJobPolicyServerlessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCronJobPolicyServerlessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCronJobPolicyServerlessResponse setBody(CreateCronJobPolicyServerlessResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCronJobPolicyServerlessResponseBody getBody() {
        return this.body;
    }

}
