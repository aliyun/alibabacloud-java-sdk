// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockRefreshResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CF8C834-8028-5E01-96E2-0F065EA99F6D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebLockRefreshResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockRefreshResponseBody self = new ModifyWebLockRefreshResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockRefreshResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
