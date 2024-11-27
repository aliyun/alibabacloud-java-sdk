// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyDatabaseAccountResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>850FA4B4-5BD2-5269-903E-3B7E07E6C975</p>
     */
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
