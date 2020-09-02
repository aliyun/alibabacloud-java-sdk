// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ReplaceVpcDhcpOptionsSetRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DhcpOptionsSetId")
    @Validation(required = true)
    public String dhcpOptionsSetId;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static ReplaceVpcDhcpOptionsSetRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceVpcDhcpOptionsSetRequest self = new ReplaceVpcDhcpOptionsSetRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceVpcDhcpOptionsSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReplaceVpcDhcpOptionsSetRequest setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
        return this;
    }
    public String getDhcpOptionsSetId() {
        return this.dhcpOptionsSetId;
    }

    public ReplaceVpcDhcpOptionsSetRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ReplaceVpcDhcpOptionsSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ReplaceVpcDhcpOptionsSetRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
