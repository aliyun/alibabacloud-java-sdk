// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyBackupExpireTimeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B560AAD5-5027-51AD-A0D4-FA4DB1A76F40</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBackupExpireTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupExpireTimeResponseBody self = new ModifyBackupExpireTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBackupExpireTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
