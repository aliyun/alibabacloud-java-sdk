// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyClientUserDNSResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BFE2D0C0-B69F-422D-A8A3-928AD511B471</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClientUserDNSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClientUserDNSResponseBody self = new ModifyClientUserDNSResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClientUserDNSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
