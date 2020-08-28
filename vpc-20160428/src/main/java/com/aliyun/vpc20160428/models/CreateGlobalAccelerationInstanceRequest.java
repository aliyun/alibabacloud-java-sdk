// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateGlobalAccelerationInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ServiceLocation")
    @Validation(required = true)
    public String serviceLocation;

    @NameInMap("Bandwidth")
    @Validation(required = true)
    public String bandwidth;

    @NameInMap("BandwidthType")
    public String bandwidthType;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateGlobalAccelerationInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalAccelerationInstanceRequest self = new CreateGlobalAccelerationInstanceRequest();
        return TeaModel.build(map, self);
    }

}
