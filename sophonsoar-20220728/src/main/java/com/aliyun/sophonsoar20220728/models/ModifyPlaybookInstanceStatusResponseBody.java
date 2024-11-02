// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyPlaybookInstanceStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C2A32830-2842-5F8F-B4ED-E4783E400BBE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPlaybookInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPlaybookInstanceStatusResponseBody self = new ModifyPlaybookInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPlaybookInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
