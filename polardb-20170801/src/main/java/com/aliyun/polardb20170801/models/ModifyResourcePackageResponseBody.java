// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyResourcePackageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E56531A4-E552-40BA-9C58-137B80******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyResourcePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourcePackageResponseBody self = new ModifyResourcePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyResourcePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
