// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DetectStackResourceDriftRequest extends TeaModel {
    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("LogicalResourceId")
    @Validation(required = true)
    public String logicalResourceId;

    public static DetectStackResourceDriftRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectStackResourceDriftRequest self = new DetectStackResourceDriftRequest();
        return TeaModel.build(map, self);
    }

}
