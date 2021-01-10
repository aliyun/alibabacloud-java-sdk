// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasDingtalkRobotupdateauthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasDingtalkRobotupdateauthResponseBody body;

    public static UpdateHasDingtalkRobotupdateauthResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasDingtalkRobotupdateauthResponse self = new UpdateHasDingtalkRobotupdateauthResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasDingtalkRobotupdateauthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasDingtalkRobotupdateauthResponse setBody(UpdateHasDingtalkRobotupdateauthResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasDingtalkRobotupdateauthResponseBody getBody() {
        return this.body;
    }

}
