// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class UpdateQuotaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("quota")
    public Quota quota;

    /**
     * <strong>example:</strong>
     * <p>2BCFAE0A-9FA9-5F72-8E8B-724632BC19A9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaResponseBody self = new UpdateQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateQuotaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateQuotaResponseBody setQuota(Quota quota) {
        this.quota = quota;
        return this;
    }
    public Quota getQuota() {
        return this.quota;
    }

    public UpdateQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
