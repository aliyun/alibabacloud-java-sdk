// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateInterceptionTargetResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static CreateInterceptionTargetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInterceptionTargetResponseBody self = new CreateInterceptionTargetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInterceptionTargetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInterceptionTargetResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
