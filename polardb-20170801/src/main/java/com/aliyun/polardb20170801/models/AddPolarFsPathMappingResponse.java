// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddPolarFsPathMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPolarFsPathMappingResponseBody body;

    public static AddPolarFsPathMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPolarFsPathMappingResponse self = new AddPolarFsPathMappingResponse();
        return TeaModel.build(map, self);
    }

    public AddPolarFsPathMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPolarFsPathMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPolarFsPathMappingResponse setBody(AddPolarFsPathMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPolarFsPathMappingResponseBody getBody() {
        return this.body;
    }

}
