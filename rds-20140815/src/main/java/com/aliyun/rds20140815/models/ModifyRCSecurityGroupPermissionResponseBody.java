// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCSecurityGroupPermissionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AB44DC0A-7E77-442A-97A9-C6418694CB22</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRCSecurityGroupPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCSecurityGroupPermissionResponseBody self = new ModifyRCSecurityGroupPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRCSecurityGroupPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
