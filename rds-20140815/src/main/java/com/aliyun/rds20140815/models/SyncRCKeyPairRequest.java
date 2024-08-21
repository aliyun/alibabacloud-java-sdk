// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SyncRCKeyPairRequest extends TeaModel {
    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("RegionId")
    public String regionId;

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

}
