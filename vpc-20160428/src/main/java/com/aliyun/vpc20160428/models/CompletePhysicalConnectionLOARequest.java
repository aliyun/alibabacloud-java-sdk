// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CompletePhysicalConnectionLOARequest extends TeaModel {
    // description: Optional. The token used for client authentication.; 
    @NameInMap("ClientToken")
    public String clientToken;

    // description: The ID of the region where the leased line is deployed.; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    // description: The instance ID of the physical connection interface.; 
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    // description: The number of the leased line.; 
    @NameInMap("LineCode")
    @Validation(required = true)
    public String lineCode;

    // description: The label numbers of cables at the installation site.; 
    @NameInMap("LineLabel")
    @Validation(required = true)
    public String lineLabel;

    public static CompletePhysicalConnectionLOARequest build(java.util.Map<String, ?> map) throws Exception {
        CompletePhysicalConnectionLOARequest self = new CompletePhysicalConnectionLOARequest();
        return TeaModel.build(map, self);
    }

}
