// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AllocateReadWriteSplittingConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AllocateReadWriteSplittingConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateReadWriteSplittingConnectionResponse self = new AllocateReadWriteSplittingConnectionResponse();
        return TeaModel.build(map, self);
    }

    public AllocateReadWriteSplittingConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
