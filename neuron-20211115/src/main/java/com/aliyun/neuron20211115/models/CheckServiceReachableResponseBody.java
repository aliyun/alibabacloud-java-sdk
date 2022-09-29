// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CheckServiceReachableResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public String result;

    public static CheckServiceReachableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceReachableResponseBody self = new CheckServiceReachableResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckServiceReachableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckServiceReachableResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
