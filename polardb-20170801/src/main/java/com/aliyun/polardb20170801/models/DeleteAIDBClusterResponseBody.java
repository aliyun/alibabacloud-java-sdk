// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAIDBClusterResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-*****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3F9E6A3B-C13E-4064-A010-18582A******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAIDBClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIDBClusterResponseBody self = new DeleteAIDBClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAIDBClusterResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteAIDBClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
