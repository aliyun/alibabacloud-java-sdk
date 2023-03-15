// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackRequest extends TeaModel {
    /**
     * <p>The name of the RAM role. Resource Orchestration Service (ROS) assumes the RAM role to create the stack and uses credentials of the role to call the APIs of Alibaba Cloud services.</p>
     * <br>
     * <p>ROS assumes the RAM role to perform operations on the stack. If you have permissions to perform operations on the stack but do not have permissions to use the RAM role, ROS still assumes the RAM role. You must make sure that the least privileges are granted to the role.</p>
     * <br>
     * <p>If you leave this parameter empty when you call the DeleteStack operation, ROS cannot assume the existing RAM role that is associated with the stack. If you want ROS to assume a RAM role, you must specify this parameter. If no role is available for ROS to assume, ROS uses a temporary credential that is generated from the credentials of your account.</p>
     * <br>
     * <p>The name of the RAM role can be up to 64 bytes in length.</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to retain all resources in the stack.</p>
     * <br>
     * <p>Default value: false. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("RetainAllResources")
    public Boolean retainAllResources;

    @NameInMap("RetainResources")
    public java.util.List<String> retainResources;

    /**
     * <p>The ID of the stack.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    public static DeleteStackRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackRequest self = new DeleteStackRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStackRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public DeleteStackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteStackRequest setRetainAllResources(Boolean retainAllResources) {
        this.retainAllResources = retainAllResources;
        return this;
    }
    public Boolean getRetainAllResources() {
        return this.retainAllResources;
    }

    public DeleteStackRequest setRetainResources(java.util.List<String> retainResources) {
        this.retainResources = retainResources;
        return this;
    }
    public java.util.List<String> getRetainResources() {
        return this.retainResources;
    }

    public DeleteStackRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
