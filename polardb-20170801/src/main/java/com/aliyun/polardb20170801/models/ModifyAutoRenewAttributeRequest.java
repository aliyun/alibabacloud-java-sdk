// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAutoRenewAttributeRequest extends TeaModel {
    @NameInMap("DBClusterIds")
    @Validation(required = true)
    public String DBClusterIds;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RenewalStatus")
    public String renewalStatus;

    @NameInMap("Duration")
    public String duration;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyAutoRenewAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoRenewAttributeRequest self = new ModifyAutoRenewAttributeRequest();
        return TeaModel.build(map, self);
    }

}
