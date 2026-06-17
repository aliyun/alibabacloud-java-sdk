// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ApprovePolarClawDevicePairRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The pairing request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>req-abc-123</p>
     */
    @NameInMap("PairRequestId")
    public String pairRequestId;

    public static ApprovePolarClawDevicePairRequest build(java.util.Map<String, ?> map) throws Exception {
        ApprovePolarClawDevicePairRequest self = new ApprovePolarClawDevicePairRequest();
        return TeaModel.build(map, self);
    }

    public ApprovePolarClawDevicePairRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ApprovePolarClawDevicePairRequest setPairRequestId(String pairRequestId) {
        this.pairRequestId = pairRequestId;
        return this;
    }
    public String getPairRequestId() {
        return this.pairRequestId;
    }

}
