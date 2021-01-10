// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListUserAnalyzerEntriesResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUserAnalyzerEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserAnalyzerEntriesResponseBody self = new ListUserAnalyzerEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserAnalyzerEntriesResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

    public ListUserAnalyzerEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
