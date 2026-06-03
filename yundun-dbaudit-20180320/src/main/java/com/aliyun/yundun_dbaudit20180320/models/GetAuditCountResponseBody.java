// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAuditCountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E6A08A8A-F962-4FAD-AF0C-86B393E1F9C1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("RiskCount")
    public Long riskCount;

    /**
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("SessionCount")
    public Long sessionCount;

    /**
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("SqlCount")
    public Long sqlCount;

    public static GetAuditCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuditCountResponseBody self = new GetAuditCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuditCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuditCountResponseBody setRiskCount(Long riskCount) {
        this.riskCount = riskCount;
        return this;
    }
    public Long getRiskCount() {
        return this.riskCount;
    }

    public GetAuditCountResponseBody setSessionCount(Long sessionCount) {
        this.sessionCount = sessionCount;
        return this;
    }
    public Long getSessionCount() {
        return this.sessionCount;
    }

    public GetAuditCountResponseBody setSqlCount(Long sqlCount) {
        this.sqlCount = sqlCount;
        return this;
    }
    public Long getSqlCount() {
        return this.sqlCount;
    }

}
