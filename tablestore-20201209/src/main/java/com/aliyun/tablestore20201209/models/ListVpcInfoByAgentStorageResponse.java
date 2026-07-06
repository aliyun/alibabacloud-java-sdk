// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class ListVpcInfoByAgentStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVpcInfoByAgentStorageResponseBody body;

    public static ListVpcInfoByAgentStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcInfoByAgentStorageResponse self = new ListVpcInfoByAgentStorageResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcInfoByAgentStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcInfoByAgentStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVpcInfoByAgentStorageResponse setBody(ListVpcInfoByAgentStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcInfoByAgentStorageResponseBody getBody() {
        return this.body;
    }

}
