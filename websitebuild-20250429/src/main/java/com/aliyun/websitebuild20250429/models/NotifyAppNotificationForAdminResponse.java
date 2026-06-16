// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class NotifyAppNotificationForAdminResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public NotifyAppNotificationForAdminResponseBody body;

    public static NotifyAppNotificationForAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyAppNotificationForAdminResponse self = new NotifyAppNotificationForAdminResponse();
        return TeaModel.build(map, self);
    }

    public NotifyAppNotificationForAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NotifyAppNotificationForAdminResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NotifyAppNotificationForAdminResponse setBody(NotifyAppNotificationForAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public NotifyAppNotificationForAdminResponseBody getBody() {
        return this.body;
    }

}
