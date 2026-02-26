// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DisableDBClusterDynamoDBResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>925B84D9-CA72-432C-95CF-738C22******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableDBClusterDynamoDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableDBClusterDynamoDBResponseBody self = new DisableDBClusterDynamoDBResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableDBClusterDynamoDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
