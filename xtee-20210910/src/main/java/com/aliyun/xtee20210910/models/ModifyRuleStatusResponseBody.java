// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyRuleStatusResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Return object.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("resultObject")
    public Boolean resultObject;

    public static ModifyRuleStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRuleStatusResponseBody self = new ModifyRuleStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRuleStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyRuleStatusResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
