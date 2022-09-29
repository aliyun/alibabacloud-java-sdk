// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetLibraryResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Library result;

    public static GetLibraryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLibraryResponseBody self = new GetLibraryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLibraryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLibraryResponseBody setResult(Library result) {
        this.result = result;
        return this;
    }
    public Library getResult() {
        return this.result;
    }

}
