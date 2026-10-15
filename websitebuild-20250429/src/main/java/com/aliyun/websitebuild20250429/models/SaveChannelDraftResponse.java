// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SaveChannelDraftResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveChannelDraftResponseBody body;

    public static SaveChannelDraftResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveChannelDraftResponse self = new SaveChannelDraftResponse();
        return TeaModel.build(map, self);
    }

    public SaveChannelDraftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveChannelDraftResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveChannelDraftResponse setBody(SaveChannelDraftResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveChannelDraftResponseBody getBody() {
        return this.body;
    }

}
