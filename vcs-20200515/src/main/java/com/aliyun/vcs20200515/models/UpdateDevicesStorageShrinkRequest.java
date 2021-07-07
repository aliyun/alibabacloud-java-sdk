// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateDevicesStorageShrinkRequest extends TeaModel {
    @NameInMap("UpdateStorageRequests")
    public String updateStorageRequestsShrink;

    public static UpdateDevicesStorageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevicesStorageShrinkRequest self = new UpdateDevicesStorageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDevicesStorageShrinkRequest setUpdateStorageRequestsShrink(String updateStorageRequestsShrink) {
        this.updateStorageRequestsShrink = updateStorageRequestsShrink;
        return this;
    }
    public String getUpdateStorageRequestsShrink() {
        return this.updateStorageRequestsShrink;
    }

}
