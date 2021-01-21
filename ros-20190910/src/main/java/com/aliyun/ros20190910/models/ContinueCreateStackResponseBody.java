// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ContinueCreateStackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StackId")
    public String stackId;

    public static ContinueCreateStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ContinueCreateStackResponseBody self = new ContinueCreateStackResponseBody();
        return TeaModel.build(map, self);
    }

    public ContinueCreateStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ContinueCreateStackResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
