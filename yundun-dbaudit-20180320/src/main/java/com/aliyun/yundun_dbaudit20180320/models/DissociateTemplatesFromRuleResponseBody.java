// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DissociateTemplatesFromRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DissociateTemplatesFromRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateTemplatesFromRuleResponseBody self = new DissociateTemplatesFromRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateTemplatesFromRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
