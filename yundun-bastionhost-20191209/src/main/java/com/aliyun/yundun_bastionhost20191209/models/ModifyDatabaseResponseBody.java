// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyDatabaseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseResponseBody self = new ModifyDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
