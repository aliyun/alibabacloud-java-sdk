// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnableDBClusterDynamoDBResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CD3FA5F3-FAF3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableDBClusterDynamoDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableDBClusterDynamoDBResponseBody self = new EnableDBClusterDynamoDBResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableDBClusterDynamoDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
