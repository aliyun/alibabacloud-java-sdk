// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class CheckScdnServiceResponseBody extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("InDebt")
    public Boolean inDebt;

    @NameInMap("InDebtOverdue")
    public Boolean inDebtOverdue;

    @NameInMap("OnService")
    public Boolean onService;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckScdnServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckScdnServiceResponseBody self = new CheckScdnServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckScdnServiceResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CheckScdnServiceResponseBody setInDebt(Boolean inDebt) {
        this.inDebt = inDebt;
        return this;
    }
    public Boolean getInDebt() {
        return this.inDebt;
    }

    public CheckScdnServiceResponseBody setInDebtOverdue(Boolean inDebtOverdue) {
        this.inDebtOverdue = inDebtOverdue;
        return this;
    }
    public Boolean getInDebtOverdue() {
        return this.inDebtOverdue;
    }

    public CheckScdnServiceResponseBody setOnService(Boolean onService) {
        this.onService = onService;
        return this;
    }
    public Boolean getOnService() {
        return this.onService;
    }

    public CheckScdnServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
