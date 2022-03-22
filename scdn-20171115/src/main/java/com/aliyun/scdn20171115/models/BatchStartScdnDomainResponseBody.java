// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class BatchStartScdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchStartScdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchStartScdnDomainResponseBody self = new BatchStartScdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchStartScdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
