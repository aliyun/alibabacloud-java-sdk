// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAIDBClusterTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pm-2ze9***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>pc-2zejpr***</p>
     */
    @NameInMap("RelativeDBClusterId")
    public String relativeDBClusterId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E56531A4-E552-40BA-9C58-137B80******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAIDBClusterTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIDBClusterTaskResponseBody self = new DeleteAIDBClusterTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAIDBClusterTaskResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteAIDBClusterTaskResponseBody setRelativeDBClusterId(String relativeDBClusterId) {
        this.relativeDBClusterId = relativeDBClusterId;
        return this;
    }
    public String getRelativeDBClusterId() {
        return this.relativeDBClusterId;
    }

    public DeleteAIDBClusterTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
