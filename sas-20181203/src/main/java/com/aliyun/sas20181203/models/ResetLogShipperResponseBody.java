// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ResetLogShipperResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D2E31293-DAAC-574B-B816-A18EA0A6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetLogShipperResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetLogShipperResponseBody self = new ResetLogShipperResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetLogShipperResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
