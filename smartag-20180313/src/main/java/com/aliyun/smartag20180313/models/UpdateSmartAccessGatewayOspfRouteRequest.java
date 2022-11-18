// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayOspfRouteRequest extends TeaModel {
    @NameInMap("AreaId")
    public Integer areaId;

    @NameInMap("AuthenticationType")
    public String authenticationType;

    @NameInMap("CrossAccount")
    public Boolean crossAccount;

    @NameInMap("DeadTime")
    public Integer deadTime;

    @NameInMap("HelloTime")
    public Integer helloTime;

    @NameInMap("InterfaceName")
    public String interfaceName;

    @NameInMap("Md5Key")
    public String md5Key;

    @NameInMap("Md5KeyId")
    public Integer md5KeyId;

    @NameInMap("Networks")
    public String networks;

    @NameInMap("OspfCost")
    public Integer ospfCost;

    @NameInMap("OspfNetworkType")
    public String ospfNetworkType;

    @NameInMap("Password")
    public String password;

    @NameInMap("RedistributeProtocol")
    public String redistributeProtocol;

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

    public static UpdateSmartAccessGatewayOspfRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayOspfRouteRequest self = new UpdateSmartAccessGatewayOspfRouteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setAreaId(Integer areaId) {
        this.areaId = areaId;
        return this;
    }
    public Integer getAreaId() {
        return this.areaId;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setCrossAccount(Boolean crossAccount) {
        this.crossAccount = crossAccount;
        return this;
    }
    public Boolean getCrossAccount() {
        return this.crossAccount;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setDeadTime(Integer deadTime) {
        this.deadTime = deadTime;
        return this;
    }
    public Integer getDeadTime() {
        return this.deadTime;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setHelloTime(Integer helloTime) {
        this.helloTime = helloTime;
        return this;
    }
    public Integer getHelloTime() {
        return this.helloTime;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }
    public String getInterfaceName() {
        return this.interfaceName;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setMd5Key(String md5Key) {
        this.md5Key = md5Key;
        return this;
    }
    public String getMd5Key() {
        return this.md5Key;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setMd5KeyId(Integer md5KeyId) {
        this.md5KeyId = md5KeyId;
        return this;
    }
    public Integer getMd5KeyId() {
        return this.md5KeyId;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setNetworks(String networks) {
        this.networks = networks;
        return this;
    }
    public String getNetworks() {
        return this.networks;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setOspfCost(Integer ospfCost) {
        this.ospfCost = ospfCost;
        return this;
    }
    public Integer getOspfCost() {
        return this.ospfCost;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setOspfNetworkType(String ospfNetworkType) {
        this.ospfNetworkType = ospfNetworkType;
        return this;
    }
    public String getOspfNetworkType() {
        return this.ospfNetworkType;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setRedistributeProtocol(String redistributeProtocol) {
        this.redistributeProtocol = redistributeProtocol;
        return this;
    }
    public String getRedistributeProtocol() {
        return this.redistributeProtocol;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setResourceUid(String resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public String getResourceUid() {
        return this.resourceUid;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setSagInsId(String sagInsId) {
        this.sagInsId = sagInsId;
        return this;
    }
    public String getSagInsId() {
        return this.sagInsId;
    }

    public UpdateSmartAccessGatewayOspfRouteRequest setSagSn(String sagSn) {
        this.sagSn = sagSn;
        return this;
    }
    public String getSagSn() {
        return this.sagSn;
    }

}
