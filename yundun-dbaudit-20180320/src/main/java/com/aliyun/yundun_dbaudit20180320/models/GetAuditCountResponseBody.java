// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAuditCountResponseBody extends TeaModel {
    @NameInMap("SessionCount")
    public Long sessionCount;

    @NameInMap("SqlCount")
    public Long sqlCount;

    @NameInMap("RiskCount")
    public Long riskCount;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAuditCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuditCountResponseBody self = new GetAuditCountResponseBody();
        return TeaModel.build(map, self);
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

    public GetAuditCountResponseBody setRiskCount(Long riskCount) {
        this.riskCount = riskCount;
        return this;
    }
    public Long getRiskCount() {
        return this.riskCount;
    }

    public GetAuditCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
