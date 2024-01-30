// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackTemplateByResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStackTemplateByResourcesResponseBody body;

    public static UpdateStackTemplateByResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackTemplateByResourcesResponse self = new UpdateStackTemplateByResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStackTemplateByResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStackTemplateByResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStackTemplateByResourcesResponse setBody(UpdateStackTemplateByResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStackTemplateByResourcesResponseBody getBody() {
        return this.body;
    }

}
