// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAgenticDBProjectResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F6A7B8C9-D0E1-2345-FABC-456789012345</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAgenticDBProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticDBProjectResponseBody self = new DeleteAgenticDBProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticDBProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
