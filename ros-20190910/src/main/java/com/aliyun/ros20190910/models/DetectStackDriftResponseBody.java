// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackDriftResponseBody extends TeaModel {
    /**
     * <p>The ID of the drift detection.</p>
     * 
     * <strong>example:</strong>
     * <p>a7044f0d-6f2e-4128-a307-4524ef88****</p>
     */
    @NameInMap("DriftDetectionId")
    public String driftDetectionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetectStackDriftResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectStackDriftResponseBody self = new DetectStackDriftResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectStackDriftResponseBody setDriftDetectionId(String driftDetectionId) {
        this.driftDetectionId = driftDetectionId;
        return this;
    }
    public String getDriftDetectionId() {
        return this.driftDetectionId;
    }

    public DetectStackDriftResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
