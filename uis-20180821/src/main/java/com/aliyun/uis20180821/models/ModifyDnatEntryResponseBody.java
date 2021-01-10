// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class ModifyDnatEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDnatEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDnatEntryResponseBody self = new ModifyDnatEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDnatEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
