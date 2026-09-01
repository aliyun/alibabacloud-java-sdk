// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateUnknownThreatDetectStrategyResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1383B0DB-D5D6-4B0C-9E6B-75939C******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUnknownThreatDetectStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUnknownThreatDetectStrategyResponseBody self = new UpdateUnknownThreatDetectStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUnknownThreatDetectStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
