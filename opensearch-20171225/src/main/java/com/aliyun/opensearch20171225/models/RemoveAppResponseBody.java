// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveAppResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>33477D76-C380-2D84-A4AD-043F52876CB1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The return result.</p>
     */
    @NameInMap("result")
    public java.util.List<Integer> result;

    public static RemoveAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAppResponseBody self = new RemoveAppResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveAppResponseBody setResult(java.util.List<Integer> result) {
        this.result = result;
        return this;
    }
    public java.util.List<Integer> getResult() {
        return this.result;
    }

}
