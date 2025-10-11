// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ResetAccountPasswordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3AA69096-757C-4647-B36C-29EBC2******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetAccountPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountPasswordResponseBody self = new ResetAccountPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAccountPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
