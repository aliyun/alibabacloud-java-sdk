// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class AssociateDefaultFilterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateDefaultFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateDefaultFilterResponseBody self = new AssociateDefaultFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateDefaultFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
