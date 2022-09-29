// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateDeveloperResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Developer result;

    public static CreateDeveloperResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDeveloperResponseBody self = new CreateDeveloperResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDeveloperResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDeveloperResponseBody setResult(Developer result) {
        this.result = result;
        return this;
    }
    public Developer getResult() {
        return this.result;
    }

}
