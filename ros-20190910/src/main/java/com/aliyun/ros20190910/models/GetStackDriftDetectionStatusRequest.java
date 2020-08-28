// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackDriftDetectionStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DriftDetectionId")
    @Validation(required = true)
    public String driftDetectionId;

    public static GetStackDriftDetectionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackDriftDetectionStatusRequest self = new GetStackDriftDetectionStatusRequest();
        return TeaModel.build(map, self);
    }

}
