// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateWhiteListStrategyStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>379a9b8f-107b-4630-9e95-2299a1ea****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWhiteListStrategyStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhiteListStrategyStatusResponseBody self = new UpdateWhiteListStrategyStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWhiteListStrategyStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
