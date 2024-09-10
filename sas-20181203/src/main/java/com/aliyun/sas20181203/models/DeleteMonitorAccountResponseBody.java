// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteMonitorAccountResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMonitorAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorAccountResponseBody self = new DeleteMonitorAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
