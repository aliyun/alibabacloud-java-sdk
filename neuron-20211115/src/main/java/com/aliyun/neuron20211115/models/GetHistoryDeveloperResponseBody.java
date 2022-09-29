// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetHistoryDeveloperResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Developer result;

    public static GetHistoryDeveloperResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryDeveloperResponseBody self = new GetHistoryDeveloperResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHistoryDeveloperResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHistoryDeveloperResponseBody setResult(Developer result) {
        this.result = result;
        return this;
    }
    public Developer getResult() {
        return this.result;
    }

}
