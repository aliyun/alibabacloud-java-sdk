// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class SayHelloResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public String result;

    public static SayHelloResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SayHelloResponseBody self = new SayHelloResponseBody();
        return TeaModel.build(map, self);
    }

    public SayHelloResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SayHelloResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
