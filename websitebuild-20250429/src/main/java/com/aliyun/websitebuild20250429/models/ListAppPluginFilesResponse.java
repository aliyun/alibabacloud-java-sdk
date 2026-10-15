// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppPluginFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppPluginFilesResponseBody body;

    public static ListAppPluginFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppPluginFilesResponse self = new ListAppPluginFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListAppPluginFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppPluginFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppPluginFilesResponse setBody(ListAppPluginFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppPluginFilesResponseBody getBody() {
        return this.body;
    }

}
