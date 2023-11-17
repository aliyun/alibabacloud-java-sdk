// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyPlaybookResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPlaybookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPlaybookResponseBody self = new ModifyPlaybookResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPlaybookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
