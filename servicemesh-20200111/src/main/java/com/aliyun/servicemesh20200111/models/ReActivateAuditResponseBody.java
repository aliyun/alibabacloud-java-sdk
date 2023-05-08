// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ReActivateAuditResponseBody extends TeaModel {
    /**
     * <p>The name of the project that is used to store audit logs.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReActivateAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReActivateAuditResponseBody self = new ReActivateAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public ReActivateAuditResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ReActivateAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
