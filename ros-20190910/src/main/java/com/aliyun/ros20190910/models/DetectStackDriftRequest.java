// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackDriftRequest extends TeaModel {
    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("LogicalResourceId")
    public java.util.List<String> logicalResourceId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DetectStackDriftRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectStackDriftRequest self = new DetectStackDriftRequest();
        return TeaModel.build(map, self);
    }

}
