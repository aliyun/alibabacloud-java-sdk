// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListIpsecServersRequest extends TeaModel {
    @NameInMap("IpsecServerId")
    public java.util.List<String> ipsecServerId;

    @NameInMap("IpsecServerName")
    public String ipsecServerName;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    public static ListIpsecServersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIpsecServersRequest self = new ListIpsecServersRequest();
        return TeaModel.build(map, self);
    }

    public ListIpsecServersRequest setIpsecServerId(java.util.List<String> ipsecServerId) {
        this.ipsecServerId = ipsecServerId;
        return this;
    }
    public java.util.List<String> getIpsecServerId() {
        return this.ipsecServerId;
    }

    public ListIpsecServersRequest setIpsecServerName(String ipsecServerName) {
        this.ipsecServerName = ipsecServerName;
        return this;
    }
    public String getIpsecServerName() {
        return this.ipsecServerName;
    }

    public ListIpsecServersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpsecServersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpsecServersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListIpsecServersRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

}
