// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyDatabaseDescriptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDatabaseDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseDescriptionResponseBody self = new ModifyDatabaseDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
