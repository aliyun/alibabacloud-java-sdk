// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteMem0Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMem0ResponseBody body;

    public static DeleteMem0Response build(java.util.Map<String, ?> map) throws Exception {
        DeleteMem0Response self = new DeleteMem0Response();
        return TeaModel.build(map, self);
    }

    public DeleteMem0Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMem0Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMem0Response setBody(DeleteMem0ResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMem0ResponseBody getBody() {
        return this.body;
    }

}
