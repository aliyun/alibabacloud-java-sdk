// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAutoDelConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3BFA659D-F44F-5703-8FD1-33AB596BEACA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAutoDelConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoDelConfigResponseBody self = new ModifyAutoDelConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAutoDelConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
