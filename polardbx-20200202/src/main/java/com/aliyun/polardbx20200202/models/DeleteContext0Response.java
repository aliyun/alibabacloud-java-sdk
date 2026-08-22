// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteContext0Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContext0ResponseBody body;

    public static DeleteContext0Response build(java.util.Map<String, ?> map) throws Exception {
        DeleteContext0Response self = new DeleteContext0Response();
        return TeaModel.build(map, self);
    }

    public DeleteContext0Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContext0Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContext0Response setBody(DeleteContext0ResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContext0ResponseBody getBody() {
        return this.body;
    }

}
