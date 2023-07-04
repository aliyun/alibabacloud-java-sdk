// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeCommonBandwidthPackagesRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run. The system checks the required parameters, request syntax, and instance status. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**: performs a dry run and sends the request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed. This is the default value.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to enable Anti-DDoS Pro/Premium. Valid values:</p>
     * <br>
     * <p>*   **false**: disables Anti-DDoS Pro/Premium. This is the default value.</p>
     * <p>*   **true**: enables Anti-DDoS Pro/Premium.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the EIP bandwidth plan.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of entries to return on each page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("SecurityProtectionEnabled")
    public Boolean securityProtectionEnabled;

    @NameInMap("Tag")
    public java.util.List<DescribeCommonBandwidthPackagesRequestTag> tag;

    public static DescribeCommonBandwidthPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonBandwidthPackagesRequest self = new DescribeCommonBandwidthPackagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCommonBandwidthPackagesRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public DescribeCommonBandwidthPackagesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeCommonBandwidthPackagesRequest setIncludeReservationData(Boolean includeReservationData) {
        this.includeReservationData = includeReservationData;
        return this;
    }
    public Boolean getIncludeReservationData() {
        return this.includeReservationData;
    }

    public DescribeCommonBandwidthPackagesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCommonBandwidthPackagesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCommonBandwidthPackagesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCommonBandwidthPackagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCommonBandwidthPackagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCommonBandwidthPackagesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCommonBandwidthPackagesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeCommonBandwidthPackagesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCommonBandwidthPackagesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCommonBandwidthPackagesRequest setSecurityProtectionEnabled(Boolean securityProtectionEnabled) {
        this.securityProtectionEnabled = securityProtectionEnabled;
        return this;
    }
    public Boolean getSecurityProtectionEnabled() {
        return this.securityProtectionEnabled;
    }

    public DescribeCommonBandwidthPackagesRequest setTag(java.util.List<DescribeCommonBandwidthPackagesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeCommonBandwidthPackagesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeCommonBandwidthPackagesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeCommonBandwidthPackagesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonBandwidthPackagesRequestTag self = new DescribeCommonBandwidthPackagesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeCommonBandwidthPackagesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCommonBandwidthPackagesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
