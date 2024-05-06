// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class UpdateFolderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFolderResponseBody body;

    public static UpdateFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFolderResponse self = new UpdateFolderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFolderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFolderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFolderResponse setBody(UpdateFolderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFolderResponseBody getBody() {
        return this.body;
    }

}
