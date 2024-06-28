// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GrantInstanceToVbrShrinkRequest extends TeaModel {
    /**
     * <p>The VBRs that need to acquire permissions on the VPC. Valid values:</p>
     * <ul>
     * <li><strong>All</strong>: Permissions on the VPC are granted to all VBRs that belong to the specified region and Alibaba Cloud account. In this case, you can leave <strong>VbrInstanceIds</strong> empty.</li>
     * <li><strong>Specify</strong>: Permissions on the VPC are granted to the specified VBRs. <strong>VbrInstanceIds</strong> must be assigned a value.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("GrantType")
    public String grantType;

    /**
     * <p>The ID of the VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1lqhq93q8evjpky****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region where the VPC is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The information about the VBRs.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("VbrInstanceIds")
    public String vbrInstanceIdsShrink;

    /**
     * <p>The ID of the Alibaba Cloud account to which the VBR belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1210123456123456</p>
     */
    @NameInMap("VbrOwnerUid")
    public Long vbrOwnerUid;

    /**
     * <p>The ID of the region where the VBR is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("VbrRegionNo")
    public String vbrRegionNo;

    public static GrantInstanceToVbrShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantInstanceToVbrShrinkRequest self = new GrantInstanceToVbrShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GrantInstanceToVbrShrinkRequest setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }
    public String getGrantType() {
        return this.grantType;
    }

    public GrantInstanceToVbrShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GrantInstanceToVbrShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GrantInstanceToVbrShrinkRequest setVbrInstanceIdsShrink(String vbrInstanceIdsShrink) {
        this.vbrInstanceIdsShrink = vbrInstanceIdsShrink;
        return this;
    }
    public String getVbrInstanceIdsShrink() {
        return this.vbrInstanceIdsShrink;
    }

    public GrantInstanceToVbrShrinkRequest setVbrOwnerUid(Long vbrOwnerUid) {
        this.vbrOwnerUid = vbrOwnerUid;
        return this;
    }
    public Long getVbrOwnerUid() {
        return this.vbrOwnerUid;
    }

    public GrantInstanceToVbrShrinkRequest setVbrRegionNo(String vbrRegionNo) {
        this.vbrRegionNo = vbrRegionNo;
        return this;
    }
    public String getVbrRegionNo() {
        return this.vbrRegionNo;
    }

}
