// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayWanSnatRequest extends TeaModel {
    @NameInMap("CrossAccount")
    public Boolean crossAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceUid")
    public String resourceUid;

    @NameInMap("SagInsId")
    public String sagInsId;

    @NameInMap("SagSn")
    public String sagSn;

    @NameInMap("Snat")
    public String snat;

    public static UpdateSmartAccessGatewayWanSnatRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayWanSnatRequest self = new UpdateSmartAccessGatewayWanSnatRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayWanSnatRequest setCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
        return this;
    }
    public Boolean getCrossAccount() {
        return this.crossAccount;
    }

    public UpdateSmartAccessGatewayWanSnatRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSmartAccessGatewayWanSnatRequest setResourceUid(String resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public String getResourceUid() {
        return this.resourceUid;
    }

    public UpdateSmartAccessGatewayWanSnatRequest setSagInsId(String sagInsId) {
        this.sagInsId = sagInsId;
        return this;
    }
    public String getSagInsId() {
        return this.sagInsId;
    }

    public UpdateSmartAccessGatewayWanSnatRequest setSagSn(String sagSn) {
        this.sagSn = sagSn;
        return this;
    }
    public String getSagSn() {
        return this.sagSn;
    }

    public UpdateSmartAccessGatewayWanSnatRequest setSnat(String snat) {
        this.snat = snat;
        return this;
    }
    public String getSnat() {
        return this.snat;
    }

}
