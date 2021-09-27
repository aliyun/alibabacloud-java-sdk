// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DeleteQuotaResponseBody extends TeaModel {
    // 资源配额id
    @NameInMap("QuotaId")
    public String quotaId;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteQuotaResponseBody self = new DeleteQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteQuotaResponseBody setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public DeleteQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
