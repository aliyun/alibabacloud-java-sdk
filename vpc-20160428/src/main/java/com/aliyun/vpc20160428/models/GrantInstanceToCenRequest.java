// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GrantInstanceToCenRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("InstanceType")
    @Validation(required = true)
    public String instanceType;

    @NameInMap("CenId")
    @Validation(required = true)
    public String cenId;

    @NameInMap("CenOwnerId")
    @Validation(required = true)
    public Long cenOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static GrantInstanceToCenRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantInstanceToCenRequest self = new GrantInstanceToCenRequest();
        return TeaModel.build(map, self);
    }

}
