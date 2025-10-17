// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RevokeAccountPrivilegeZonalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F9F1CB1A-B1D5-4EF5-A53A-************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeAccountPrivilegeZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeAccountPrivilegeZonalResponseBody self = new RevokeAccountPrivilegeZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeAccountPrivilegeZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
