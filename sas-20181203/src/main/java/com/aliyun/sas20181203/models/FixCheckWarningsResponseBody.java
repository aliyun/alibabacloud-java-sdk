// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class FixCheckWarningsResponseBody extends TeaModel {
    /**
     * <p>FixCheckWarnings</p>
     */
    @NameInMap("BatchId")
    public Long batchId;

    @NameInMap("RequestId")
    public String requestId;

    public static FixCheckWarningsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FixCheckWarningsResponseBody self = new FixCheckWarningsResponseBody();
        return TeaModel.build(map, self);
    }

    public FixCheckWarningsResponseBody setBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }
    public Long getBatchId() {
        return this.batchId;
    }

    public FixCheckWarningsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
