// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeletePolarFsPathMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePolarFsPathMappingResponseBody body;

    public static DeletePolarFsPathMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolarFsPathMappingResponse self = new DeletePolarFsPathMappingResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolarFsPathMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolarFsPathMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePolarFsPathMappingResponse setBody(DeletePolarFsPathMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolarFsPathMappingResponseBody getBody() {
        return this.body;
    }

}
