// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class ListComputeTask2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListComputeTask2ResponseBody body;

    public static ListComputeTask2Response build(java.util.Map<String, ?> map) throws Exception {
        ListComputeTask2Response self = new ListComputeTask2Response();
        return TeaModel.build(map, self);
    }

    public ListComputeTask2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComputeTask2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComputeTask2Response setBody(ListComputeTask2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComputeTask2ResponseBody getBody() {
        return this.body;
    }

}
