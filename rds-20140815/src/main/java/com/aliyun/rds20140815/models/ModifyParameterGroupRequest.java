// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyParameterGroupRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ParameterGroupId")
    @Validation(required = true)
    public String parameterGroupId;

    @NameInMap("ParameterGroupName")
    public String parameterGroupName;

    @NameInMap("ParameterGroupDesc")
    public String parameterGroupDesc;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static ModifyParameterGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyParameterGroupRequest self = new ModifyParameterGroupRequest();
        return TeaModel.build(map, self);
    }

}
