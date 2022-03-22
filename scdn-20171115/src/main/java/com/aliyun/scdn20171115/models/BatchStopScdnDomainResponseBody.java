// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class BatchStopScdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchStopScdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchStopScdnDomainResponseBody self = new BatchStopScdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchStopScdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
