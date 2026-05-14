// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RejectPolarClawDevicePairRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>req-abc-123</p>
     */
    @NameInMap("PairRequestId")
    public String pairRequestId;

    public static RejectPolarClawDevicePairRequest build(java.util.Map<String, ?> map) throws Exception {
        RejectPolarClawDevicePairRequest self = new RejectPolarClawDevicePairRequest();
        return TeaModel.build(map, self);
    }

    public RejectPolarClawDevicePairRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public RejectPolarClawDevicePairRequest setPairRequestId(String pairRequestId) {
        this.pairRequestId = pairRequestId;
        return this;
    }
    public String getPairRequestId() {
        return this.pairRequestId;
    }

}
