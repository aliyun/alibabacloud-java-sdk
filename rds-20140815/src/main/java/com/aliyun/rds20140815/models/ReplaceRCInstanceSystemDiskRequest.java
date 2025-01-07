// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReplaceRCInstanceSystemDiskRequest extends TeaModel {
    /**
     * <p>The image ID that is used when you reinstall the OS.</p>
     * 
     * <strong>example:</strong>
     * <p>m-2zec4lvlhcdkyd13****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-m5ei7b1w38w2l91x****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The reserved parameter. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("IsLocalDisk")
    public Boolean isLocalDisk;

    /**
     * <p>The name of the new key pair. If you do not specify this parameter, you must reset the key pair after the OS is reinstalled.</p>
     * 
     * <strong>example:</strong>
     * <p>testKeyPairName</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The new logon password of the RDS Custom instance. If you do not specify this parameter, you must reset the logon password after the OS is reinstalled.</p>
     * <ul>
     * <li>The value must be 8 to 30 characters in length.</li>
     * <li>The value must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Supported special characters include: ( ) \` ~ ! @ # $ % ^ &amp; \* - _ + =</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testPassword</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ReplaceRCInstanceSystemDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceRCInstanceSystemDiskRequest self = new ReplaceRCInstanceSystemDiskRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceRCInstanceSystemDiskRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ReplaceRCInstanceSystemDiskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReplaceRCInstanceSystemDiskRequest setIsLocalDisk(Boolean isLocalDisk) {
        this.isLocalDisk = isLocalDisk;
        return this;
    }
    public Boolean getIsLocalDisk() {
        return this.isLocalDisk;
    }

    public ReplaceRCInstanceSystemDiskRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public ReplaceRCInstanceSystemDiskRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ReplaceRCInstanceSystemDiskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
