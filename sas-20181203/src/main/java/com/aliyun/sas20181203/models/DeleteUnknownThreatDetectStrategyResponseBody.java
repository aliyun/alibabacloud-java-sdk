// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteUnknownThreatDetectStrategyResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D03DD0FD-6041-5107-AC00-383E28F1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUnknownThreatDetectStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUnknownThreatDetectStrategyResponseBody self = new DeleteUnknownThreatDetectStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUnknownThreatDetectStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
