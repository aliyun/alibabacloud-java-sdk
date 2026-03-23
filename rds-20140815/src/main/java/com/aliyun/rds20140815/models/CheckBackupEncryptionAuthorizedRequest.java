// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckBackupEncryptionAuthorizedRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CheckBackupEncryptionAuthorizedRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckBackupEncryptionAuthorizedRequest self = new CheckBackupEncryptionAuthorizedRequest();
        return TeaModel.build(map, self);
    }

    public CheckBackupEncryptionAuthorizedRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckBackupEncryptionAuthorizedRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
