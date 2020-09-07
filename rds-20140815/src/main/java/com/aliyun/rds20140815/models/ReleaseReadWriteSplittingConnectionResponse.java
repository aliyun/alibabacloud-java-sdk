// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReleaseReadWriteSplittingConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ReleaseReadWriteSplittingConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseReadWriteSplittingConnectionResponse self = new ReleaseReadWriteSplittingConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseReadWriteSplittingConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
