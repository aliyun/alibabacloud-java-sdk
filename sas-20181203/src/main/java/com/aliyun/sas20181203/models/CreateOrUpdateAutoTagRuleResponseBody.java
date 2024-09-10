// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOrUpdateAutoTagRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>33DCC98C-824D-55D6-8DC5-47F3A71AD867</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrUpdateAutoTagRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateAutoTagRuleResponseBody self = new CreateOrUpdateAutoTagRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateAutoTagRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
