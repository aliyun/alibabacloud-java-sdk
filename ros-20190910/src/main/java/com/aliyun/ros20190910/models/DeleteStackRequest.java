// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackRequest extends TeaModel {
    /**
     * <p>Stack deletion options.</p>
     */
    @NameInMap("DeleteOptions")
    public java.util.List<String> deleteOptions;

    /**
     * <p>Maximum number of concurrent resource operations.</p>
     * <p>Default: empty. Accepts an integer &gt;= 0.</p>
     * <blockquote>
     * <ul>
     * <li><p>A value greater than 0 is used as-is. A value of 0 or empty imposes no limit on ROS stacks. For Terraform stacks, the Terraform default (typically 10) applies.</p>
     * </li>
     * <li><p>This value persists on the stack and affects subsequent operations such as updates.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Parallelism")
    public Long parallelism;

    /**
     * <p>The RAM role name. ROS assumes this role to create the stack and call Alibaba Cloud service APIs.<br> Even if you have stack operation permissions but lack RAM role permissions, ROS still assumes the role. Ensure the role follows the least-privilege principle.<br> If empty, ROS cannot assume the existing RAM role associated with the stack. To have ROS assume a role, specify this parameter. If no RAM role is available, ROS uses a temporary credential from your account credentials.<br> Maximum length: 64 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>test-role</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The region ID of the stack. Call <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> to query available regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Whether to retain all resources in the stack.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false (default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RetainAllResources")
    public Boolean retainAllResources;

    /**
     * <p>Resources to retain.</p>
     * 
     * <strong>example:</strong>
     * <p>WebServer</p>
     */
    @NameInMap("RetainResources")
    public java.util.List<String> retainResources;

    /**
     * <p>The ID of the stack.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
     */
    @NameInMap("StackId")
    public String stackId;

    public static DeleteStackRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackRequest self = new DeleteStackRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStackRequest setDeleteOptions(java.util.List<String> deleteOptions) {
        this.deleteOptions = deleteOptions;
        return this;
    }
    public java.util.List<String> getDeleteOptions() {
        return this.deleteOptions;
    }

    public DeleteStackRequest setParallelism(Long parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Long getParallelism() {
        return this.parallelism;
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
