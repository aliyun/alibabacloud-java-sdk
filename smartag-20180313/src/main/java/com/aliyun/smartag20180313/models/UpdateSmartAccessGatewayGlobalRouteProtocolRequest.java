// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayGlobalRouteProtocolRequest extends TeaModel {
    @NameInMap("CrossAccount")
    public Boolean crossAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceUid")
    public String resourceUid;

    @NameInMap("RouteProtocol")
    public String routeProtocol;

    @NameInMap("SagInsId")
    public String sagInsId;

    @NameInMap("SagSn")
    public String sagSn;

    public static UpdateSmartAccessGatewayGlobalRouteProtocolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayGlobalRouteProtocolRequest self = new UpdateSmartAccessGatewayGlobalRouteProtocolRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayGlobalRouteProtocolRequest setCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
        return this;
    }
    public Boolean getCrossAccount() {
        return this.crossAccount;
    }

    public UpdateSmartAccessGatewayGlobalRouteProtocolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSmartAccessGatewayGlobalRouteProtocolRequest setResourceUid(String resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public String getResourceUid() {
        return this.resourceUid;
    }

    public UpdateSmartAccessGatewayGlobalRouteProtocolRequest setRouteProtocol(String routeProtocol) {
        this.routeProtocol = routeProtocol;
        return this;
    }
    public String getRouteProtocol() {
        return this.routeProtocol;
    }

    public UpdateSmartAccessGatewayGlobalRouteProtocolRequest setSagInsId(String sagInsId) {
        this.sagInsId = sagInsId;
        return this;
    }
    public String getSagInsId() {
        return this.sagInsId;
    }

    public UpdateSmartAccessGatewayGlobalRouteProtocolRequest setSagSn(String sagSn) {
        this.sagSn = sagSn;
        return this;
    }
    public String getSagSn() {
        return this.sagSn;
    }

}
