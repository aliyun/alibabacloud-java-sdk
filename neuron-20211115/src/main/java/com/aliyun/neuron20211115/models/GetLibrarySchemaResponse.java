// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetLibrarySchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLibrarySchemaResponseBody body;

    public static GetLibrarySchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLibrarySchemaResponse self = new GetLibrarySchemaResponse();
        return TeaModel.build(map, self);
    }

    public GetLibrarySchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLibrarySchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLibrarySchemaResponse setBody(GetLibrarySchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLibrarySchemaResponseBody getBody() {
        return this.body;
    }

}
