// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateLibrarySchemaResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public LibrarySchema result;

    public static CreateLibrarySchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLibrarySchemaResponseBody self = new CreateLibrarySchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLibrarySchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLibrarySchemaResponseBody setResult(LibrarySchema result) {
        this.result = result;
        return this;
    }
    public LibrarySchema getResult() {
        return this.result;
    }

}
