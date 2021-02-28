// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class BatchSetScdnDomainConfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchSetScdnDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSetScdnDomainConfigsResponseBody self = new BatchSetScdnDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSetScdnDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
