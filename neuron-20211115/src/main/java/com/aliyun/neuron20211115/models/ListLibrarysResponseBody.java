// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListLibrarysResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public LibraryListResult result;

    public static ListLibrarysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLibrarysResponseBody self = new ListLibrarysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLibrarysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLibrarysResponseBody setResult(LibraryListResult result) {
        this.result = result;
        return this;
    }
    public LibraryListResult getResult() {
        return this.result;
    }

}
