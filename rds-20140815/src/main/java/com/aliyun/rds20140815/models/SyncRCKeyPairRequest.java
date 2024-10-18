// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SyncRCKeyPairRequest extends TeaModel {
    /**
     * <p>The name of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>customer_keypairs</p>
     */
    @NameInMap("KeyPairName")
    public String keyPairName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SyncMode")
    public Boolean syncMode;

    public static SyncRCKeyPairRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncRCKeyPairRequest self = new SyncRCKeyPairRequest();
        return TeaModel.build(map, self);
    }

    public SyncRCKeyPairRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public SyncRCKeyPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SyncRCKeyPairRequest setSyncMode(Boolean syncMode) {
        this.syncMode = syncMode;
        return this;
    }
    public Boolean getSyncMode() {
        return this.syncMode;
    }

}
