// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListDependLibrarysResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public LibraryListResult result;

    public static ListDependLibrarysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDependLibrarysResponseBody self = new ListDependLibrarysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDependLibrarysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDependLibrarysResponseBody setResult(LibraryListResult result) {
        this.result = result;
        return this;
    }
    public LibraryListResult getResult() {
        return this.result;
    }

}
