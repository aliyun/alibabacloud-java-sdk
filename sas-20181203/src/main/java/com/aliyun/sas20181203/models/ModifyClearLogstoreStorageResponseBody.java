// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClearLogstoreStorageResponseBody extends TeaModel {
    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClearLogstoreStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClearLogstoreStorageResponseBody self = new ModifyClearLogstoreStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClearLogstoreStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
