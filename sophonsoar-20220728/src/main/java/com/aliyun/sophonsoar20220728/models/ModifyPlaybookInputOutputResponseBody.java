// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyPlaybookInputOutputResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPlaybookInputOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPlaybookInputOutputResponseBody self = new ModifyPlaybookInputOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPlaybookInputOutputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
