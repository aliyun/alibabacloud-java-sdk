// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReplaceRCInstanceSystemDiskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>m-2zec4lvlhcdkyd13****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <strong>example:</strong>
     * <p>rc-m5ei7b1w38w2l91x****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("IsLocalDisk")
    public Boolean isLocalDisk;

    /**
     * <strong>example:</strong>
     * <p>testKeyPairName</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <strong>example:</strong>
     * <p>testPassword</p>
     */
    @NameInMap("Password")
    public String password;

    /**
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
