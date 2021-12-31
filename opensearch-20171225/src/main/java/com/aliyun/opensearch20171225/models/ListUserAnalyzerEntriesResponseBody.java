// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListUserAnalyzerEntriesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static ListUserAnalyzerEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserAnalyzerEntriesResponseBody self = new ListUserAnalyzerEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserAnalyzerEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserAnalyzerEntriesResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
