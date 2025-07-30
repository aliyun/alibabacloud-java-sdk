// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class CreateInstanceV1Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInstanceV1ResponseBody body;

    public static CreateInstanceV1Response build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceV1Response self = new CreateInstanceV1Response();
        return TeaModel.build(map, self);
    }

    public CreateInstanceV1Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceV1Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceV1Response setBody(CreateInstanceV1ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceV1ResponseBody getBody() {
        return this.body;
    }

}
