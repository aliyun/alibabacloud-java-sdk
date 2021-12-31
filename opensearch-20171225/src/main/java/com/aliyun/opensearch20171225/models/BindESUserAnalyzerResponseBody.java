// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class BindESUserAnalyzerResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static BindESUserAnalyzerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindESUserAnalyzerResponseBody self = new BindESUserAnalyzerResponseBody();
        return TeaModel.build(map, self);
    }

    public BindESUserAnalyzerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindESUserAnalyzerResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
