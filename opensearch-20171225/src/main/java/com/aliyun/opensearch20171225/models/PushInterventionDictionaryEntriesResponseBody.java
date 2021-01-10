// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class PushInterventionDictionaryEntriesResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<String> result;

    @NameInMap("requestId")
    public String requestId;

    public static PushInterventionDictionaryEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushInterventionDictionaryEntriesResponseBody self = new PushInterventionDictionaryEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public PushInterventionDictionaryEntriesResponseBody setResult(java.util.List<String> result) {
        this.result = result;
        return this;
    }
    public java.util.List<String> getResult() {
        return this.result;
    }

    public PushInterventionDictionaryEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
