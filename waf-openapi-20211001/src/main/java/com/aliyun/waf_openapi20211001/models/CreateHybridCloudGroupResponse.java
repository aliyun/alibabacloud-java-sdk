// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateHybridCloudGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHybridCloudGroupResponseBody body;

    public static CreateHybridCloudGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridCloudGroupResponse self = new CreateHybridCloudGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateHybridCloudGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHybridCloudGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHybridCloudGroupResponse setBody(CreateHybridCloudGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHybridCloudGroupResponseBody getBody() {
        return this.body;
    }

}
