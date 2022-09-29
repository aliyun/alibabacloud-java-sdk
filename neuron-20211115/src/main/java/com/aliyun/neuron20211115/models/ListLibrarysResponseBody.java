// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListLibrarysResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<Library> result;

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

    public ListLibrarysResponseBody setResult(java.util.List<Library> result) {
        this.result = result;
        return this;
    }
    public java.util.List<Library> getResult() {
        return this.result;
    }

}
