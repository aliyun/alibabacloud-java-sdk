// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class CancelTask2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelTask2ResponseBody body;

    public static CancelTask2Response build(java.util.Map<String, ?> map) throws Exception {
        CancelTask2Response self = new CancelTask2Response();
        return TeaModel.build(map, self);
    }

    public CancelTask2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelTask2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelTask2Response setBody(CancelTask2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelTask2ResponseBody getBody() {
        return this.body;
    }

}
