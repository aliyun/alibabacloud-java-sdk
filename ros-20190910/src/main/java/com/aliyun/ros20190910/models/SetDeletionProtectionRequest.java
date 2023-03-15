// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetDeletionProtectionRequest extends TeaModel {
    /**
     * <p>Indicates whether stack deletion protection is enabled. Valid values:</p>
     * <br>
     * <p>*   Enabled: enables the stack deletion protection.</p>
     * <p>*   Disabled (default): Resource stack deletion protection is Disabled. You can use the console or API(DeleteStack) to release the stack resources.</p>
     * <br>
     * <p>>  The deletion of nested stacks is the same as the root stack.</p>
     */
    @NameInMap("DeletionProtection")
    public String deletionProtection;

    /**
     * <p>The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the stack.</p>
     * <br>
     * <p>The delete protection attribute of a nested stack is determined by the root stack and remains unchanged from the root stack.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    public static SetDeletionProtectionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDeletionProtectionRequest self = new SetDeletionProtectionRequest();
        return TeaModel.build(map, self);
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

    public SetDeletionProtectionRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
