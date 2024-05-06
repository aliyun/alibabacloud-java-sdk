// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetFolderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFolderResponseBody body;

    public static GetFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFolderResponse self = new GetFolderResponse();
        return TeaModel.build(map, self);
    }

    public GetFolderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFolderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFolderResponse setBody(GetFolderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFolderResponseBody getBody() {
        return this.body;
    }

}
