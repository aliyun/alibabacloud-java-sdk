// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeSecurityScoreRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>23AD0BD2-8771-5647-819E-6BA51E21****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeSecurityScoreRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeSecurityScoreRuleResponseBody self = new ChangeSecurityScoreRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeSecurityScoreRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
