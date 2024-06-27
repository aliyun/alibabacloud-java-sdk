// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class RecallRuleAuditResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public Boolean resultObject;

    public static RecallRuleAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecallRuleAuditResponseBody self = new RecallRuleAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public RecallRuleAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecallRuleAuditResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
