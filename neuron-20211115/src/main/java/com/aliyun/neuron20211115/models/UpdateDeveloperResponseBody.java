// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateDeveloperResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Developer result;

    public static UpdateDeveloperResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeveloperResponseBody self = new UpdateDeveloperResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDeveloperResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDeveloperResponseBody setResult(Developer result) {
        this.result = result;
        return this;
    }
    public Developer getResult() {
        return this.result;
    }

}
