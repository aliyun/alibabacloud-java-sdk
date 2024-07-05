// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchSetVsDomainConfigsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9BEC5E85-C76B-56EF-A922-860EFDB8B64B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchSetVsDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSetVsDomainConfigsResponseBody self = new BatchSetVsDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSetVsDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
