// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyCronJobPolicyServerlessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCronJobPolicyServerlessResponseBody body;

    public static ModifyCronJobPolicyServerlessResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCronJobPolicyServerlessResponse self = new ModifyCronJobPolicyServerlessResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCronJobPolicyServerlessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCronJobPolicyServerlessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCronJobPolicyServerlessResponse setBody(ModifyCronJobPolicyServerlessResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCronJobPolicyServerlessResponseBody getBody() {
        return this.body;
    }

}
