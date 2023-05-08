// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static ModifyInterceptionTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInterceptionTargetResponseBody self = new ModifyInterceptionTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInterceptionTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyInterceptionTargetResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
