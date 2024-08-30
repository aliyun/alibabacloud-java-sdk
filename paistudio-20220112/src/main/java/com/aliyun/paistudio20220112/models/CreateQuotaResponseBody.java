// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateQuotaResponseBody extends TeaModel {
    /**
     * <p>Quota Id</p>
     * 
     * <strong>example:</strong>
     * <p>quotad2kd8ljpsno</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <strong>example:</strong>
     * <p>CBF05F13-B24C-5129-9048-4FA684DCD579</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaResponseBody self = new CreateQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQuotaResponseBody setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public CreateQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
