// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DropDedicatedHostUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DropDedicatedHostUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DropDedicatedHostUserResponseBody self = new DropDedicatedHostUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DropDedicatedHostUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
