// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateJenkinsImageRegistryPersistenceDayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateJenkinsImageRegistryPersistenceDayResponseBody body;

    public static UpdateJenkinsImageRegistryPersistenceDayResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateJenkinsImageRegistryPersistenceDayResponse self = new UpdateJenkinsImageRegistryPersistenceDayResponse();
        return TeaModel.build(map, self);
    }

    public UpdateJenkinsImageRegistryPersistenceDayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateJenkinsImageRegistryPersistenceDayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateJenkinsImageRegistryPersistenceDayResponse setBody(UpdateJenkinsImageRegistryPersistenceDayResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateJenkinsImageRegistryPersistenceDayResponseBody getBody() {
        return this.body;
    }

}
