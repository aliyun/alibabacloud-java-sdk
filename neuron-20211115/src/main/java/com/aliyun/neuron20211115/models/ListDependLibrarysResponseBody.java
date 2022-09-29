// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListDependLibrarysResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<Library> result;

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

    public ListDependLibrarysResponseBody setResult(java.util.List<Library> result) {
        this.result = result;
        return this;
    }
    public java.util.List<Library> getResult() {
        return this.result;
    }

}
