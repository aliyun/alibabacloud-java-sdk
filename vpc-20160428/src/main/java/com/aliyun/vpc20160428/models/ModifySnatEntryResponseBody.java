// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySnatEntryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySnatEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySnatEntryResponseBody self = new ModifySnatEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySnatEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
