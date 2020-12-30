// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetBalanceBandwidthDataRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Version")
    public String version;

    @NameInMap("DataInterval")
    public Integer dataInterval;

    @NameInMap("ResourceId")
    public String resourceId;

    public static GetBalanceBandwidthDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBalanceBandwidthDataRequest self = new GetBalanceBandwidthDataRequest();
        return TeaModel.build(map, self);
    }

    public GetBalanceBandwidthDataRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GetBalanceBandwidthDataRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetBalanceBandwidthDataRequest setDataInterval(Integer dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public Integer getDataInterval() {
        return this.dataInterval;
    }

    public GetBalanceBandwidthDataRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
