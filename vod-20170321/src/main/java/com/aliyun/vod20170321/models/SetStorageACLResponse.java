// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetStorageACLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetStorageACLResponseBody body;

    public static SetStorageACLResponse build(java.util.Map<String, ?> map) throws Exception {
        SetStorageACLResponse self = new SetStorageACLResponse();
        return TeaModel.build(map, self);
    }

    public SetStorageACLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetStorageACLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetStorageACLResponse setBody(SetStorageACLResponseBody body) {
        this.body = body;
        return this;
    }
    public SetStorageACLResponseBody getBody() {
        return this.body;
    }

}
