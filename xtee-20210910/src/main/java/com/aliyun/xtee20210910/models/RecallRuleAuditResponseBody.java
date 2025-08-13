// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class RecallRuleAuditResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C7DC1C8-557F-5483-9E96-74D77A15EEB5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Return object</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
