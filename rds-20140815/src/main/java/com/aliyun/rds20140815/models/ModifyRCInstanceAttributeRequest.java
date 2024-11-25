// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceAttributeRequest extends TeaModel {
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

    public static ModifyRCInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceAttributeRequest self = new ModifyRCInstanceAttributeRequest();
        return TeaModel.build(map, self);
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

}
