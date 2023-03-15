// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateLibrarySchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LibrarySchema body;

    public static CreateLibrarySchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLibrarySchemaResponse self = new CreateLibrarySchemaResponse();
        return TeaModel.build(map, self);
    }

    public CreateLibrarySchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLibrarySchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLibrarySchemaResponse setBody(LibrarySchema body) {
        this.body = body;
        return this;
    }
    public LibrarySchema getBody() {
        return this.body;
    }

}
