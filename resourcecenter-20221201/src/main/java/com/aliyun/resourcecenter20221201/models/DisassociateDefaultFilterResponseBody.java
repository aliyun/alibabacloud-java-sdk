// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class DisassociateDefaultFilterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisassociateDefaultFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisassociateDefaultFilterResponseBody self = new DisassociateDefaultFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public DisassociateDefaultFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
