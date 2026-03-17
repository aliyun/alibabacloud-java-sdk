// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DisassociateACLResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B28A9AB3-05BD-4A88-AB6A-A555A0BF70C0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisassociateACLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisassociateACLResponseBody self = new DisassociateACLResponseBody();
        return TeaModel.build(map, self);
    }

    public DisassociateACLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
