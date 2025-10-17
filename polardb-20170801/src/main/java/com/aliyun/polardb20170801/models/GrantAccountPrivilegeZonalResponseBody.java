// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GrantAccountPrivilegeZonalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GrantAccountPrivilegeZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantAccountPrivilegeZonalResponseBody self = new GrantAccountPrivilegeZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantAccountPrivilegeZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
