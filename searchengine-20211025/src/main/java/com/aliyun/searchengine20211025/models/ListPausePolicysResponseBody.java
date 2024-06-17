// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListPausePolicysResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>2AE63638-5420-56DC-BF59-37D8174039A0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Map</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ResultValue> result;

    public static ListPausePolicysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPausePolicysResponseBody self = new ListPausePolicysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPausePolicysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPausePolicysResponseBody setResult(java.util.Map<String, ResultValue> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ResultValue> getResult() {
        return this.result;
    }

}
