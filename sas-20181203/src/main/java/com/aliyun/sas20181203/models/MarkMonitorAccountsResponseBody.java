// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class MarkMonitorAccountsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB3936FA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MarkMonitorAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MarkMonitorAccountsResponseBody self = new MarkMonitorAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public MarkMonitorAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
