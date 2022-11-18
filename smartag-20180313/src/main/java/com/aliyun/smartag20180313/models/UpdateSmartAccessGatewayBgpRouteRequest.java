// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayBgpRouteRequest extends TeaModel {
    @NameInMap("CrossAccount")
    public Boolean crossAccount;

    @NameInMap("HoldTime")
    public Integer holdTime;

    @NameInMap("KeepAlive")
    public Integer keepAlive;

    @NameInMap("LocalAs")
    public Long localAs;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceUid")
    public String resourceUid;

    @NameInMap("RouterId")
    public String routerId;

    @NameInMap("SagInsId")
    public String sagInsId;

    @NameInMap("SagSn")
    public String sagSn;

    public static UpdateSmartAccessGatewayBgpRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayBgpRouteRequest self = new UpdateSmartAccessGatewayBgpRouteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayBgpRouteRequest setCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
        return this;
    }
    public Boolean getCrossAccount() {
        return this.crossAccount;
    }

    public UpdateSmartAccessGatewayBgpRouteRequest setHoldTime(Integer holdTime) {
        this.holdTime = holdTime;
        return this;
    }
    public Integer getHoldTime() {
        return this.holdTime;
    }

    public UpdateSmartAccessGatewayBgpRouteRequest setKeepAlive(Integer keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }
    public Integer getKeepAlive() {
        return this.keepAlive;
    }

    public UpdateSmartAccessGatewayBgpRouteRequest setLocalAs(Long localAs) {
        this.localAs = localAs;
        return this;
    }
    public Long getLocalAs() {
        return this.localAs;
    }

    public UpdateSmartAccessGatewayBgpRouteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSmartAccessGatewayBgpRouteRequest setResourceUid(String resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public String getResourceUid() {
        return this.resourceUid;
    }

    public UpdateSmartAccessGatewayBgpRouteRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public UpdateSmartAccessGatewayBgpRouteRequest setSagInsId(String sagInsId) {
        this.sagInsId = sagInsId;
        return this;
    }
    public String getSagInsId() {
        return this.sagInsId;
    }

    public UpdateSmartAccessGatewayBgpRouteRequest setSagSn(String sagSn) {
        this.sagSn = sagSn;
        return this;
    }
    public String getSagSn() {
        return this.sagSn;
    }

}
