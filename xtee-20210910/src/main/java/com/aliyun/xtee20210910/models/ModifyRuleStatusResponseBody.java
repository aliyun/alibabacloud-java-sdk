// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyRuleStatusResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

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
