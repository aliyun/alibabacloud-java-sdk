// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyDatabaseResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>162088A7-7D47-56A3-9D04-93DE7B6DBE1C</p>
     */
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
