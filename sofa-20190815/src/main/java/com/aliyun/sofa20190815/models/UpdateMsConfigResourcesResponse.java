// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsConfigResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsConfigResourcesResponseBody body;

    public static UpdateMsConfigResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsConfigResourcesResponse self = new UpdateMsConfigResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsConfigResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsConfigResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMsConfigResourcesResponse setBody(UpdateMsConfigResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsConfigResourcesResponseBody getBody() {
        return this.body;
    }

}
