// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class CreateDataSet2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDataSet2ResponseBody body;

    public static CreateDataSet2Response build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSet2Response self = new CreateDataSet2Response();
        return TeaModel.build(map, self);
    }

    public CreateDataSet2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataSet2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataSet2Response setBody(CreateDataSet2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataSet2ResponseBody getBody() {
        return this.body;
    }

}
