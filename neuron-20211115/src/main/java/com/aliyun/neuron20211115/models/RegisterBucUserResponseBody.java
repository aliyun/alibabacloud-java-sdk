// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RegisterBucUserResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public BucUser result;

    public static RegisterBucUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterBucUserResponseBody self = new RegisterBucUserResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterBucUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterBucUserResponseBody setResult(BucUser result) {
        this.result = result;
        return this;
    }
    public BucUser getResult() {
        return this.result;
    }

}
