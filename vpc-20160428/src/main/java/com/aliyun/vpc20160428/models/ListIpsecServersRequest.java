// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListIpsecServersRequest extends TeaModel {
    @NameInMap("IpsecServerId")
    public java.util.List<String> ipsecServerId;

    /**
     * <p>The name of the IPsec server.</p>
     * <br>
     * <p>The name must be 1 to 100 characters in length, and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("IpsecServerName")
    public String ipsecServerName;

    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **20**. Default value: **10**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query or no subsequent query is to be sent, ignore this parameter.</p>
     * <p>*   If a subsequent query is to be sent, set the value to the value of **NextToken** that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the IPsec server is created.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the VPN gateway.</p>
     */
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
