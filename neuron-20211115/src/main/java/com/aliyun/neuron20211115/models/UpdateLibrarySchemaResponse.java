// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateLibrarySchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLibrarySchemaResponseBody body;

    public static UpdateLibrarySchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLibrarySchemaResponse self = new UpdateLibrarySchemaResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLibrarySchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLibrarySchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLibrarySchemaResponse setBody(UpdateLibrarySchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLibrarySchemaResponseBody getBody() {
        return this.body;
    }

}
