// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveAppGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3AA29D02-54F3-8569-F71A-90E1B7BE4E7E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("result")
    public java.util.List<Integer> result;

    public static RemoveAppGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAppGroupResponseBody self = new RemoveAppGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveAppGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveAppGroupResponseBody setResult(java.util.List<Integer> result) {
        this.result = result;
        return this;
    }
    public java.util.List<Integer> getResult() {
        return this.result;
    }

}
