// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class CreateComputeTask2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateComputeTask2ResponseBody body;

    public static CreateComputeTask2Response build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeTask2Response self = new CreateComputeTask2Response();
        return TeaModel.build(map, self);
    }

    public CreateComputeTask2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateComputeTask2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateComputeTask2Response setBody(CreateComputeTask2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateComputeTask2ResponseBody getBody() {
        return this.body;
    }

}
