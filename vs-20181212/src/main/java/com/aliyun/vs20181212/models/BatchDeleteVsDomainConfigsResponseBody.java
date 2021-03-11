// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchDeleteVsDomainConfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchDeleteVsDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteVsDomainConfigsResponseBody self = new BatchDeleteVsDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteVsDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
