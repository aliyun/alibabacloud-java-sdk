// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppNotificationSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppNotificationSceneResponseBody body;

    public static CreateAppNotificationSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppNotificationSceneResponse self = new CreateAppNotificationSceneResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppNotificationSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppNotificationSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppNotificationSceneResponse setBody(CreateAppNotificationSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppNotificationSceneResponseBody getBody() {
        return this.body;
    }

}
