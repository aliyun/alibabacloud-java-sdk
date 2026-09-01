// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnSslServerLogsRequest extends TeaModel {
    /**
     * <p>The start time of the log. Only UNIX timestamps in seconds are supported. For example, 1600738962 represents 2020-09-22 09:42:42.</p>
     * <blockquote>
     * <p>If you specify <strong>From</strong>, you must also specify <strong>To</strong> or <strong>MinutePeriod</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1600738962</p>
     */
    @NameInMap("From")
    public Integer from;

    /**
     * <p>The log period. Unit: minutes.</p>
     * <blockquote>
     * <p>If you do not specify <strong>From</strong> or <strong>To</strong>, you must specify <strong>MinutePeriod</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MinutePeriod")
    public Integer minutePeriod;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page when using paging. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the SSL server. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the SSL client certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>vsc-m5euof6s5jy8vs5kd****</p>
     */
    @NameInMap("SslVpnClientCertId")
    public String sslVpnClientCertId;

    /**
     * <p>The end time of the log. Only UNIX timestamps in seconds are supported. For example, 1600738962 represents 2020-09-22 09:42:42.</p>
     * <blockquote>
     * <p>If you specify <strong>To</strong>, you must also specify <strong>From</strong> or <strong>MinutePeriod</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1600738962</p>
     */
    @NameInMap("To")
    public Integer to;

    /**
     * <p>The ID of the SSL server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vss-bp155e9yclsg1xgq4****</p>
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
