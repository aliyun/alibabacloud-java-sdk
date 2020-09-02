// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySnatEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifySnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySnatEntryResponse self = new ModifySnatEntryResponse();
        return TeaModel.build(map, self);
    }

    public ModifySnatEntryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
