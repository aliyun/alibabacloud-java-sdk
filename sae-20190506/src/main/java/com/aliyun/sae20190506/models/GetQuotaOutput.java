// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetQuotaOutput extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("instanceLimit")
    public Long instanceLimit;

    @NameInMap("instanceUsed")
    public Long instanceUsed;

    public static GetQuotaOutput build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaOutput self = new GetQuotaOutput();
        return TeaModel.build(map, self);
    }

    public GetQuotaOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQuotaOutput setInstanceLimit(Long instanceLimit) {
        this.instanceLimit = instanceLimit;
        return this;
    }
    public Long getInstanceLimit() {
        return this.instanceLimit;
    }

    public GetQuotaOutput setInstanceUsed(Long instanceUsed) {
        this.instanceUsed = instanceUsed;
        return this;
    }
    public Long getInstanceUsed() {
        return this.instanceUsed;
    }

}
