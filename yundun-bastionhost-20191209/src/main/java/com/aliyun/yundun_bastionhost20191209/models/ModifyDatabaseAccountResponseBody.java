// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyDatabaseAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDatabaseAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseAccountResponseBody self = new ModifyDatabaseAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
