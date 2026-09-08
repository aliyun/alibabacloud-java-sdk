// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class UpgradeKernelVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeKernelVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeKernelVersionResponseBody self = new UpgradeKernelVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeKernelVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
