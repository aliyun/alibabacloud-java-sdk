// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnClientCertsRequest extends TeaModel {
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

    @NameInMap("SslVpnServerId")
    public String sslVpnServerId;

    @NameInMap("SslVpnClientCertId")
    public String sslVpnClientCertId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeSslVpnClientCertsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSslVpnClientCertsRequest self = new DescribeSslVpnClientCertsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSslVpnClientCertsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSslVpnClientCertsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSslVpnClientCertsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSslVpnClientCertsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSslVpnClientCertsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSslVpnClientCertsRequest setSslVpnServerId(String sslVpnServerId) {
        this.sslVpnServerId = sslVpnServerId;
        return this;
    }
    public String getSslVpnServerId() {
        return this.sslVpnServerId;
    }

    public DescribeSslVpnClientCertsRequest setSslVpnClientCertId(String sslVpnClientCertId) {
        this.sslVpnClientCertId = sslVpnClientCertId;
        return this;
    }
    public String getSslVpnClientCertId() {
        return this.sslVpnClientCertId;
    }

    public DescribeSslVpnClientCertsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSslVpnClientCertsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSslVpnClientCertsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
