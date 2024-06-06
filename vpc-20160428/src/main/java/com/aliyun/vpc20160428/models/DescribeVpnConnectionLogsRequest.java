// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnConnectionLogsRequest extends TeaModel {
    /**
     * <p>The start time of the flow log. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>>  If you specify **From**, you must specify **To** or **MinutePeriod**.</p>
     */
    @NameInMap("From")
    public Integer from;

    /**
     * <p>The interval at which log data is collected. Valid values: **1** to **10**. Unit: minutes.</p>
     * <br>
     * <p>>  If you do not specify **From** and **To**, you must specify **MinutePeriod**.</p>
     */
    @NameInMap("MinutePeriod")
    public Integer minutePeriod;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: **1** to **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the IPsec-VPN connection.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The end time of the flow log. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>>  If you specify **To**, you must specify **From** or **MinutePeriod**.</p>
     */
    @NameInMap("To")
    public Integer to;

    /**
     * <p>The ID of the IPsec-VPN connection.</p>
     * <br>
     * <p>This parameter is available only for a dual-tunnel IPsec-VPN connection.</p>
     */
    @NameInMap("TunnelId")
    public String tunnelId;

    /**
     * <p>The ID of the IPsec-VPN connection.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpnConnectionId")
    public String vpnConnectionId;

    public static DescribeVpnConnectionLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnConnectionLogsRequest self = new DescribeVpnConnectionLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpnConnectionLogsRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public DescribeVpnConnectionLogsRequest setMinutePeriod(Integer minutePeriod) {
        this.minutePeriod = minutePeriod;
        return this;
    }
    public Integer getMinutePeriod() {
        return this.minutePeriod;
    }

    public DescribeVpnConnectionLogsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeVpnConnectionLogsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVpnConnectionLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpnConnectionLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpnConnectionLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVpnConnectionLogsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeVpnConnectionLogsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeVpnConnectionLogsRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

    public DescribeVpnConnectionLogsRequest setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }
    public String getTunnelId() {
        return this.tunnelId;
    }

    public DescribeVpnConnectionLogsRequest setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
        return this;
    }
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

}
