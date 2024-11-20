// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ImportStacksToStackGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportStacksToStackGroupResponseBody body;

    public static ImportStacksToStackGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportStacksToStackGroupResponse self = new ImportStacksToStackGroupResponse();
        return TeaModel.build(map, self);
    }

    public ImportStacksToStackGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportStacksToStackGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportStacksToStackGroupResponse setBody(ImportStacksToStackGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportStacksToStackGroupResponseBody getBody() {
        return this.body;
    }

}
