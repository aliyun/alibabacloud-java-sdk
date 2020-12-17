// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetDeletionProtectionRequest extends TeaModel {
    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("DeletionProtection")
    @Validation(required = true)
    public String deletionProtection;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static SetDeletionProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDeletionProtectionRequest self = new SetDeletionProtectionRequest();
        return TeaModel.build(map, self);
    }

    public SetDeletionProtectionRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public SetDeletionProtectionRequest setDeletionProtection(String deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public String getDeletionProtection() {
        return this.deletionProtection;
    }

    public SetDeletionProtectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
