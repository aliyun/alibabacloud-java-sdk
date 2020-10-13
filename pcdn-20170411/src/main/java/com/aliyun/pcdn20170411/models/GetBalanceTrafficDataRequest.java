// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetBalanceTrafficDataRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Version")
    @Validation(required = true)
    public String version;

    @NameInMap("DataInterval")
    public Integer dataInterval;

    @NameInMap("ResourceId")
    @Validation(required = true)
    public String resourceId;

    public static GetBalanceTrafficDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBalanceTrafficDataRequest self = new GetBalanceTrafficDataRequest();
        return TeaModel.build(map, self);
    }

    public GetBalanceTrafficDataRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GetBalanceTrafficDataRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetBalanceTrafficDataRequest setDataInterval(Integer dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public Integer getDataInterval() {
        return this.dataInterval;
    }

    public GetBalanceTrafficDataRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
