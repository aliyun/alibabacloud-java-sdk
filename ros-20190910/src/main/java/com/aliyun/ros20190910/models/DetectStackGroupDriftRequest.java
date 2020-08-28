// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackGroupDriftRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StackGroupName")
    @Validation(required = true)
    public String stackGroupName;

    @NameInMap("OperationPreferences")
    public java.util.Map<String, ?> operationPreferences;

    public static DetectStackGroupDriftRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectStackGroupDriftRequest self = new DetectStackGroupDriftRequest();
        return TeaModel.build(map, self);
    }

}
