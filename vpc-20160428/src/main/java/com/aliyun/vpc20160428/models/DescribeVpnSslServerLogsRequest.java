// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnSslServerLogsRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query. The value must be a unix timestamp. For example, 1600738962 specifies 09:42:42 (UTC+8) on September 22, 2020.</p>
     * <br>
     * <p>>  If you specify **From**, you must also specify **To** or **MinutePeriod**.</p>
     */
    @NameInMap("From")
    public Integer from;

    /**
     * <p>The interval at which log data is queried. Unit: minutes.</p>
     * <br>
     * <p>>  If both **From** and **To** are not specified, you must specify **MinutePeriod**.</p>
     */
    @NameInMap("MinutePeriod")
    public Integer minutePeriod;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the SSL server is created. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
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
     * <p>The ID of the SSL client certificate.</p>
     */
    @NameInMap("SslVpnClientCertId")
    public String sslVpnClientCertId;

    /**
     * <p>The end of the time range to query. The value must be a unix timestamp. For example, 1600738962 specifies 09:42:42 (UTC+8) on September 22, 2020.</p>
     * <br>
     * <p>>  If you specify **To**, you must also specify **From** or **MinutePeriod**.</p>
     */
    @NameInMap("To")
    public Integer to;

    /**
     * <p>The ID of the SSL server.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpnSslServerId")
    public String vpnSslServerId;

    public static DescribeVpnSslServerLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnSslServerLogsRequest self = new DescribeVpnSslServerLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpnSslServerLogsRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public DescribeVpnSslServerLogsRequest setMinutePeriod(Integer minutePeriod) {
        this.minutePeriod = minutePeriod;
        return this;
    }
    public Integer getMinutePeriod() {
        return this.minutePeriod;
    }

    public DescribeVpnSslServerLogsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeVpnSslServerLogsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVpnSslServerLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpnSslServerLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpnSslServerLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVpnSslServerLogsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeVpnSslServerLogsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeVpnSslServerLogsRequest setSslVpnClientCertId(String sslVpnClientCertId) {
        this.sslVpnClientCertId = sslVpnClientCertId;
        return this;
    }
    public String getSslVpnClientCertId() {
        return this.sslVpnClientCertId;
    }

    public DescribeVpnSslServerLogsRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

    public DescribeVpnSslServerLogsRequest setVpnSslServerId(String vpnSslServerId) {
        this.vpnSslServerId = vpnSslServerId;
        return this;
    }
    public String getVpnSslServerId() {
        return this.vpnSslServerId;
    }

}
