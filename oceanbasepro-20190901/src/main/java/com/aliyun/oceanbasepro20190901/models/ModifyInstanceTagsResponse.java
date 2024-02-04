// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceTagsResponseBody body;

    public static ModifyInstanceTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTagsResponse self = new ModifyInstanceTagsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceTagsResponse setBody(ModifyInstanceTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceTagsResponseBody getBody() {
        return this.body;
    }

}
