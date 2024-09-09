// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstanceIpWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceIpWhitelistResponseBody body;

    public static ListInstanceIpWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceIpWhitelistResponse self = new ListInstanceIpWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceIpWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceIpWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceIpWhitelistResponse setBody(ListInstanceIpWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceIpWhitelistResponseBody getBody() {
        return this.body;
    }

}
