// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SelectComputeTask2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SelectComputeTask2ResponseBody body;

    public static SelectComputeTask2Response build(java.util.Map<String, ?> map) throws Exception {
        SelectComputeTask2Response self = new SelectComputeTask2Response();
        return TeaModel.build(map, self);
    }

    public SelectComputeTask2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SelectComputeTask2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SelectComputeTask2Response setBody(SelectComputeTask2ResponseBody body) {
        this.body = body;
        return this;
    }
    public SelectComputeTask2ResponseBody getBody() {
        return this.body;
    }

}
