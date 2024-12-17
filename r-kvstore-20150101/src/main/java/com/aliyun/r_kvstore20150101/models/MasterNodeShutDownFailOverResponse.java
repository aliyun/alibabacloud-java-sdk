// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class MasterNodeShutDownFailOverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MasterNodeShutDownFailOverResponseBody body;

    public static MasterNodeShutDownFailOverResponse build(java.util.Map<String, ?> map) throws Exception {
        MasterNodeShutDownFailOverResponse self = new MasterNodeShutDownFailOverResponse();
        return TeaModel.build(map, self);
    }

    public MasterNodeShutDownFailOverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MasterNodeShutDownFailOverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MasterNodeShutDownFailOverResponse setBody(MasterNodeShutDownFailOverResponseBody body) {
        this.body = body;
        return this;
    }
    public MasterNodeShutDownFailOverResponseBody getBody() {
        return this.body;
    }

}
