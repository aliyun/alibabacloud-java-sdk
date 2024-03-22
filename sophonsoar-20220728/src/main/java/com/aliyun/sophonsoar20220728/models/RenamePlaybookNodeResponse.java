// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RenamePlaybookNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenamePlaybookNodeResponseBody body;

    public static RenamePlaybookNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RenamePlaybookNodeResponse self = new RenamePlaybookNodeResponse();
        return TeaModel.build(map, self);
    }

    public RenamePlaybookNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenamePlaybookNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenamePlaybookNodeResponse setBody(RenamePlaybookNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public RenamePlaybookNodeResponseBody getBody() {
        return this.body;
    }

}
