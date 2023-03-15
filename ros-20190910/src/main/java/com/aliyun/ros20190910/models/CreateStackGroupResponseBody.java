// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the stack group.</p>
     */
    @NameInMap("StackGroupId")
    public String stackGroupId;

    public static CreateStackGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStackGroupResponseBody self = new CreateStackGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStackGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStackGroupResponseBody setStackGroupId(String stackGroupId) {
        this.stackGroupId = stackGroupId;
        return this;
    }
    public String getStackGroupId() {
        return this.stackGroupId;
    }

}
