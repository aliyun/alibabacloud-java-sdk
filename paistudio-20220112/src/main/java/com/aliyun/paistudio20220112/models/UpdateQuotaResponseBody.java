// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UpdateQuotaResponseBody extends TeaModel {
    /**
     * <p>Quota Id</p>
     * 
     * <strong>example:</strong>
     * <p>quota-20210126170216-mtl37ge7gkvdz</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <strong>example:</strong>
     * <p>96496E6E-00B4-5F55-80F6-1844FA9E92DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaResponseBody self = new UpdateQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaResponseBody setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public UpdateQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
