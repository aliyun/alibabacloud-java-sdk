// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CloneParameterGroupRequest extends TeaModel {
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

    @NameInMap("TargetRegionId")
    @Validation(required = true)
    public String targetRegionId;

    @NameInMap("ParameterGroupId")
    @Validation(required = true)
    public String parameterGroupId;

    @NameInMap("ParameterGroupName")
    @Validation(required = true)
    public String parameterGroupName;

    @NameInMap("ParameterGroupDesc")
    public String parameterGroupDesc;

    public static CloneParameterGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneParameterGroupRequest self = new CloneParameterGroupRequest();
        return TeaModel.build(map, self);
    }

}
