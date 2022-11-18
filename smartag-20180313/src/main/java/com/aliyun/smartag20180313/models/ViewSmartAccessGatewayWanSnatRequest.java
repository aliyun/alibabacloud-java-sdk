// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ViewSmartAccessGatewayWanSnatRequest extends TeaModel {
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

    public static ViewSmartAccessGatewayWanSnatRequest build(java.util.Map<String, ?> map) throws Exception {
        ViewSmartAccessGatewayWanSnatRequest self = new ViewSmartAccessGatewayWanSnatRequest();
        return TeaModel.build(map, self);
    }

    public ViewSmartAccessGatewayWanSnatRequest setCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
        return this;
    }
    public Boolean getCrossAccount() {
        return this.crossAccount;
    }

    public ViewSmartAccessGatewayWanSnatRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ViewSmartAccessGatewayWanSnatRequest setResourceUid(String resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public String getResourceUid() {
        return this.resourceUid;
    }

    public ViewSmartAccessGatewayWanSnatRequest setSagInsId(String sagInsId) {
        this.sagInsId = sagInsId;
        return this;
    }
    public String getSagInsId() {
        return this.sagInsId;
    }

    public ViewSmartAccessGatewayWanSnatRequest setSagSn(String sagSn) {
        this.sagSn = sagSn;
        return this;
    }
    public String getSagSn() {
        return this.sagSn;
    }

}
