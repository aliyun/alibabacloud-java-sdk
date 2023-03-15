// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateRepoForkResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Long result;

    public static CreateRepoForkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoForkResponseBody self = new CreateRepoForkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRepoForkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRepoForkResponseBody setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

}
