// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateJenkinsImageRegistryNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateJenkinsImageRegistryNameResponseBody body;

    public static UpdateJenkinsImageRegistryNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateJenkinsImageRegistryNameResponse self = new UpdateJenkinsImageRegistryNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateJenkinsImageRegistryNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateJenkinsImageRegistryNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateJenkinsImageRegistryNameResponse setBody(UpdateJenkinsImageRegistryNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateJenkinsImageRegistryNameResponseBody getBody() {
        return this.body;
    }

}
