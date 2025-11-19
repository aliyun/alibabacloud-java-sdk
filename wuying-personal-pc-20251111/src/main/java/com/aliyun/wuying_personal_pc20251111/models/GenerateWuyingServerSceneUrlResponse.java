// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class GenerateWuyingServerSceneUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateWuyingServerSceneUrlResponseBody body;

    public static GenerateWuyingServerSceneUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateWuyingServerSceneUrlResponse self = new GenerateWuyingServerSceneUrlResponse();
        return TeaModel.build(map, self);
    }

    public GenerateWuyingServerSceneUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateWuyingServerSceneUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateWuyingServerSceneUrlResponse setBody(GenerateWuyingServerSceneUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateWuyingServerSceneUrlResponseBody getBody() {
        return this.body;
    }

}
