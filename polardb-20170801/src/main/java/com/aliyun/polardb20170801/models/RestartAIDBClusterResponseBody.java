// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestartAIDBClusterResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestartAIDBClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartAIDBClusterResponseBody self = new RestartAIDBClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartAIDBClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
