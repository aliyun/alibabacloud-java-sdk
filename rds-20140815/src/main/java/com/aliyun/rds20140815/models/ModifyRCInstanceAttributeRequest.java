// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceAttributeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the release protection feature for the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the release protection feature.</li>
     * <li><strong>false</strong> (default): does not enable the release protection feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The hostname of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>testHost1</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf62br2491p5l****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <strong>example:</strong>
     * <p>k8s-node</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The new password of the instance.</p>
     * <ul>
     * <li>The value must be 8 to 30 characters in length.</li>
     * <li>The value must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include <code>()</code> ~ ! @ # $ % ^ &amp; \* - _ + = \`</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2F9e9@a69c!e18b569c8</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to restart the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Reboot")
    public Boolean reboot;

    /**
     * <p>The region ID of the instance. You can call the DescribeRegions operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the security group to which the instance is added.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-uf6av412xaxixu****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    public static ModifyRCInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceAttributeRequest self = new ModifyRCInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceAttributeRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public ModifyRCInstanceAttributeRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ModifyRCInstanceAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyRCInstanceAttributeRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ModifyRCInstanceAttributeRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyRCInstanceAttributeRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyRCInstanceAttributeRequest setReboot(Boolean reboot) {
        this.reboot = reboot;
        return this;
    }
    public Boolean getReboot() {
        return this.reboot;
    }

    public ModifyRCInstanceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyRCInstanceAttributeRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifyRCInstanceAttributeRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

}
