// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CancelUpdateStackRequest extends TeaModel {
    /**
     * <p>The method to cancel the update operation. Valid values:</p>
     * <br>
     * <p>*   Quick: cancels the update of a stack as soon as possible.</p>
     * <p>*   Safe: cancels the update of a stack as safely as possible.</p>
     */
    @NameInMap("CancelType")
    public String cancelType;

    /**
     * <p>The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the stack.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    public static CancelUpdateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelUpdateStackRequest self = new CancelUpdateStackRequest();
        return TeaModel.build(map, self);
    }

    public CancelUpdateStackRequest setCancelType(String cancelType) {
        this.cancelType = cancelType;
        return this;
    }
    public String getCancelType() {
        return this.cancelType;
    }

    public CancelUpdateStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelUpdateStackRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
