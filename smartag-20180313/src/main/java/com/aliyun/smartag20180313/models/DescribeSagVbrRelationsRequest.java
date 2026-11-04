// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagVbrRelationsRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the Smart Access Gateway instance. You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the regions supported by Smart Access Gateway and their corresponding region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The instance IDs of the virtual border routers (VBRs) used for routing. You can query multiple VBR instance IDs at a time. The maximum value of N is <strong>20</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-bp15ihkk93ezxppkd****</p>
     */
    @NameInMap("VbrInstanceIds")
    public java.util.List<String> vbrInstanceIds;

    /**
     * <p>The region ID of the virtual border router (VBR) instance. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("VbrRegionId")
    public String vbrRegionId;

    public static DescribeSagVbrRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagVbrRelationsRequest self = new DescribeSagVbrRelationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSagVbrRelationsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSagVbrRelationsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSagVbrRelationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSagVbrRelationsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSagVbrRelationsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSagVbrRelationsRequest setVbrInstanceIds(java.util.List<String> vbrInstanceIds) {
        this.vbrInstanceIds = vbrInstanceIds;
        return this;
    }
    public java.util.List<String> getVbrInstanceIds() {
        return this.vbrInstanceIds;
    }

    public DescribeSagVbrRelationsRequest setVbrRegionId(String vbrRegionId) {
        this.vbrRegionId = vbrRegionId;
        return this;
    }
    public String getVbrRegionId() {
        return this.vbrRegionId;
    }

}
