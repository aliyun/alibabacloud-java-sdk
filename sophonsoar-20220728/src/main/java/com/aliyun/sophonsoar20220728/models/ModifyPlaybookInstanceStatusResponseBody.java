// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyPlaybookInstanceStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
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
