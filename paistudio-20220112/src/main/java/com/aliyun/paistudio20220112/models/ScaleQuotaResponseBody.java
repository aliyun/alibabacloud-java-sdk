// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ScaleQuotaResponseBody extends TeaModel {
    /**
     * <p>Quota Id</p>
     * 
     * <strong>example:</strong>
     * <p>quotamtl37ge7gkvdz</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <strong>example:</strong>
     * <p>F2D0392B-D749-5C48-A98A-3FAE5C9444A6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ScaleQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScaleQuotaResponseBody self = new ScaleQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public ScaleQuotaResponseBody setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public ScaleQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
