// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackGroupRequest extends TeaModel {
    /**
     * <p>The ID of the region to which the stack group belongs. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the stack group. The name must be unique in a region.</p>
     * <br>
     * <p>The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or a letter.</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    public static DeleteStackGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackGroupRequest self = new DeleteStackGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStackGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteStackGroupRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

}
