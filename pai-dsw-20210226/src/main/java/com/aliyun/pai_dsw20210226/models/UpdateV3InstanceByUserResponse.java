// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class UpdateV3InstanceByUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateV3InstanceByUserResponseBody body;

    public static UpdateV3InstanceByUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateV3InstanceByUserResponse self = new UpdateV3InstanceByUserResponse();
        return TeaModel.build(map, self);
    }

    public UpdateV3InstanceByUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateV3InstanceByUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateV3InstanceByUserResponse setBody(UpdateV3InstanceByUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateV3InstanceByUserResponseBody getBody() {
        return this.body;
    }

}
