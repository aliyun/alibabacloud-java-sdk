// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the region to which the stack group belongs. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the stack group. The name must be unique in a region.</p>
     * <br>
     * <p>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or letter.</p>
     */
    @NameInMap("StackGroupName")
    public String stackGroupName;

    /**
     * <p>The ID of the account to which the stack belongs.</p>
     * <br>
     * <p>*   If the stack group is granted self-managed permissions, the stack belongs to an Alibaba Cloud account.</p>
     * <p>*   If the stack group is granted service-managed permissions, the stack belongs to a member in a resource directory.</p>
     * <br>
     * <p>>  For more information about the account, see [Overview](~~154578~~).</p>
     */
    @NameInMap("StackInstanceAccountId")
    public String stackInstanceAccountId;

    /**
     * <p>The ID of the region to which the stack belongs.</p>
     */
    @NameInMap("StackInstanceRegionId")
    public String stackInstanceRegionId;

    public static GetStackInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackInstanceRequest self = new GetStackInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetStackInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetStackInstanceRequest setStackGroupName(String stackGroupName) {
        this.stackGroupName = stackGroupName;
        return this;
    }
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public GetStackInstanceRequest setStackInstanceAccountId(String stackInstanceAccountId) {
        this.stackInstanceAccountId = stackInstanceAccountId;
        return this;
    }
    public String getStackInstanceAccountId() {
        return this.stackInstanceAccountId;
    }

    public GetStackInstanceRequest setStackInstanceRegionId(String stackInstanceRegionId) {
        this.stackInstanceRegionId = stackInstanceRegionId;
        return this;
    }
    public String getStackInstanceRegionId() {
        return this.stackInstanceRegionId;
    }

}
