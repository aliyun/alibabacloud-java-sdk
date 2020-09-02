// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CancelExpressCloudConnectionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("EccId")
    @Validation(required = true)
    public String eccId;

    public static CancelExpressCloudConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelExpressCloudConnectionRequest self = new CancelExpressCloudConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CancelExpressCloudConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelExpressCloudConnectionRequest setEccId(String eccId) {
        this.eccId = eccId;
        return this;
    }
    public String getEccId() {
        return this.eccId;
    }

}
