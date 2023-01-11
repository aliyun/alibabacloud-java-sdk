// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SubmitDataSetTask2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitDataSetTask2ResponseBody body;

    public static SubmitDataSetTask2Response build(java.util.Map<String, ?> map) throws Exception {
        SubmitDataSetTask2Response self = new SubmitDataSetTask2Response();
        return TeaModel.build(map, self);
    }

    public SubmitDataSetTask2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDataSetTask2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDataSetTask2Response setBody(SubmitDataSetTask2ResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDataSetTask2ResponseBody getBody() {
        return this.body;
    }

}
