// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateDriveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Drive body;

    public static UpdateDriveResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDriveResponse self = new UpdateDriveResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDriveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDriveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDriveResponse setBody(Drive body) {
        this.body = body;
        return this;
    }
    public Drive getBody() {
        return this.body;
    }

}
