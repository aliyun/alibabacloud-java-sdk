// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AllocateReadWriteSplittingConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AllocateReadWriteSplittingConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateReadWriteSplittingConnectionResponseBody self = new AllocateReadWriteSplittingConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateReadWriteSplittingConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
