// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteGlobalDatabaseNetworkResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C61892A4-0850-4516-9E26-44D96C1782DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGlobalDatabaseNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalDatabaseNetworkResponseBody self = new DeleteGlobalDatabaseNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGlobalDatabaseNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
