// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class TransferUsergroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferUsergroupResponseBody body;

    public static TransferUsergroupResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferUsergroupResponse self = new TransferUsergroupResponse();
        return TeaModel.build(map, self);
    }

    public TransferUsergroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferUsergroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferUsergroupResponse setBody(TransferUsergroupResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferUsergroupResponseBody getBody() {
        return this.body;
    }

}
