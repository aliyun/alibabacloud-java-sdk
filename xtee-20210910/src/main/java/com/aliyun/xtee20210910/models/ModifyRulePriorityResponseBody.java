// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyRulePriorityResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public Boolean resultObject;

    public static ModifyRulePriorityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRulePriorityResponseBody self = new ModifyRulePriorityResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRulePriorityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyRulePriorityResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
