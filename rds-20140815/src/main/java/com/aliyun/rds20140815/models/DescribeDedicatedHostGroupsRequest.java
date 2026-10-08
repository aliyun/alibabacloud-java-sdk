// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostGroupsRequest extends TeaModel {
    /**
     * <p>The dedicated cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dhg-7a9xxxxxxxx</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>The host image based on which you want to query dedicated clusters. Valid values:</p>
     * <ul>
     * <li><strong>WindowsWithMssqlStdLicense</strong>: Windows (with SQL Server Standard Edition license).</li>
     * <li><strong>WindowsWithMssqlEntLisence</strong>: Windows (with SQL Server Enterprise Edition license).</li>
     * <li><strong>WindowsWithMssqlWebLisence</strong>: Windows (with SQL Server Web Edition license).</li>
     * <li><strong>AliLinux</strong>: Linux.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WindowsWithMssqlStdLicense</p>
     */
    @NameInMap("ImageCategory")
    public String imageCategory;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query available region IDs.</p>
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

    public static DescribeDedicatedHostGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostGroupsRequest self = new DescribeDedicatedHostGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostGroupsRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DescribeDedicatedHostGroupsRequest setImageCategory(String imageCategory) {
        this.imageCategory = imageCategory;
        return this;
    }
    public String getImageCategory() {
        return this.imageCategory;
    }

    public DescribeDedicatedHostGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDedicatedHostGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDedicatedHostGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDedicatedHostGroupsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
