// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class BatchUpdateScdnDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchUpdateScdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateScdnDomainResponseBody self = new BatchUpdateScdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUpdateScdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
