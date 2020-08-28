// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackDriftResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DriftDetectionId")
    @Validation(required = true)
    public String driftDetectionId;

    public static DetectStackDriftResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectStackDriftResponse self = new DetectStackDriftResponse();
        return TeaModel.build(map, self);
    }

}
