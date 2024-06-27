// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateRuleBaseResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public Boolean resultObject;

    public static UpdateRuleBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleBaseResponseBody self = new UpdateRuleBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRuleBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateRuleBaseResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

}
