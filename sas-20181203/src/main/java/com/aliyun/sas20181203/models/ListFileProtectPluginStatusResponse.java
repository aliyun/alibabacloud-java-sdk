// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectPluginStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFileProtectPluginStatusResponseBody body;

    public static ListFileProtectPluginStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectPluginStatusResponse self = new ListFileProtectPluginStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListFileProtectPluginStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFileProtectPluginStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFileProtectPluginStatusResponse setBody(ListFileProtectPluginStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFileProtectPluginStatusResponseBody getBody() {
        return this.body;
    }

}
