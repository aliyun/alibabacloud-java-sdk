// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteExpressConnectRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RouterInterfaceId")
    @Validation(required = true)
    public String routerInterfaceId;

    @NameInMap("Force")
    public Boolean force;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteExpressConnectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressConnectRequest self = new DeleteExpressConnectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExpressConnectRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteExpressConnectRequest setRouterInterfaceId(String routerInterfaceId) {
        this.routerInterfaceId = routerInterfaceId;
        return this;
    }
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

    public DeleteExpressConnectRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteExpressConnectRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
