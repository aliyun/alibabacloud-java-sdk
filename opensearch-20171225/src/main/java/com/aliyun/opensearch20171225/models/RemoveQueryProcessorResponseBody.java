// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveQueryProcessorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>N/A</p>
     */
    @NameInMap("result")
    public String result;

    public static RemoveQueryProcessorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveQueryProcessorResponseBody self = new RemoveQueryProcessorResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveQueryProcessorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveQueryProcessorResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
