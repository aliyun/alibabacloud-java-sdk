// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectRuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFileProtectRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectRuleResponseBody self = new UpdateFileProtectRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
