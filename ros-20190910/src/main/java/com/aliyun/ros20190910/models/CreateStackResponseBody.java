// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The stack ID.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    public static CreateStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStackResponseBody self = new CreateStackResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStackResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
