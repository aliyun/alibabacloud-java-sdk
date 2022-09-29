// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateLibrarySchemaResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public LibrarySchema result;

    public static UpdateLibrarySchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLibrarySchemaResponseBody self = new UpdateLibrarySchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLibrarySchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLibrarySchemaResponseBody setResult(LibrarySchema result) {
        this.result = result;
        return this;
    }
    public LibrarySchema getResult() {
        return this.result;
    }

}
