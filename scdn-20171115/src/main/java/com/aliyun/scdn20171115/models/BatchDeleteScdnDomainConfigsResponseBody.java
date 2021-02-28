// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class BatchDeleteScdnDomainConfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchDeleteScdnDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteScdnDomainConfigsResponseBody self = new BatchDeleteScdnDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteScdnDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
