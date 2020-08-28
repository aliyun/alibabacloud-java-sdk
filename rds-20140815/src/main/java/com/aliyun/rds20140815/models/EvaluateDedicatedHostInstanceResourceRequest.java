// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class EvaluateDedicatedHostInstanceResourceRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DedicatedHostGroupId")
    @Validation(required = true)
    public String dedicatedHostGroupId;

    @NameInMap("DiskType")
    public String diskType;

    @NameInMap("DiskSize")
    public String diskSize;

    @NameInMap("InstanceClassNames")
    @Validation(required = true)
    public String instanceClassNames;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("EngineVersion")
    @Validation(required = true)
    public String engineVersion;

    public static EvaluateDedicatedHostInstanceResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        EvaluateDedicatedHostInstanceResourceRequest self = new EvaluateDedicatedHostInstanceResourceRequest();
        return TeaModel.build(map, self);
    }

}
