// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribePayAsYouGoPriceRequest extends TeaModel {
    @NameInMap("GatewayClass")
    public String gatewayClass;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribePayAsYouGoPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePayAsYouGoPriceRequest self = new DescribePayAsYouGoPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePayAsYouGoPriceRequest setGatewayClass(String gatewayClass) {
        this.gatewayClass = gatewayClass;
        return this;
    }
    public String getGatewayClass() {
        return this.gatewayClass;
    }

    public DescribePayAsYouGoPriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePayAsYouGoPriceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
