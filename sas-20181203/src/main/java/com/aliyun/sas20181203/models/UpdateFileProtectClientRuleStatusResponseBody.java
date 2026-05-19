// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectClientRuleStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFileProtectClientRuleStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectClientRuleStatusResponseBody self = new UpdateFileProtectClientRuleStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectClientRuleStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
