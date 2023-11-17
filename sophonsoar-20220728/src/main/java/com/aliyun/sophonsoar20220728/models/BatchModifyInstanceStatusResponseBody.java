// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class BatchModifyInstanceStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchModifyInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchModifyInstanceStatusResponseBody self = new BatchModifyInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchModifyInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
