// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAgenticDBBranchResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D4E5F6A7-B8C9-0123-DEFA-456789012DEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAgenticDBBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticDBBranchResponseBody self = new DeleteAgenticDBBranchResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticDBBranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
