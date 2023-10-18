// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateAuditResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAuditResponseBody self = new CreateAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
