// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnSslServerLogsRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VpnSslServerId")
    public String vpnSslServerId;

    @NameInMap("SslVpnClientCertId")
    public String sslVpnClientCertId;

    @NameInMap("From")
    public Integer from;

    @NameInMap("To")
    public Integer to;

    @NameInMap("MinutePeriod")
    public Integer minutePeriod;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeVpnSslServerLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnSslServerLogsRequest self = new DescribeVpnSslServerLogsRequest();
        return TeaModel.build(map, self);
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

    public DescribeVpnSslServerLogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVpnSslServerLogsRequest setVpnSslServerId(String vpnSslServerId) {
        this.vpnSslServerId = vpnSslServerId;
        return this;
    }
    public String getVpnSslServerId() {
        return this.vpnSslServerId;
    }

    public DescribeVpnSslServerLogsRequest setSslVpnClientCertId(String sslVpnClientCertId) {
        this.sslVpnClientCertId = sslVpnClientCertId;
        return this;
    }
    public String getSslVpnClientCertId() {
        return this.sslVpnClientCertId;
    }

    public DescribeVpnSslServerLogsRequest setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public DescribeVpnSslServerLogsRequest setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

    public DescribeVpnSslServerLogsRequest setMinutePeriod(Integer minutePeriod) {
        this.minutePeriod = minutePeriod;
        return this;
    }
    public Integer getMinutePeriod() {
        return this.minutePeriod;
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

}
