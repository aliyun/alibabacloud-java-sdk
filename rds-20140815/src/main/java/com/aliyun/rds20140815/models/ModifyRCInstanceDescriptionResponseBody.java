// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceDescriptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRCInstanceDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceDescriptionResponseBody self = new ModifyRCInstanceDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
