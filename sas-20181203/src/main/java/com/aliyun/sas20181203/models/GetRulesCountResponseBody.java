// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetRulesCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalSystemClientRuleCount")
    public Long totalSystemClientRuleCount;

    @NameInMap("TotalUserDefineRuleCount")
    public Long totalUserDefineRuleCount;

    public static GetRulesCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRulesCountResponseBody self = new GetRulesCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRulesCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRulesCountResponseBody setTotalSystemClientRuleCount(Long totalSystemClientRuleCount) {
        this.totalSystemClientRuleCount = totalSystemClientRuleCount;
        return this;
    }
    public Long getTotalSystemClientRuleCount() {
        return this.totalSystemClientRuleCount;
    }

    public GetRulesCountResponseBody setTotalUserDefineRuleCount(Long totalUserDefineRuleCount) {
        this.totalUserDefineRuleCount = totalUserDefineRuleCount;
        return this;
    }
    public Long getTotalUserDefineRuleCount() {
        return this.totalUserDefineRuleCount;
    }

}
