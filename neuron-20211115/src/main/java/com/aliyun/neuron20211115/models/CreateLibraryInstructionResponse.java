// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateLibraryInstructionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LibraryInstruction body;

    public static CreateLibraryInstructionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLibraryInstructionResponse self = new CreateLibraryInstructionResponse();
        return TeaModel.build(map, self);
    }

    public CreateLibraryInstructionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLibraryInstructionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLibraryInstructionResponse setBody(LibraryInstruction body) {
        this.body = body;
        return this;
    }
    public LibraryInstruction getBody() {
        return this.body;
    }

}
