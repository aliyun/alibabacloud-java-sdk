// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListIpsecServersRequest extends TeaModel {
    /**
     * <p>The ID of the IPsec server.</p>
     * 
     * <strong>example:</strong>
     * <p>iss-bp1bo3xuvcxo7ixll****</p>
     */
    @NameInMap("IpsecServerId")
    public java.util.List<String> ipsecServerId;

    /**
     * <p>The name of the IPsec server.</p>
     * <p>The name must be 1 to 100 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("IpsecServerName")
    public String ipsecServerName;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>20</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If this is your first request and no next requests are to be performed, you do not need to specify this parameter.</li>
     * <li>You must specify the token that is obtained from the previous query as the value of <strong>NextToken</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the IPsec server is created.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the IPsec server belongs.</p>
     * <p>The IPsec server has the same resource group as its associated VPN gateway instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2526915.html">DescribeVpnGateway</a> operation to query the ID of the resource group to which the VPN gateway instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzs372yg****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the VPN gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>vpn-bp1q8bgx4xnkm2ogj****</p>
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

    public ListIpsecServersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListIpsecServersRequest setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

}
