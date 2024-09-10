// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteFileProtectRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7FD1C1DC-AA67-510A-A022-5D23310C3658</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFileProtectRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileProtectRuleResponseBody self = new DeleteFileProtectRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFileProtectRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
