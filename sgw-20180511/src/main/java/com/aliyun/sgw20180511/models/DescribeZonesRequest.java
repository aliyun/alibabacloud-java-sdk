// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeZonesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesRequest self = new DescribeZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeZonesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
