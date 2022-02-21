// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpgradeRenderingDevicesImageRequest extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static UpgradeRenderingDevicesImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeRenderingDevicesImageRequest self = new UpgradeRenderingDevicesImageRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeRenderingDevicesImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpgradeRenderingDevicesImageRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public UpgradeRenderingDevicesImageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
