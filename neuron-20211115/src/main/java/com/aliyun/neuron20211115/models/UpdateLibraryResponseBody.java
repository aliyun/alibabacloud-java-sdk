// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateLibraryResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Library result;

    public static UpdateLibraryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLibraryResponseBody self = new UpdateLibraryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLibraryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLibraryResponseBody setResult(Library result) {
        this.result = result;
        return this;
    }
    public Library getResult() {
        return this.result;
    }

}
